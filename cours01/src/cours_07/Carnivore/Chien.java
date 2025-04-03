package cours_07.Carnivore;

public class Chien extends Canin{
    private String nom;

    public Chien(int id, int poids, String couleur,String nom){
        super(id,poids,couleur);
        this.nom = nom;
    }

    public void crier(){
        System.out.println("Ouaf");
    }
}
