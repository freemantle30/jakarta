package cours_07.Carnivore;

public class Chien extends Canin implements ILeachable, ICallable {
    private String nom;

    public Chien(int id, int poids, String couleur,String nom){
        super(id,poids,couleur);
        this.nom = nom;
    }

    public void crier(){
        System.out.println("Ouaf");
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
}
