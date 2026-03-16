package src;

public class Main {
    public static void main(String[] args) {
        // Creem originalele
        Prototype1 razboinicOriginal = new Prototype1("Arthur", 100);
        Prototype2 magicianOriginal = new Prototype2("Merlin", 200);

        // Clonam
        Prototype1 razboinicClonat = (Prototype1) razboinicOriginal.clone();
        Prototype2 magicianClonat = (Prototype2) magicianOriginal.clone();

        razboinicOriginal.afisare();
        razboinicClonat.afisare();

        magicianOriginal.afisare();
        magicianClonat.afisare();

        System.out.println("Obiecte diferite? " + (razboinicOriginal != razboinicClonat));
    }
}