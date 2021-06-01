public class DemoThread extends  Thread{
    String name;
    DemoThread(String name){
        this.name=name;
    }
    @Override
     public void run() {
        for(int i=0;i<100;i++){
            System.out.println(name+ ":" + i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
