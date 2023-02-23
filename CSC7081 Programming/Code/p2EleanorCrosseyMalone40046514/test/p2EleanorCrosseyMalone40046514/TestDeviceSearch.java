/**
 * 
 */
package p2EleanorCrosseyMalone40046514;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Eleanor Crossey Malone 40046514
 *
 */
class TestDeviceSearch {
	
	ArrayList<SmartRadiator> myRadiators;
	
	String nameValid;
	String nameInvalidShort;
	String nameInvalidLong;
	String manufacturerValid;
	String manufacturerInvalidShort;
	String manufacturerInvalidLong;
	Room roomValid;
	Powerstate powerstateValid;
	Double tempNowValid;
	Double tempNowInvalidLow;
	Double tempNowInvalidHigh;
	Double tempTargetValid;
	Double tempTargetInvalidLow;
	Double tempTargetInvalidHigh;
	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		nameValid = "Warm White Bulb";
		nameInvalidShort = "Li";
		nameInvalidLong = "abcdefghijklmnopqrstu";
		manufacturerValid = "Phillips Hue";
		manufacturerInvalidShort = "Ti";
		manufacturerInvalidLong = "Tadoefghijklmnopqrstu";
		roomValid = Room.HOUSE;
		tempNowValid = 10.0;
		tempNowInvalidLow = -11.0;
		tempNowInvalidHigh = 31.1;
		tempTargetValid = 20.0;
		tempTargetInvalidLow = -4.2;
		tempTargetInvalidHigh = 26.8;
		
		myRadiators = new ArrayList<SmartRadiator>(8);
		myRadiators.add(new SmartRadiator(nameValid, manufacturerValid, Room.HOUSE, 13.8, 5.6));
		myRadiators.add(new SmartRadiator(nameValid, manufacturerValid, Room.KITCHEN, 28.0, 25.2));
		myRadiators.add(new SmartRadiator(nameValid, manufacturerValid, Room.BEDROOM, 1.5, 7.9));
		myRadiators.add(new SmartRadiator(nameValid, manufacturerValid, Room.LOUNGE, 21.2, 21.2));
		myRadiators.add(new SmartRadiator(nameValid, manufacturerValid, Room.BATHROOM, 8.4, 6.0));
		myRadiators.add(new SmartRadiator(nameValid, manufacturerValid, Room.BEDROOM, -4.5, 17.5));
		myRadiators.add(new SmartRadiator(nameValid, manufacturerValid, Room.HOUSE, -1.0, 17.5));
		myRadiators.add(new SmartRadiator(nameValid, manufacturerValid, Room.LOUNGE, 1.0, 18.5));

	}

	@Test
	void testSearchByRoom() {
		assertEquals(2, DeviceSearch.searchByRoom(myRadiators, Room.HOUSE).size());
		assertEquals(1, DeviceSearch.searchByRoom(myRadiators, Room.BATHROOM).size());
	}
	
	@Test
	void testSearchByTemp() {
		assertEquals(0, DeviceSearch.searchByTemp(myRadiators, 16, 20).size());
		assertEquals(2, DeviceSearch.searchByTemp(myRadiators, 14, 29).size());
	}

}
