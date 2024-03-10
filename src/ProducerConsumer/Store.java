package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxShelves;
    private List<Object> items;

    Store(int shelves) {
        this.maxShelves = shelves;
        items = new ArrayList<>();
    }

    public int getMaxShelves() {
        return maxShelves;
    }

    public void setMaxShelves(int maxShelves) {
        this.maxShelves = maxShelves;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItems(Object item) {
        items.add(item);
        System.out.println("Item added by Producer. Shelf size: " + items.size());
    }

    public void removeItems() {
        items.remove(items.size() - 1);
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
