import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String weatherData;

    public void setWeatherData(String data) {
        this.weatherData = data;
        measurementsChanged();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weatherData);
        }
    }
}
