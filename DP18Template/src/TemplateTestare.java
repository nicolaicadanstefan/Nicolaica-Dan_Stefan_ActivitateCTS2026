package src;

public abstract class TemplateTestare {

    public final void testeaza() {
        definesteUnitateTestare();
        definesteDateIntrare();
        definesteRezultate();
        ruleazaUnitate();
        afisareRezultatTest();
    }

    public abstract void definesteUnitateTestare();
    public abstract void definesteDateIntrare();
    public abstract void definesteRezultate();
    public abstract void ruleazaUnitate();
    public abstract void afisareRezultatTest();
}