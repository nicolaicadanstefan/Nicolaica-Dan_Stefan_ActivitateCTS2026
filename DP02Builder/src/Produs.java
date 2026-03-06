package src;

public class Produs {
    private String componenta1;
    private String componenta2;
    private String componenta3;

    public void setcomponenta1(String c) { this.componenta1 = c; }
    public void setcomponenta2(String c) { this.componenta2 = c; }
    public void setcomponenta3(String c) { this.componenta3 = c; }

    public void afisare() {
        System.out.println("Calculator: " + componenta1 + " | " + componenta2 + " | " + componenta3);
    }
}