package ObserverDesignPattern;

public class Main {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        CurrentDisplay cd = new CurrentDisplay(w);
        AverageDisplay ad = new AverageDisplay(w);

        w.setProperties(22.1F, 3.4F);

        cd.deRegister();
        w.setProperties(32.1F, 5.2F);

    }
}
