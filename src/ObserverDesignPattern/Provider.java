package ObserverDesignPattern;

public interface Provider {
    public void register(Observer o);
    public void deRegister(Observer o);
    public void notifyObserver();
}
