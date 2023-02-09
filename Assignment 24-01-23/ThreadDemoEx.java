public class ThreadDemoEx extends Thread{

    public void run() {
        for (int i =1;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Thread is running! " + Thread.currentThread().getName() + " - Priority - "
            + Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        ThreadDemoEx t1 = new ThreadDemoEx();
        ThreadDemoEx t2 = new ThreadDemoEx();
        ThreadDemoEx t3 = new ThreadDemoEx();


        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.setPriority(NORM_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        t3.setPriority(MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
