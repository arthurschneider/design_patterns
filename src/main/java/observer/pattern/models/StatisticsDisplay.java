package observer.pattern.models;

import java.util.ArrayList;
import java.util.List;

import observer.pattern.interfaces.DisplayElement;
import observer.pattern.interfaces.Observer;
import observer.pattern.interfaces.Subject;

public class StatisticsDisplay implements DisplayElement, Observer {

    List<Float> temperatures;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        temperatures = new ArrayList<>();
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatures.add(temperature);
        display();

    }

    @Override
    public void display() {
        float maxTemperature = temperatures.stream().max(Float::compare).orElse(0f);
        float minTemperature = temperatures.stream().min(Float::compare).orElse(0f);
        double avgTemerature = temperatures.stream().mapToDouble(x -> x).average().getAsDouble();

        System.out.println("Avg/Max/Min temperatures " + avgTemerature + "/" + maxTemperature + "/"
                + minTemperature);
    }

}
