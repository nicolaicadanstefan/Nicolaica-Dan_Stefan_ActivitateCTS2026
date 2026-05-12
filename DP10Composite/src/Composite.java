package src;

import java.util.ArrayList;
import java.util.List;

public class Composite extends ComponentaAbstracta {
    private String nume;
    private List<ComponentaAbstracta> copii = new ArrayList<>();

    public Composite(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(ComponentaAbstracta nod) {
        copii.add(nod);
    }

    @Override
    public void stergeNod(ComponentaAbstracta nod) {
        copii.remove(nod);
    }

    @Override
    public ComponentaAbstracta getNodCopil(int index) {
        return copii.get(index);
    }

    @Override
    public void metodaSpecifica() {
        System.out.println("Departament: " + nume);
        for (ComponentaAbstracta copil : copii) {
            copil.metodaSpecifica();  // recursivitate!
        }
    }
}