package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

// Provider of original values
public class WeatherData implements Provider {

    float temp;
    float humidity;
    List<Observer> observersList = new ArrayList<>();

    @Override
    public void register(Observer o) {
        observersList.add(o);
        System.out.println("Observer Added");
    }

    @Override
    public void deRegister(Observer o) {
        observersList.remove(o);
        System.out.println("Observer Removed");
    }

    @Override
    public void notifyObserver() {
        for (Observer o: observersList) {
            o.update(temp, humidity);
        }
    }

    public void setProperties(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;

        notifyObserver();
    }
}
