package cours_03.Ex03.domain;

import org.jetbrains.annotations.NotNull;

public class Hospital {
    private Integer id;
    private String name;
    private String canton;
    private Integer nbMaxBeds;
    private int nbHospitalizedPatients;
    private double solde;


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

    public void setAccountValue(double solde){
        this.solde = solde;
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

    public boolean hasDebt(){
        return !(solde < 0);
    }

    public boolean plusPetitBudget(Hospital hospital){
        return this.solde < hospital.solde;
    }
}
