package threadprojectpkg;
import java.lang.*;
public class demothread1 extends Thread {
	public void run() {
		for(int i = 1; i<5;i++) {
			System.out.println("Child Thread i = +1");
		}
		System.out.println("exhibiting from my thread");
	}
}
 class demo {
	 public static void main(String[]args) throws Exception {
		 demothread1 t = new demothread1();
		 t.start();
		 t.join();
		 for(int j = 1; j<5;j++) {
				System.out.println("Main Thread i = +1");
			}
		 System.out.println("exhibiting from my thread");
	 }

}
