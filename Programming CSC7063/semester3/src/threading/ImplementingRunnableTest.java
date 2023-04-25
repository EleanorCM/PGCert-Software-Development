/**
 * 
 */
package threading;

import java.util.Random;


public class ImplementingRunnableTest {


	public ImplementingRunnableTest() {
	}

	public static void main(String[] args) {
		// create class with run method
		ImplementingRunnableExample ire = new ImplementingRunnableExample();
		ImplementingRunnableExample thirdThread = new ImplementingRunnableExample();
		
		//pass the run class into Thread class
		Thread newThread = new Thread(ire);
		Thread newThread2 = new Thread(thirdThread);

		//start the thread via the newThread class
		newThread.start();
		do {
			System.out.println("Main thread running away");
			try {
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (true);
	}
}
