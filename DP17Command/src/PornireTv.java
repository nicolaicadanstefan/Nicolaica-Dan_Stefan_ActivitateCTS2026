package src;

public class PornireTv implements Comanda {
    private Executant executant;

    public PornireTv(Executant executant) {
        this.executant = executant;
    }

    @Override
    public void executa() {
        executant.actiune();
        System.out.println("TV pornit.");
    }
}