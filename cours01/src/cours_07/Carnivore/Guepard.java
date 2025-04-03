package cours_07.Carnivore;

public class Guepard extends Felin{
    public Guepard(int id, int poids, String couleur) {
        super(id,poids,couleur,Boolean.FALSE);
    }

    public void bouger(){
        System.out.println("Bouger Guepard");
    }

    public void crier(){
        System.out.println("Crier Guepard");
    }
}
