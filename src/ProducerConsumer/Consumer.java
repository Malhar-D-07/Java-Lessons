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
            }
            catch (InterruptedException e) {
                throw new RuntimeException();
            }

            store.removeItems();
            producerSema.release();
        }
    }
}
