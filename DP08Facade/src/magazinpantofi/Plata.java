package magazinpantofi;

public class Plata {
    public void proceseazaPlata(double suma, String tipPlata) {
        if (suma <= 0) throw new InvalidPaymentException("Suma invalida!");
        if (tipPlata == null || tipPlata.isEmpty()) throw new InvalidPaymentException("Tip plata invalid!");
        System.out.println("Plata procesata cu " + tipPlata + ": " + suma + " RON");
    }
}
