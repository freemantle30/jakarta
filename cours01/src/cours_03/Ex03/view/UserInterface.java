package cours_03.Ex03.view;

import cours_03.Ex03.domain.Hospital;

public class UserInterface {
    public static void show(Hospital h1, Hospital h2) {

        System.out.println("===========================================");
        System.out.println(h1);
        System.out.println("===========================================");

        System.out.println("Est ce que le chuv et les hugs sont le même hôpital ? :");
        System.out.print(hug.equals(chuv));


        // output ex 5
//        System.out.println("===========================================");
//        HospitalManager.displayHospitals();
//        System.out.println("Il y a "+manager.sumAvailableBeds()+" lits disponibles dans notre réseau hospitalier");
//        System.out.println(manager.averageBeds());
//        System.out.println("L'hopital hug est-il notre application ? "+manager.isIn(hug));
        //System.out.println(manager.hasDebt());
        //System.out.println(manager.plusPauvre);
    }
}
