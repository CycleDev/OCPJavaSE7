package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by noprysk on 8/16/2017.
 */

class Request {

}

class Client implements Runnable {

    private BlockingQueue<Request> queue;

    public Client(BlockingQueue<Request> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Request request;

        while(true) {
            request = new Request();
            try {
                queue.put(request);
                System.out.println("Put into queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Server implements Runnable {
    private BlockingQueue<Request> queue;

    public Server(BlockingQueue<Request> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {

            try {
                System.out.println("Take from queue: " + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class BlockingQueueTest {

    public static void test() {
        BlockingQueue<Request> queue = new ArrayBlockingQueue<>(3);

        Thread client = new Thread(new Client(queue));
        Thread server = new Thread(new Server(queue));

        client.start();
        server.start();
    }

}
