package src;

public class Manager extends Handler {
    @Override
    public void gestioneazaCerere(int zile) {
        if (zile <= 7) {
            System.out.println("Managerul a aprobat cererea de " + zile + " zile.");
        } else if (getSuccesor() != null) {
            System.out.println("Managerul nu poate aproba. Trimite mai departe...");
            getSuccesor().gestioneazaCerere(zile);
        } else {
            System.out.println("Cererea de " + zile + " zile nu a putut fi aprobata.");
        }
    }
}