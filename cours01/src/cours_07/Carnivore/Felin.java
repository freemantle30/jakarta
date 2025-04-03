package cours_07.Carnivore;

public abstract class Felin extends Carnivore{
    protected Boolean griffesRetractiles;

    protected Felin(int id, int poids, String couleur, Boolean griffesRetractiles) {
        super(id, poids, couleur);
        this.griffesRetractiles = griffesRetractiles;
    }


    public void bouger() {
        System.out.println("Bouger");
    }
}
