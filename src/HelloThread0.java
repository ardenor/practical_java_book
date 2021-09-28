public class HelloThread0 extends Thread{
    public void run(){ //override thread run method to specify what to run in thread
        System.out.println("This is a thread...");
    }

    public static void main(String[] args) {
        HelloThread0 ht1 = new HelloThread0();
        ht1.start(); //call start yield join or stop to control thread
    }
}
