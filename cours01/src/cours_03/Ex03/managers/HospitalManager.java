package cours_03.Ex03.managers;
import cours_03.Ex03.domain.Hospital;

import java.util.*;

public class HospitalManager {
    static ArrayList<Hospital> hospitals = new ArrayList<>();

    /**
     * Constructor for the HospitalManager class
     */
    public HospitalManager() {
        hospitals = new ArrayList<>();
    }

    /**
     * Add hospital to the array list
     * @param hospital
     */
    public void addHospital(Hospital hospital) {
        hospitals.add(hospital);
    }

    public String displayHospitals(){
        String hospitalList = "";
        for (Hospital hospital : hospitals) {
            hospitalList += hospital.toString() + "\n";
        }
        return hospitalList;
    }

    public int sumAvailableBeds(){
        int sumAvailableBeds = 0;
        for (Hospital hospital : hospitals) {
            sumAvailableBeds += hospital.calculateLitsVide();
        }
        return sumAvailableBeds;
    }

    public TreeMap<hospitalName,averageBeds> averageBeds(){
        for (Hospital hospital : hospitals) {
            Map.Entry
        }
        return averageBeds/hospitals.size();
   }

    public boolean isIn(Hospital hospital) {
        return hospitals.contains(hospital);
    }

    public boolean isAllIn(HashSet<Hospital> h1, HashSet<Hospital> h2) {
        for (Hospital hospital : h1) {
            if (!h2.contains(hospital)) {
                return false;
            }
        }
        return true;
    }


    public static void launch() {
        // Initialisation de la classe manager
        HospitalManager manager = new HospitalManager();

        // Initialisation des hôpitaux
        Hospital hug = new Hospital(1,"Hôpitaux universitaires de Genève","GE",2083);
        Hospital chuv = new Hospital(2,"CHUV","VD",1568);
        Hospital hfr = new Hospital(3,"Hôpital fribourgeois","FR",734);
        Hospital rhne = new Hospital(4,"Réseau hospitalier neuchâtelois","NE",521);
        Hospital hvsp = new Hospital(5,"Hôpital du Valais","VS",304);

        // Initlisation du nombre des patients aux HUG
        hug.setNBHospitalizedPatients(1082);
        chuv.setNBHospitalizedPatients(955);
        hfr.setNBHospitalizedPatients(623);
        rhne.setNBHospitalizedPatients(476);
        hvsp.setNBHospitalizedPatients(296);

        // ajout des hopitaux dans l'array list
        manager.addHospital(hug);
        manager.addHospital(chuv);
        manager.addHospital(hfr);
        manager.addHospital(rhne);
        manager.addHospital(hvsp);



        // initialiser
        hug.setBudget();
        chuv.setBudget();
        hfr.setBudget();
        // output ex 3
//        System.out.println(hug);
//        System.out.println("===========================================");
//        System.out.println(chuv);
//        System.out.println("===========================================");
//        System.out.println(hug.getEmptiestHospital(chuv,hfr,rhne,hvsp));
//        System.out.println("===========================================");
//        System.out.println("Est ce que le chuv et les hugs sont le même hôpital ? :");
//        System.out.print(hug.equals(chuv));

        // output ex 5
        System.out.println("===========================================");
        System.out.println(manager.displayHospitals());
        System.out.println("Il y a "+manager.sumAvailableBeds()+" lits disponibles dans notre réseau hospitalier");
        System.out.println(manager.averageBeds());
        System.out.println("L'hopital hug est-il notre application ? "+manager.isIn(hug));
        //System.out.println(manager.hasDebt());
        //System.out.println(manager.plusPauvre);
        HashSet<Hospital> reseau2 = new HashSet<>();
        HashSet<Hospital> notreReseau = new HashSet<>(manager.hospitals);
        reseau2.add(rhne);
        reseau2.add(hvsp);

        System.out.println(manager.isAllIn(notreReseau,reseau2));
    }

}
