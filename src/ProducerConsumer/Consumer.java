package ProducerConsumer;

public class Consumer implements Runnable{

    private Store store;

    Consumer(Store s) {
        this.store = s;
    }

    @Override
    public void run() {
        while(true) {
            if(store.canRemoveFromStore()) {
                store.removeItems();
//                  System.out.println("self: " + this);
//                System.out.println("Thread: " + Thread.currentThread().getName() + " removed items. Size: " + store.getItems().size() + " " + System.currentTimeMillis());
                System.out.println("Consumer removed item. Store size is: " + store.getItems().size());
            }
        }
    }
}
