/**
 * 
 */
package p2EleanorCrosseyMalone40046514;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Eleanor Crossey Malone 40046514
 *
 */
class TestSmartRadiator {
	
	SmartRadiator smartRadiator;
	
	String nameValid;
	String nameInvalidShort;
	String nameInvalidLong;
	String manufacturerValid;
	String manufacturerInvalidShort;
	String manufacturerInvalidLong;
	Room roomValid;
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
	}

	/**
	 * Tests the creation of a valid Smart Radiator object
	 */
	@Test
	void testSmartRadiatorConstructorValid() {
		smartRadiator = new SmartRadiator(nameValid, manufacturerValid, roomValid, tempNowValid, tempTargetValid);
		assertEquals(nameValid, smartRadiator.getName());
		assertEquals(manufacturerValid, smartRadiator.getManufacturer());
		assertEquals(tempNowValid, smartRadiator.getTempNow());
		assertEquals(tempTargetValid, smartRadiator.getTempTarget());
	}
	
	/**
	 * Tests that SmartRadiator is an instance of SmartDevice
	 */
	@Test
	void testSmartRadiatorExtendsSmartDevice() {
		smartRadiator = new SmartRadiator(nameValid, manufacturerValid, roomValid, tempNowValid, tempTargetValid);
		assertInstanceOf(SmartRadiator.class, smartRadiator);
		assertInstanceOf(SmartDevice.class, smartRadiator);
	}
	
	/**
	 * Tests exception and resulting message when device name supplied is too short
	 */
	@Test
	void testSetNameInvalidShort() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			smartRadiator = new SmartRadiator(nameInvalidShort, manufacturerValid, roomValid, tempNowValid, tempTargetValid);
		});
		assertEquals("Device name too short", e.getMessage());
	}
	
	/**
	 * Tests exception and resulting message when device name supplied is too long
	 */
	@Test
	void testSetNameInvalidLong() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			smartRadiator = new SmartRadiator(nameInvalidLong, manufacturerValid, roomValid, tempNowValid, tempTargetValid);
		});
		assertEquals("Device name too long", e.getMessage());
	}
	
	
	/**
	 * Tests exception and resulting message when manufacturer name supplied is too short
	 */
	@Test
	void testSetManufacturerInvalidShort() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			smartRadiator = new SmartRadiator(nameValid, manufacturerInvalidShort, roomValid, tempNowValid, tempTargetValid);
		});
		assertEquals("Manufacturer name too short", e.getMessage());
	}
	
	/**
	 * Tests exception and resulting message when manufacturer name supplied is too long
	 */
	@Test
	void testSetManufacturerInvalidLong() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			smartRadiator = new SmartRadiator(nameValid, manufacturerInvalidLong, roomValid, tempNowValid, tempTargetValid);
		});
		assertEquals("Manufacturer name too long", e.getMessage());
	}
	
	/**
	 * Tests exception and resulting message when current temperature is outside range that can be recorded (too low)
	 */
	@Test
	void testTempNowInvalidLow() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			smartRadiator = new SmartRadiator(nameValid, manufacturerValid, roomValid, tempNowInvalidLow, tempTargetValid);
		});
		assertEquals("Temperature too low", e.getMessage());
	}
	
	/**
	 * Tests exception and resulting message when current temperature is outside range that can be recorded (too low)
	 */
	@Test
	void testTempNowInvalidHigh() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			smartRadiator = new SmartRadiator(nameValid, manufacturerValid, roomValid, tempNowInvalidHigh, tempTargetValid);
		});
		assertEquals("Temperature too high", e.getMessage());
	}
	
	
	@Test
	void testPowerstateOn() {
		smartRadiator = new SmartRadiator(nameValid, manufacturerValid, roomValid, 10.5, 20.2);
		assertEquals(Powerstate.ON, smartRadiator.getPowerstate());
	}
	
	@Test
	void testPowerstateOff() {
		smartRadiator = new SmartRadiator(nameValid, manufacturerValid, roomValid, 18.7, 15.2);
		assertEquals(Powerstate.OFF, smartRadiator.getPowerstate());
	}
	
	@Test
	void testStatusNotNull() {
		smartRadiator = new SmartRadiator(nameValid, manufacturerValid, roomValid, tempNowValid, tempTargetValid);
		assertNotNull(smartRadiator.status());
	}
}
