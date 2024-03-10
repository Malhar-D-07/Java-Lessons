package ProducerConsumer;

public class Producer implements Runnable{

    Store store;

    Producer(Store s) {
        this.store = s;
    }

    @Override
    public void run() {
        while(true) {
            if(store.canAddInStore()) {
                store.addItems(new Object());
//                System.out.println("self: " + this);
//                System.out.println("Thread: " + Thread.currentThread().getName() + " added items. Size: " + store.getItems().size() + " " + System.currentTimeMillis());
                System.out.println("Producer added item. Store size is: " + store.getItems().size());
            }
        }
    }
}
