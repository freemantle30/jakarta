//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calendar heg_calendar = new Calendar("HEG");
        Calendar private_calendar = new Calendar("Perso");


        Event prog = new Event("Cours de prog Java", "13 mars 2024", "Batiment B");
        Event bdd = new Event("Cours de BDD", "14 mars 2024", "Batiment B");
        Event cisco = new Event("Cours de réseau", "14 mars 2024", "Batiment F");

        heg_calendar.addEvent(prog);
        heg_calendar.addEvent(bdd);
        heg_calendar.addEvent(cisco);

        Event concert = new Event("Concert de X", "18 mars 2024", "Batiment B");
        Event piano = new Event("Cours de piano", "23 avril 2024", "Batiment B");
        Event allemand = new Event("Cours d'allemand", "24 avril 2024", "Ifage Carouge");

        private_calendar.addEvent(concert);
        private_calendar.addEvent(piano);
        private_calendar.addEvent(allemand);

        System.out.println(heg_calendar);
        System.out.println(private_calendar);

    }
}