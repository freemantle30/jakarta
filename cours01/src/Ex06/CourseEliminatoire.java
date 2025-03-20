package Ex06;

/**
 * Application de gestion d'une Course Eliminatoire
 *
 * @author (votre nom)
 */
public class CourseEliminatoire
{
    /* Méthode principale de l'application : À COMPLÉTER */
    public static void main(String[] args) {
        System.out.println("Nombre de coureurs inscrits : ");
        System.out.println("Nombre de coureurs classés : ");
        System.out.println("Temps moyen calculé : ");
        System.out.println("Nombre de coureurs sélectionnés : ");
        System.out.println("Liste des coureurs sélectionnés : ");

        int nbDossards = Bdd.listeDossards().length;
    }

}