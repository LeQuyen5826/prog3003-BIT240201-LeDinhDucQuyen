
package service.multithread1;


public class Main {
    public static void main(String[] args) {

        WorkerThread thread = new WorkerThread();
        thread.start();  

        WorkerRunnable runnableTask = new WorkerRunnable();
        Thread runnableThread = new Thread(runnableTask);
        runnableThread.start(); 
        System.out.println("Main đã gọi start() cho cả hai");
    }
}



