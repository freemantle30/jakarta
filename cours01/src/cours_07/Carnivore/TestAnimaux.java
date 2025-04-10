package cours_07.Carnivore;

public class TestAnimaux {
    private static Carnivore[] animaux = new Carnivore[]
            {
                    new Loup(1,35,"Blanc"),
                    new Lion(200,120,"ocre foncée")
            };

    public static void main(String[] args) {
        Loup l = new Loup(1,35,"Gris");
        l.crier();
        System.out.println("Je suis un " + l.getClass().getSimpleName());


    }
}
