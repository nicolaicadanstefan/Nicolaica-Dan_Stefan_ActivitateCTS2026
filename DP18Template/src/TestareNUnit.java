package src;

public class TestareNUnit extends TemplateTestare {
    @Override
    public void definesteUnitateTestare() {
        System.out.println("[NUnit] Defineste unitate testare");
    }

    @Override
    public void definesteDateIntrare() {
        System.out.println("[NUnit] Defineste date intrare");
    }

    @Override
    public void definesteRezultate() {
        System.out.println("[NUnit] Defineste rezultate asteptate");
    }

    @Override
    public void ruleazaUnitate() {
        System.out.println("[NUnit] Ruleaza unitatea de test");
    }

    @Override
    public void afisareRezultatTest() {
        System.out.println("[NUnit] Afisare rezultat: PASSED");
    }
}