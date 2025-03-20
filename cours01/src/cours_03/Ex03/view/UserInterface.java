package cours_03.Ex03.view;

import cours_03.Ex03.domain.Hospital;
import cours_03.Ex03.managers.HospitalManager;

public class UserInterface {
    public static void show(Hospital h1, Hospital h2) {

        System.out.println("===========================================");
        System.out.println(h1);
        System.out.println("===========================================");
        System.out.println(h2);




        // output ex 5
//        System.out.println("===========================================");

//        System.out.println("Il y a "+manager.sumAvailableBeds()+" lits disponibles dans notre réseau hospitalier");
        System.out.println(HospitalManager.averageBeds(HospitalManager.getHospitals()));
        System.out.println("===========================================");
        System.out.println("Is there a Hospital with debts ? "+HospitalManager.existDebt(HospitalManager.getHospitals()).size());
        System.out.println("==========================================");
        System.out.println("L'hopital hug est-il dans notre application ? "+HospitalManager.isIn(HospitalManager.getHospitals(),h1));

        //System.out.println(manager.plusPauvre);
    }
}
