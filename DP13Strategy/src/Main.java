public class Main {
    public static void main(String[] args) {
        Expeditie expeditie = new Expeditie();

        // Folosim strategia rapida
        expeditie.setStrategie(new LivrareRapida());
        expeditie.operatie();

        // Schimbam strategia din mers
        expeditie.setStrategie(new LivrareStandard());
        expeditie.operatie();
    }
}