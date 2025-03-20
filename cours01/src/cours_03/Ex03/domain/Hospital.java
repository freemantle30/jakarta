package cours_03.Ex03.domain;

import org.jetbrains.annotations.NotNull;

public class Hospital {
    private Integer id;
    private String name;
    private String canton;
    private Integer nbMaxBeds;
    private int nbHospitalizedPatients;


    /**
     * Default constructor
     * @param id identifier
     * @param name name of the hospital
     * @param canton canton in which the hospital is located
     * @param nbMaxBeds capacity of the hospital
     */
    public Hospital(int id, String name, String canton, int nbMaxBeds) {
        this.id = id;
        this.name = name;
        this.canton = canton;
        this.nbMaxBeds = nbMaxBeds;
        this.nbHospitalizedPatients = 0;
    }

    /**
     *
     * @return int -> l'id de l'Hôpital
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param nbDePatientsHospitalized int -> le nombre de patients hospitalisés actuellement
     */
    public void setNBHospitalizedPatients(int nbDePatientsHospitalized) {
        // on pourrait créer une exception -> on va voir cela plus tard.
        this.nbHospitalizedPatients = nbDePatientsHospitalized;
    }

    /**
     *
     * @return String -> Impression de la classe Hospital
     */
    @Override
    public String toString(){

        return this.name + " est représenté par l'ID " + this.id + ", il possède " + this.nbMaxBeds + " lits au total. \n"
                +"Il est situé dans le canton " +this.canton +","+ this.nbHospitalizedPatients +
                " patients sont hospitalisés actuellement.\n";

    }

    /**
     *
     * @param h1 Hospital -> 1er hopital
     * @param h2 Hospital -> 2e hopital
     * @param h3 Hospital -> 3e hopital
     * @param h4 Hospital -> 4e hopital
     * @return String -> Message annonçant l'hopital ayant le plus de lits disponibles parmi 5
     */
    public String getEmptiestHospital(Hospital h1, Hospital h2, Hospital h3, Hospital h4) {
        Hospital[] hospitals = {this,h1,h2,h3,h4};
        int litsVide = 0;
        Hospital lePlusDeLits = null;
        for (Hospital hosto : hospitals) {
            if (hosto.calculateLitsVide() >= litsVide) {
                lePlusDeLits = hosto;
                litsVide = hosto.calculateLitsVide();
            }
        }
        return  "L'hôpital avec le plus de lits vide est " + lePlusDeLits.name + "\nIl y a " + lePlusDeLits.calculateLitsVide() + " lits vides. " ;
    }

    /**
     *  Calcule le nombre de lits vide dans un hopital
     * @return int -> le nombre
     */
    public int calculateLitsVide(){
        return nbMaxBeds - nbHospitalizedPatients;
    }

    /**
     *  Compare deux instances de la classe Hospital
     * @param h1 une instance de la classe Hospital
     * @return boolean
     */
    public boolean equals(@NotNull Hospital h1) {
        return h1.getId() == this.getId();
    }


}
