package cours_03.Ex03.managers;
import cours_03.Ex03.controllers.DisplayController;
import cours_03.Ex03.domain.Hospital;

import java.util.*;

public class HospitalManager {
    static ArrayList<Hospital> hospitals = new ArrayList<>();



    public static void displayHospitals(){
        for (Hospital hospital : hospitals) {
           System.out.println(hospital);
        }
    }

    public static int sumAvailableBeds(ArrayList<Hospital> hospitals) {
        int sumAvailableBeds = 0;
        for (Hospital hospital : hospitals) {
            sumAvailableBeds += hospital.calculateLitsVide();
        }
        return sumAvailableBeds;
    }

    public static float averageBeds(ArrayList<Hospital> hospitals){
        return  sumAvailableBeds(hospitals) /hospitals.size();
    }



    public static boolean isIn(Hospital h, ArrayList<Hospital> hospitals) {
        return hospitals.contains(h);
    }

    public boolean areAllIn(ArrayList<Hospital> hospitals1, ArrayList<Hospital> hospitals2) {
       boolean flag = true;
       for (Hospital h : hospitals1) {
           flag = hospitals2.contains(h);
           // on casse la boucle
           if (!flag) return flag;
       }
       return flag;
    }

    public static ArrayList<Hospital> existDebt(ArrayList<Hospital> hospitals) {
        ArrayList<Hospital> hospitalsInDebt = new ArrayList<>();
        for (Hospital h : hospitals) {
            if (h.hasDebt()){
                hospitalsInDebt.add(h);
            }
        }
        return hospitalsInDebt;
    }

    public static ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public static Hospital thePooretHospital(ArrayList<Hospital> hospitals) {
        Hospital thePoorest = hospitals.get(0);
        for (int i = 1; i < hospitals.size(); i++) {
            if (hospitals.get(i).plusPetitBudget(thePoorest)){
                thePoorest = hospitals.get(i);
            }
        }
        return thePoorest;
    }

    public static boolean isIn(ArrayList<Hospital> hospitals, Hospital h) {
        return true;
    }

//    public static ArrayList<Hospital> getHospitalsFromCanton(ArrayList<Hospital> hospitals, String canton) {
//        ArrayList<Hospital> hospitalsFromCanton = new ArrayList<>();
//        for (Hospital h : hospitals) {
//            if (canton != null && h.get)
//        }
//    }

    public static void launch() {
        // Initialisation de la classe manager


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
        hospitals.add(hug);
        hospitals.add(chuv);
        hospitals.add(hfr);
        hospitals.add(rhne);
        hospitals.add(hvsp);



        // initialiser
        hug.setAccountValue(-22203.5);
        chuv.setAccountValue(222.4);
        hfr.setAccountValue(10000.3);
        rhne.setAccountValue(-1003.5);
        hvsp.setAccountValue(5500);

       // isIn(new Hospital(9),hospitals);

        DisplayController.display(hug,chuv);



    }

}
