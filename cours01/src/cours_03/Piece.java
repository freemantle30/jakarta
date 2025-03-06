package cours_03;

public class Piece {

    private double largeur;
    private double longeur;
    private static double hauteur = 2.3; // static, toutes les pièces ont la même hauteur, par defaut 2.3
    // le static induit aussi la notion que chaque objet de la classe piece a une hauteur de 2m 30

    public Piece(double largeur, double longeur) {
        this.largeur = largeur;
        this.longeur = longeur;
    }

    public String toString() {
        return "Pièce de : " + this.largeur + " x " + this.longeur + ", d'une hauteur de " + this.hauteur +"m";
    }

    public String calculerSurfaceAuSol() {
        return "";
    }
}
