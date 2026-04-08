public class Vizitator {
    private String nume;
    public boolean areScrisoare;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Vizitator(String nume, boolean areScrisoare) {
        this.nume = nume;
        this.areScrisoare = areScrisoare;
    }

    public boolean areScrisoare(Vizitator vizitator) {
        boolean scrisoare;
        return scrisoare = vizitator.areScrisoare;
    }
}
