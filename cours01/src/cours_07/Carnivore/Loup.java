package cours_07.Carnivore;

public class Loup extends Canin {
    public Loup(int id, int poids, String couleur) {
        super(id, poids, couleur);
    }

    public void crier(){
        System.out.println("Je hurle");
    }

}
