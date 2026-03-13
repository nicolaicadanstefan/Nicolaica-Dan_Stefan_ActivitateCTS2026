package FactoryMethod;

public abstract class Livrare {
    protected int cost;
    protected int timpEstimareMin;
    public abstract int calculeazaCost();

    public abstract void afiseazaDetalii();
}
