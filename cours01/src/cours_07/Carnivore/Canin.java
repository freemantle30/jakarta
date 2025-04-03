package cours_07.Carnivore;

public abstract class Canin extends Carnivore{
    protected Canin(int id, int poids, String couleur) {
        super(id, poids, couleur);
    }

    public void bouger(){
        System.out.println("Je bouge comme un canin");
    }
}
