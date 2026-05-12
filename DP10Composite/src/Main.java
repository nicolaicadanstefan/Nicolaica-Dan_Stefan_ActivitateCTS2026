package src;

// Main
public class Main {
    public static void main(String[] args) {

        ComponentaAbstracta angajat1 = new NodFrunza("Ana");
        ComponentaAbstracta angajat2 = new NodFrunza("Mihai");
        ComponentaAbstracta angajat3 = new NodFrunza("Ion");
        ComponentaAbstracta angajat4 = new NodFrunza("Maria");

        Composite depIT = new Composite("IT");
        depIT.adaugaNod(angajat1);
        depIT.adaugaNod(angajat2);

        Composite depHR = new Composite("HR");
        depHR.adaugaNod(angajat3);
        depHR.adaugaNod(angajat4);

        Composite companie = new Composite("Compania XYZ");
        companie.adaugaNod(depIT);
        companie.adaugaNod(depHR);

        companie.metodaSpecifica();
    }
}