package src.vreme.adapterobiecte;

public class WeatherAdapter implements WeatherProvider {
    public OldWeatherService oldWeatherService;

    @Override
    public Double getTemperatureCelsius() {
        return ((oldWeatherService.getTemperatureFahrenheit()-32) * ((double)5/9));
    }

    public WeatherAdapter(OldWeatherService oldWeatherService) {
        this.oldWeatherService = oldWeatherService;
    }
}