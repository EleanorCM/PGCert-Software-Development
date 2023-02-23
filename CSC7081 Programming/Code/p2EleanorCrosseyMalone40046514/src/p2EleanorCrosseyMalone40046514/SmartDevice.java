/**
 * 
 */
package p2EleanorCrosseyMalone40046514;

/**
 * An abstract class modelling attributes and functionality common to all smart devices
 * @author Eleanor Crossey Malone 40046514
 * 
 */
public abstract class SmartDevice {
	
	private String name;
	private String manufacturer;
	private Room room;
	private Powerstate powerstate;
	

	/**
	 * Constructor setting device name and manufacturer
	 * @param name Device name
	 * @param manufacturer Manufacturer name
	 */
	public SmartDevice(String name, String manufacturer) {
		setName(name);
		setManufacturer(manufacturer);
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (name.length()<3) {
			throw new IllegalArgumentException("Device name too short");
		} if (name.length()>20) {
			throw new IllegalArgumentException("Device name too long");
		} else {
			this.name = name;
		}		
	}


	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}


	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		if (manufacturer.length()<3) {
			throw new IllegalArgumentException("Manufacturer name too short");
		} if (manufacturer.length()>20) {
			throw new IllegalArgumentException("Manufacturer name too long");
		} else {
			this.manufacturer = manufacturer;	
		}
	}
	
	public abstract void showAll();
	public abstract String status();

	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}


	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}


	/**
	 * @return the powerstate
	 */
	public Powerstate getPowerstate() {
		return powerstate;
	}


	/**
	 * @param powerstate the powerstate to set
	 */
	public void setPowerstate(Powerstate powerstate) {
		this.powerstate = powerstate;
	}

}
