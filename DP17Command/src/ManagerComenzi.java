package src;

public class ManagerComenzi {
    private Comanda comanda;

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public void apasaButon() {
        comanda.executa();
    }
}