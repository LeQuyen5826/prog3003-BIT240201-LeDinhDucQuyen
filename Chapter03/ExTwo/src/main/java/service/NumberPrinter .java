
package service;

class NumberPrinter implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + " : " + i);
        }
    }
}
