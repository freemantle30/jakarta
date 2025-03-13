package cours_03.Ex03;

import java.util.Objects;

public class Hospital {
    private final int id;
    private String name;
    private String canton;
    private int nombreDeLitsTotal;
    private int nombreDePatientsHospitalized;


    // Le constructeur
    public Hospital(int id, String name, String canton, int nombreDeLitsTotal) {
        this.id = id;
        this.name = name;
        this.canton = canton;
        this.nombreDeLitsTotal = nombreDeLitsTotal;
        this.nombreDePatientsHospitalized = 0;
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
     * @param nombreDePatientsHospitalized int -> le nombre de patients hospitalisés actuellement
     */
    public void setNBHospitalizedPatients(int nombreDePatientsHospitalized) {
        this.nombreDePatientsHospitalized = nombreDePatientsHospitalized;
    }

    /**
     *
     * @return String -> Impression de la classe Hospital
     */
    @Override
    public String toString(){
        if (Objects.equals(canton, "GE"))
        {
            return "Cet Hôpital est Genevois. \n"
                    + this.name + " est représenté par l'ID " + this.id + ", il possède " + this.nombreDeLitsTotal + " lits au total. \n"
                    + this.nombreDePatientsHospitalized + " patients sont hospitalisés actuellement";
        }
        else{
            return this.name + " est représenté par l'ID " + this.id + ", il possède " + this.nombreDeLitsTotal + " lits au total. \n"
                    +"Il est situé dans le canton " +this.canton +","+ this.nombreDePatientsHospitalized + " patients sont hospitalisés actuellement";
        }
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
        return nombreDeLitsTotal -nombreDePatientsHospitalized;
    }

    /**
     *  Compare deux instances de la classe Hospital
     * @param h1
     * @return boolean
     */
    public boolean equals(@org.jetbrains.annotations.NotNull Hospital h1) {
        return h1.getId() == this.getId();
    }
}
