package magazinpantofi;

public class Livrare {
    public void proceseazaLivrarea(String adresa) {
        if (adresa == null || adresa.isEmpty()) throw new InvalidDeliveryAddressException("Adresa invalida!");
        System.out.println("Comanda se va livra la adresa: " + adresa);
    }
}