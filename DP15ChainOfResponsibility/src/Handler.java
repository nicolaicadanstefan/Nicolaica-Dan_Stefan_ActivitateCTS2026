package src;

public abstract class Handler {
    private Handler succesor;

    public void setSuccesor(Handler succesor) {
        this.succesor = succesor;
    }

    public Handler getSuccesor() {
        return succesor;
    }

    public abstract void gestioneazaCerere(int zile);
}