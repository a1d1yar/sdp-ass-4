public class Main  {
    public static void main(String[] args) {
        WeatherDataFactory factory = new WeatherDataFactory();

        WeatherStation station1 = factory.createWeatherStation();
        WeatherStation station2 = factory.createWeatherStation();

        Display display1 = new Display("Display 1");
        Display display2 = new Display("Display 2");

        station1.registerObserver(display1);
        station1.registerObserver(display2);

        station2.registerObserver(display1);

        station1.setWeatherData("Temperature: 25°C, Humidity: 60%");
        station2.setWeatherData("Temperature: 30°C, Wind: 10 mph");

        // Unregister an observer
        station1.removeObserver(display2);

        station1.setWeatherData("Temperature: 27°C, Humidity: 55%");
    }
}
