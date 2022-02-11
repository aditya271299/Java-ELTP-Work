package feb11;
class ThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<50) {
            System.out.println("we are in thread 1");
            i++;
        }
    }
}
class ThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<50) {
            System.out.println("we are in thread 2");
            i++;
        }
    }
}
class ThreadRunnable3 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<50) {
            System.out.println("we are in thread 3");
            i++;
        }
    }
}

public class Que3 {
    public static void main(String[] args) throws InterruptedException {
        ThreadRunnable1 t1=new ThreadRunnable1();
        ThreadRunnable2 t2=new ThreadRunnable2();
        ThreadRunnable3 t3=new ThreadRunnable3();
        Thread thread1=new Thread(t1);
        Thread thread2=new Thread(t2);
        Thread thread3=new Thread(t3);
        thread1.start();
        System.out.println("name of thread 1 is"+thread1.getName());
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.setName("t3");
        System.out.println("name of thread 3 that we assign is "+thread3.getName());

    }
}
