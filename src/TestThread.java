public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        DemoThread demoThread1=new DemoThread("Thread 1");
        DemoThread demoThread2=new DemoThread("Thread 2");
        demoThread1.start();

        demoThread2.start();
        System.out.println("Luong Main");
    }
}
