package Singleton;

public class Logger {
    // Instanta privata
    private static Logger instance;

    // Constructor privat
    private Logger() {
        System.out.println("Logger created!");
    }

    // Metoda publica statica pentru a obtine instanta
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // constructorul privat
        }
        return instance;
    }
}
