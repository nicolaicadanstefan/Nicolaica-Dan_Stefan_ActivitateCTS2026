package src;

public class OprireTv implements Comanda {
    private Executant executant;

    public OprireTv(Executant executant) {
        this.executant = executant;
    }

    @Override
    public void executa() {
        executant.actiune();
        System.out.println("TV oprit.");
    }
}