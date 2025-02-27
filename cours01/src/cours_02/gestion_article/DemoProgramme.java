package cours_02.gestion_article;

public class DemoProgramme {
    public static void main(String[] args) {
        Article article; // définition d'un article
        article = new Article(1,"PC", 1220.8,11);

        Article article2 = new Article(2,"Clavier", 22,22);
        Article article3 = new Article(3,"Souris", 10.12,14);
        Article article4 = new Article(4,"Ecran", 150,15);

        // utilisation de l'autre constructeur
        Article article5 = new Article(5,"Laptop");

       // ce systemoutprintln va chercher le ToString
        System.out.println(article);
    }
}
