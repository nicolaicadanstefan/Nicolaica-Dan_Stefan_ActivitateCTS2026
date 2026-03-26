package src.vreme.adapterclase;

public class WeatherAdapter extends OldWeatherService implements WeatherProvider {
    @Override
    public Double getTemperatureCelsius() {
        return ((this.getTemperatureFahrenheit()-32) * ((double)5/9));
    }
}