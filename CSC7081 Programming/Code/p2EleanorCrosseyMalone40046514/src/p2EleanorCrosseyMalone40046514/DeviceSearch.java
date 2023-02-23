/**
 * 
 */
package p2EleanorCrosseyMalone40046514;

import java.util.ArrayList;

/**
 * @author Eleanor Crossey Malone 40046514
 *
 */
public class DeviceSearch {

	/**
	 * 
	 */
	public DeviceSearch() {
		
	}
	
	public static ArrayList<SmartRadiator> searchByRoom(ArrayList<SmartRadiator> inputArrayList, Room room) {
		ArrayList<SmartRadiator> hits = new ArrayList<SmartRadiator>();
		for (SmartRadiator radiator : inputArrayList) {
			if (radiator.getRoom().equals(room)){
				hits.add(radiator);
			}
		}
		return hits;
		
	}
	
	public static ArrayList<SmartRadiator> searchByTemp(ArrayList<SmartRadiator> inputArrayList, double minTemp, double maxTemp) {
		ArrayList<SmartRadiator> hits = new ArrayList<SmartRadiator>();
		for (SmartRadiator radiator : inputArrayList) {
			if (radiator.getTempNow()>=minTemp && radiator.getTempNow()<=maxTemp) {
				hits.add(radiator);
			}
		}
		return hits;
	}
	
	

}
