package cours_07.Carnivore;

/**
 * Classe abstraite représentant tout carnivore,
 * ses propriétés et ses animaux
 */
public abstract class Carnivore {
    private int id;
    protected int poids;
    protected String couleur;

    protected Carnivore(int id, int poids, String couleur){
        this.id = id;
        this.poids = poids;
        this.couleur = couleur;
    }
    public void manger(){
        System.out.println("Je mange de la viande");
    }

    public abstract void bouger();
    public abstract void crier();


}
