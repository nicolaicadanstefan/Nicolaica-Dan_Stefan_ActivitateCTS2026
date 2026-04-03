package magazinpantofi;

public class FacadeMagazinPantofi {
    Inventar inventar = new Inventar();
    Plata plata = new Plata();
    Livrare livrare = new Livrare();
    Notificari notificari = new Notificari();

    public void tranzactiePantofi(String tip, int numar, double suma, String tipPlata, String adresa, String nume) {
        inventar.verificaStoc(tip, numar);
        plata.proceseazaPlata(suma, tipPlata);
        livrare.proceseazaLivrarea(adresa);
        notificari.trimiteNotificarea(nume);
    }
}
