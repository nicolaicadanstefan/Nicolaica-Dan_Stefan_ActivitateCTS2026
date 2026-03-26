package src.vreme.adapterobiecte;

public class Main {
    public static void main(String[] args) {
        OldWeatherService oldWeatherService = new OldWeatherService();
        WeatherAdapter weatherAdapter = new WeatherAdapter(oldWeatherService);
        System.out.println(weatherAdapter.getTemperatureCelsius() + "°C");
    }
}