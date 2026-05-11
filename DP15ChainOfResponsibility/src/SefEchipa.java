package src;

public class SefEchipa extends Handler {
    @Override
    public void gestioneazaCerere(int zile) {
        if (zile <= 3) {
            System.out.println("Sef echipa a aprobat cererea de " + zile + " zile.");
        } else if (getSuccesor() != null) {
            System.out.println("Sef echipa nu poate aproba. Trimite mai departe...");
            getSuccesor().gestioneazaCerere(zile);
        } else {
            System.out.println("Cererea de " + zile + " zile nu a putut fi aprobata.");
        }
    }
}