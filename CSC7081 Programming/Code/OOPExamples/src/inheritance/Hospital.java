/**
 * 
 */
package inheritance;

/**
 * @author Eleanor Crossey Malone
 *
 */
public class Hospital {


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StaffMember s1 = new StaffMember("Marsha", "Hamilton");
		StaffMember s2 = new StaffMember("Billy-Bob", "Bert");
		Doctor d1 = new Doctor("Alanna", "Smith", 4);
		Programmer p1 = new Programmer("Jimmy", "Johnson", "Python");
		Surgeon su1 = new Surgeon("Will", "Smith", 11, "knee");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(d1);
		System.out.println(d1.getWard());
		System.out.println(p1);
		System.out.println(su1);

	}

}
