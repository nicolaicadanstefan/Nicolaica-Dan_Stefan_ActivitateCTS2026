package magazinpantofi;

public class Main {
    static void main() {
        FacadeMagazinPantofi facadeMagazinPantofi = new FacadeMagazinPantofi();
        facadeMagazinPantofi.tranzactiePantofi("Tenisi_42",42, 100, "Cash", "Bucuresti", "Stefan");
        System.out.println("-------------------");
        try {
            facadeMagazinPantofi.tranzactiePantofi("",0, 0, "Card", "", "");
        } catch (ComandaException e){
            System.out.println("Eroare: " + e.getMessage());
        }
        try {
            facadeMagazinPantofi.tranzactiePantofi("Tenisi_42",0, 0, "Cash", "", "");
        } catch (ComandaException e){
            System.out.println("Eroare: " + e.getMessage());
        }
        try {
            facadeMagazinPantofi.tranzactiePantofi("Tenisi_42",0, 10, "", "", "Stefan");
        } catch (ComandaException e){
            System.out.println("Eroare: " + e.getMessage());
        }
        try {
            facadeMagazinPantofi.tranzactiePantofi("Tenisi_42",0, 10, "Card", "Bucuresti", "");
        } catch (ComandaException e){
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
