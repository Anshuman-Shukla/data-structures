package com.dataStructure.practice.producerConsumer;


//Utility Class
class Utility {
    int i;
    boolean bool = false;

    public synchronized void setI(int i) throws InterruptedException {
        while (bool) {
            wait();
        }
        this.i = i;
        bool = true;
        System.out.println("Producer :: " + i);
        notify();
    }

    public synchronized int getI() throws InterruptedException {
        while (!bool) {
            wait();
        }
        bool = false;
        System.out.println("Consmer :: " + i);
        notify();
        return i;
    }
}

//ConsumerClass
class Consumer implements Runnable {
    Utility utility;

    public Consumer(Utility utility) {
        this.utility = utility;
        Thread consumerThread = new Thread(this, "CONSUMER");
        consumerThread.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                utility.getI();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//Producer class
class Producer implements Runnable {
    Utility utility;

    public Producer(Utility utility) {
        this.utility = utility;
        Thread producerThread = new Thread(this, "PRODUCER");
        producerThread.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true) {
            try {
                utility.setI(i++);
                Thread.sleep(2000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }

        }
    }
}

//main class to execute thread
public class ProducerConsumer {
    public static void main(String[] args) {
        Utility utility=new Utility();
        new Producer(utility);
        new Consumer(utility);
    }
}
