package cours_01.langage;

public class Ex01 {
    public static void afficherNbPairs(int nbMax){
        for (int nb=0, cpt=0; nb <= nbMax; nb+=2)
        {
            System.out.print(nb + "     ");
            cpt++;
            if (cpt == 10){
                System.out.println();
                cpt = 0;
            }
        }
    }
    public static void sommeNbEntiers(int nbMax){
        // merci Gauss
       int N = (nbMax+1)*nbMax;
      System.out.println("La somme de 1 à "+nbMax+" est "+ N/2);
    }
}
