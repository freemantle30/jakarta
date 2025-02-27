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
    public Article(int num, String nom, double prix, int stock) {}




}
