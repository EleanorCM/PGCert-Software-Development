/**
 * 
 */
package threading;

import java.util.Random;

/**
 * @author Lenovo V15
 *
 */
public class ImplementingRunnableExample implements Runnable {

	/**
	 * 
	 */
	public ImplementingRunnableExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {

		do {
			System.out.println("Second thread running away");
			try {
				Thread.sleep(new Random().nextInt(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} while (true);
		
	}

}
