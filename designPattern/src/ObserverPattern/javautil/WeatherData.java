package ObserverPattern.javautil;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void mesurementsChanged() {
        setChanged();
        notifyObservers(); // use 'pull model'
    }

    public void setMesurements(float temp, float humid, float pres) {
        this.temperature = temp;
        this.humidity = humid;
        this.pressure = pres;
        mesurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
