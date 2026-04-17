public class Expeditie {
    private Strategy strategie;

    public void setStrategie(Strategy strategie) {
        this.strategie = strategie;
    }

    public void operatie() {
        strategie.algoritm();
    }
}