package src;

public class TestareJUnit extends TemplateTestare {
    @Override
    public void definesteUnitateTestare() {
        System.out.println("[JUnit] Defineste unitate testare");
    }

    @Override
    public void definesteDateIntrare() {
        System.out.println("[JUnit] Defineste date intrare");
    }

    @Override
    public void definesteRezultate() {
        System.out.println("[JUnit] Defineste rezultate asteptate");
    }

    @Override
    public void ruleazaUnitate() {
        System.out.println("[JUnit] Ruleaza unitatea de test");
    }

    @Override
    public void afisareRezultatTest() {
        System.out.println("[JUnit] Afisare rezultat: PASSED");
    }
}