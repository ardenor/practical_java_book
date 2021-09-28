public class HelloThread1 extends Thread{
    String message;
    //pass message into thread
    HelloThread1(String message){ //constructor
        this.message = message;
    }

    public void run(){
        System.out.println(message);
    }

    public static void main(String[] args) {
        HelloThread1 ht1 = new HelloThread1("Thread 1 ...");
        HelloThread1 ht2 = new HelloThread1("Thread 2 ...");
        HelloThread1 ht3 = new HelloThread1("Thread 3 ...");
        ht1.start();
        ht2.start();
        ht3.start();
    }
}
