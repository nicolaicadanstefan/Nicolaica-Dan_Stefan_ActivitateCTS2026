package magazinpantofi;

public class Notificari {
    public void trimiteNotificarea(String nume) {
        if (nume == null || nume.isEmpty()) throw new ComandaException("Nume invalid!");
        System.out.println("Comanda plasata cu succes pe numele: " + nume);
    }
}
