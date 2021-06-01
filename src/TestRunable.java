public class TestRunable {
    public static void main(String[] args) {
        DemoRunable demoRunable=new DemoRunable();
        Thread thread=new Thread(demoRunable);
        thread.start();
    }
}
