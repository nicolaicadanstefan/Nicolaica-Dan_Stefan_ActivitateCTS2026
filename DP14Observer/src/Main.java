package src;

public class Main {
    public static void main(String[] args) {
        StatieMeteo statie = new StatieMeteo();

        Observer telefon = new EcranTelefon();
        Observer smartwatch = new EcranSmartwatch();

        statie.abonareObservator(telefon);
        statie.abonareObservator(smartwatch);

        statie.modificareStare(22.5);
        // Temperatura actuala: 22.5 grade
        // Telefon: temperatura s-a schimbat!
        // Smartwatch: temperatura s-a schimbat!

        statie.dezabonareObservator(smartwatch);

        statie.modificareStare(18.0);
        // Temperatura actuala: 18.0 grade
        // Telefon: temperatura s-a schimbat!
    }
}