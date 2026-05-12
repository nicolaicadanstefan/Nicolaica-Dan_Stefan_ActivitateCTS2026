package src;

public abstract class ComponentaAbstracta {
    public abstract void metodaSpecifica();

    public void adaugaNod(ComponentaAbstracta nod) {
        throw new UnsupportedOperationException();
    }

    public void stergeNod(ComponentaAbstracta nod) {
        throw new UnsupportedOperationException();
    }

    public ComponentaAbstracta getNodCopil(int index) {
        throw new UnsupportedOperationException();
    }
}