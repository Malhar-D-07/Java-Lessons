package ProducerConsumer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxShelves;
    private Deque<Object> items;

    Store(int shelves) {
        this.maxShelves = shelves;
        items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxShelves() {
        return maxShelves;
    }

    public void setMaxShelves(int maxShelves) {
        this.maxShelves = maxShelves;
    }

    public Deque<Object> getItems() {
        return items;
    }

    public void addItems(Object item) {
        items.add(item);
        System.out.println("Item added by Producer. Shelf size: " + items.size());
    }

    public void removeItems() {
        items.remove();
        System.out.println("Item removed by Consumer. Shelf size: " + items.size());
    }

    public boolean canAddInStore() {
        return items.size() < maxShelves;
    }

    public boolean canRemoveFromStore() {
        return !items.isEmpty();
    }

    public void printItemSize() {
        System.out.println("Shelf size: " + items.size());
    }
}
