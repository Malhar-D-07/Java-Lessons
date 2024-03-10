package ProducerConsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;
    Producer(Store s, Semaphore p, Semaphore c) {
        this.store = s;
        this.producerSema = p;
        this.consumerSema = c;
    }

    @Override
    public void run() {
        while(true) {
            try {
                producerSema.acquire();
            }
            catch (InterruptedException e) {
                throw new RuntimeException();
            }

            store.addItems(new Object());
            consumerSema.release();

        }
    }
}
