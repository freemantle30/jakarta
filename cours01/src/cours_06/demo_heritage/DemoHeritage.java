package cours_06.demo_heritage;

public class DemoHeritage {

    public static void main(String[] args) {

        Personne p = new Personne(1, "John");
        Employe e = new Employe(2,"Stubi","IT");
        // Virement de Cisco
        Client c = new Client(3,"Seydoux",999999.43);

        System.out.println(p);
        System.out.println(e);
        System.out.println(c);

    }
}
