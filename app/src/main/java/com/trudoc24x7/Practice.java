package com.trudoc24x7;

class Q {
    int num;
    boolean valueSet;

    public synchronized void setNum(int num) {
        while (valueSet) {
            try {
                wait();
            } catch (Exception ex) {
            }
        }
        System.out.println("Set: " + num);
        this.num = num;
        valueSet = true;
        notify();
    }

    public synchronized void getNum() {
        while (!valueSet) {
            try {
                wait();
            } catch (Exception ex) {
            }
        }
        System.out.println("Get: " + num);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            q.getNum();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
