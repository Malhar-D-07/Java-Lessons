package ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;
    Consumer(Store s, Semaphore p, Semaphore c) {
        this.store = s;
        this.producerSema = p;
        this.consumerSema = c;
    }

    @Override
    public void run() {
        while(true) {
            try {
                consumerSema.acquire();
                // If we put sleep then we can see that the shelf size increases beyond boundary
                // This is not a problem with semaphore, but with Data Structure itself.
                // While dealing with threads it is important to use Thread safe DS.
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException();
            }

            store.removeItems();
            producerSema.release();
        }
    }
}
