package ProducerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Store store = new Store(5);

         ExecutorService es = Executors.newCachedThreadPool();

        // IF WE USE newFixedThreadPool WITH LESS NUMBER OF THREADS THEN THIS PROBLEM DOES
        // NOT OCCUR AS CONSUMER MIGHT NOT BE GIVEN A THREAD TO RUN ON. THIS PROBLEM OCCURS WHEN WE HAVE
        // AMPLE NUMBER OF THREADS. IF Thread count > 8, then only this Producer Consumer problem occurs
        // ExecutorService es = Executors.newFixedThreadPool(8);

        for(int i = 0; i < 8; i++) {
            Producer p = new Producer(store);
            es.submit(p);
        }

        for(int i = 0; i < 8; i++) {
            Consumer c = new Consumer(store);
            es.submit(c);
        }
    }

}
