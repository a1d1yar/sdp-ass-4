public class Display implements Observer{
    private String observerName;

    public Display(String name) {
        this.observerName = name;
    }

    @Override
    public void update(String weatherData) {
        System.out.println(observerName + " received weather data: " + weatherData);
    }
}
