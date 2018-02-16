package observer.pattern;

import observer.pattern.models.CurrentConditionsDisplay;
import observer.pattern.models.StatisticsDisplay;
import observer.pattern.models.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);

        weatherData.setMeasuremets(30, 65, 30.4f);
        weatherData.setMeasuremets(28, 70, 29.2f);
        weatherData.setMeasuremets(31, 90, 29.2f);
    }
    
    
}
