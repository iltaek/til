package ObserverPattern.javautil;

public class weatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMesurements(80, 65, 30.4f);
    }
}
