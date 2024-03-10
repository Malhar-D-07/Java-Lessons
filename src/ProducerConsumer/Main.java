package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Store store = new Store(5);
        ExecutorService es = Executors.newCachedThreadPool();

        // Initially only Producers are allowed and 0 Consumers are allowed. The Producers will be same as number of Shelves
        Semaphore procuderSemaphore = new Semaphore(5);
        Semaphore consumerSemaphore = new Semaphore(0);

        for(int i = 0; i < 8; i++) {
            Producer p = new Producer(store, procuderSemaphore, consumerSemaphore);
            es.submit(p);
        }

        for(int i = 0; i < 8; i++) {
            Consumer c = new Consumer(store, procuderSemaphore, consumerSemaphore);
            es.submit(c);
        }
    }

}