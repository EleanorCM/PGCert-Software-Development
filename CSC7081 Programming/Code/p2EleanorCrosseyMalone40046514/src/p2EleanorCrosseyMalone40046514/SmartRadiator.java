/**
 * 
 */
package p2EleanorCrosseyMalone40046514;

/**
 * @author Eleanor Crossey Malone 40046514
 *
 */
public class SmartRadiator extends SmartDevice {
	
	private Room room;
	private Powerstate powerstate;
	private double tempNow;
	private double tempTarget;


	/**
	 * A constructor for the SmartRadiator class calling the SmartDevice constructor and then setting Smart Radiator-specific parameters
	 * @param name
	 * @param manufacturer
	 * @param room
	 * @param tempNow
	 * @param tempTarget
	 */
	public SmartRadiator(String name, String manufacturer, Room room, double tempNow, double tempTarget) {
		super(name, manufacturer);
		setRoom(room);
		setTempNow(tempNow);
		setTempTarget(tempTarget);
	}

	/**
	 * @return the tempNow
	 */
	public double getTempNow() {
		return tempNow;
	}

	/**
	 * A method to set the current temperature
	 * @param tempNow the tempNow to set
	 */
	public void setTempNow(double tempNow) throws IllegalArgumentException {
		if (tempNow < -10.0) {
			throw new IllegalArgumentException("Temperature too low");
		} else if (tempNow > 30.0) {
			throw new IllegalArgumentException("Temperature too high");
		} else {
			this.tempNow = tempNow;
		}
	}

	/**
	 * @return the tempTarget
	 */
	public double getTempTarget() {
		return tempTarget;
	}

	/**
	 * A method to set target temperature
	 * @param tempTarget the tempTarget to set
	 */
	public void setTempTarget(double tempTarget) throws IllegalArgumentException {
		if (tempTarget < 5.0) {
			throw new IllegalArgumentException("Target temperature too high");
		} else if (tempTarget > 26.0) {
			throw new IllegalArgumentException("Target temperature too low");
		} else {
			this.tempTarget = tempTarget;
			if (tempNow < getTempTarget()) {
				setPowerstate(Powerstate.ON);
			} else {
				setPowerstate(Powerstate.OFF);
			}
		}
	}

	/**
	 * A method printing details of current instance to screen
	 */
	public void showAll() {
		System.out.println("NAME: " + getName());
		System.out.println("MANUFACTURER: " + getManufacturer());
		System.out.println("ROOM: " + getRoom());
		System.out.println("POWERSTATE: " + getPowerstate());
		System.out.println("TEMPNOW: " + getTempNow());
		System.out.println("TEMPTARGET: " + getTempTarget());

	}

	/**
	 * A method generating a status code based on attributes of current instance
	 */
	public String status() {
		String tempNowString = "NOW:" + String.format("%.1f", getTempNow());
		String targetString = "TARGET:" + String.format("%.1f", getTempNow());
		String statusCode = ("SR" + "-" + getName().strip().replace(" ", "") + "-" + getRoom() + "-" + tempNowString + getTempNow() + "-" + targetString + getTempTarget() + "-" + getPowerstate()).toUpperCase();
		return statusCode;

	}

}
