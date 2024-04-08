package ObserverDesignPattern;

// Receiver of the updated value
public class CurrentDisplay implements Observer {

    private float temp;
    private float humidity;
    private Provider p;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    CurrentDisplay(Provider p) {
        this.p = p;
        p.register(this);
    }

    @Override
    public void update(float temp, float humidity) {
        this.humidity = humidity;
        this.temp = temp;
        displayValues();
    }

    public void displayValues() {
        System.out.println("Current Temperature: " + getTemp());
        System.out.println("Current Humidity: " + getHumidity());
    }

    public void deRegister() {
        p.deRegister(this);
    }
}
