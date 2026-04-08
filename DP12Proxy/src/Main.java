public class Main {
    static void main() {
        ISpital spital = new ProxySpital(new Spital());

        Vizitator v1 = new Vizitator("Ana", true);
        Vizitator v2 = new Vizitator("Ion", true);
        Vizitator v3 = new Vizitator("Maria", true);
        Vizitator v4 = new Vizitator("George", false);

        spital.viziteaza(v1);
        spital.viziteaza(v2);
        spital.viziteaza(v3);
        spital.viziteaza(v4);
    }
}