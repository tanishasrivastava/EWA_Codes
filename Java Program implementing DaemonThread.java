public class DemoDaemonThread extends Thread {
    String s;
    public DemoDaemonThread(String name) {
        s = name;
    }
    public void run() {
        //checking if thread is daemon or not
        if(Thread.currentThread().isDaemon()) {
            System.out.println(s + " is Daemon Thread");
        }
        else {
            System.out.println(s + " is User Thread");
        }
    }
    public static void main(String[]args) {

    }
}
