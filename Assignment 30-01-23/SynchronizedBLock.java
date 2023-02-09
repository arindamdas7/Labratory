public class SynchronizedBLock {
    class PrintData2{
        void multi(int n){
            synchronized(PrintData2.class){
                for(int i =1;i<=5;i++){
                    System.out.println(n+" * "+i+" = "+n*i);
                    try {
                        Thread.sleep(400);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            System.out.println("Not Synchronized");
        }

    }

    public static void main(String[] args) {
        
    }
}
