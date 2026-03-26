package src.vreme.adapterclase;

public class Main {
    public static void main(String[] args) {
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        System.out.println(weatherAdapter.getTemperatureCelsius() + "°C");
    }
}