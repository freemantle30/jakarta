package cours_02.gestion_article;

/**
 * Class Article : capsule pour es donn&eacute;es/attributs/propri&eacute;t&eacute;s
 * et leurs traitements et m&eacute;thodes
 * on d&eacute;finit ses attributs/propri&eacute;t&eacute;s en privazte (saug exception)
 * - un ou plusieurs constructeurs  => pour initaliser les attributs de l'instance
 * ce constructeur est appel&eacute; &agrave; chaque instruction new Article()
 * - on c&eacute;ree des instances en faisant des new Article() => ce qui appelle le constructeur
 * tous les attributs/m&eacute;thodes  NE SONT PAS static (sauf exceptions)
 *
 * @author Eliott Wiggins - HEG-Gen&egrave;ve
 */
public class Article {

    // 1) définition des attributs/propriétés/ cjamps de chaque Articles
    // ============================================================
    private int num;
    private String nom;
    private double prix;
    private int stock;

    // 2) définitions du/des constructeurs : méthode appelée lors de la création d'une nouvelle instance (new)
    // creation d'une nouvelle instance (new)
    // =================
    // porte le même nom que la classe
    // son code est exécuté au moment de la création d'une instance (new)
    // - responsabilité : initialiser l'instance, en particulier ses attributs
    public Article(int num, String nom, double prix, int stock) {
        this.num = num;
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }

    public Article(int num, String nom){
        this.num = num;
        this.nom = nom;
    }

    // responsabilité importante de toutes les classes
    // =================================
    // 3) la méthode toString() : retourne le contenu de l'instance
    // sous forme d'un string
    public String toString()
    {
        return "Article num: " + num + ", Nom: " + nom + ", prix: " + prix + ", stock: " + stock;
    }

    // méthode equals
    // 4) tout objet est capable de dire s'il est ou non
    // égal à un autre
   //public boolean equals(Article article1)
    //{
        // si la règle de gestion indique que deux articles ayant le même numéro doivent
        // être considéré comme indentique
        // on peut ne tester que l'égalité du numéro

     //   return (this.num == article1.num);
    //}

    // ======================================================
    //Méthodes nécessares au traitement de l'article

    // Définition de Getter : méthodes d'accès aux attributs
    public int getNum() { return num; }
    public String getNom() { return nom; }
    public double getPrix() { return prix; }
    public int getStock() { return stock; }

    // Définition de Setter : méthode de miste à jour des attributs
    // ==> permettent de modifier les valeurs des attiburs


    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void achete(int nb) {
        this.stock += nb;
    }
    public void vendre(int nb) {
        this.stock -= nb;
    }
}
