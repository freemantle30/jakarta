package cours_03;

public class Ex2 {
    public static void main(String[] args) {
        Piece piece = new Piece(3.5, 3.5);
        System.out.println(piece);
        System.out.println(" -sufrace au sol"+ piece.calculerSurfaceAuSol() +" m2");
    }
}
