package cours_03.Ex03;

public class HospitalManager {

    public static void main(String[] args) {
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




        System.out.println(hug);
        System.out.println("===========================================");
        System.out.println(chuv);
        System.out.println("===========================================");
        System.out.println(hug.getEmptiestHospital(chuv,hfr,rhne,hvsp));
        System.out.println("===========================================");
        System.out.println("Est ce que le chuv et les hugs sont le même hôpital ? :");
        System.out.print(hug.equals(chuv));


    }
}
