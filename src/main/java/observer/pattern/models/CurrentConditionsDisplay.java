package observer.pattern.models;



import observer.pattern.interfaces.DisplayElement;
import observer.pattern.interfaces.Observer;
import observer.pattern.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject weatherData) {
        this.setWeatherData(weatherData);
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(
                "Current conditions: " + temperature + "°C and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public Subject getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(Subject weatherData) {
        this.weatherData = weatherData;
    }

}
