package threadgame;

/**
 * Threaded class that controls the timed element of the game
 * @author 3048360
 *
 */
public class Timer implements Runnable {

	// the current time the thread has been running in secs
	private int currentCount;
	
	/**
	 * Starts a thread timer - runs to specified length but will quit naturally if not interrupted
	 * at twice the length of the game 
	 */
	@Override
	public void run() {
		
		this.currentCount=0;
		
		// start a silent timer - will run to twice the gameLength if not interrupted
		try {
			do {
				Thread.sleep(1000);
				currentCount++; // update the count every second
			} while (currentCount<=GameControl.gameLength*2);					
			
		} catch (InterruptedException e) {
			// here if interrupted - will cause thread to end
		}
	}

	/**
	 * Returns current time the thread has been on the go
	 * @return
	 */
	public int getCurrentCount() {
		return currentCount;
	}

	
}
