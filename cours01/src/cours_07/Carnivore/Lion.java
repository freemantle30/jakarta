package cours_07.Carnivore;

public class Lion extends Felin {
    public Lion(int id, int poids, String couleur) {
        super(id,poids,couleur,Boolean.FALSE);
    }

    public void bouger(){
        System.out.println("Bouger lion");
    }

    public void crier(){
        System.out.println("Crier lion");
    }
}
