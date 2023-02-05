package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public ArrayListDemo() {
		
	}
	
	public static void main(String[] args) {
		ArrayList <String> myFruits = new ArrayList<String>();
		myFruits.add("banana");
		myFruits.add("apple");
		myFruits.add("orange");

		ArrayList<String> myFruits2 = new ArrayList<String>();
		myFruits2.add("kiwi");
		myFruits2.add("grape");		
		myFruits2.add("strawberry");	
		myFruits2.add("banana");
		
		for (int i=0; i<myFruits2.size(); i++) {
			if (!myFruits.contains(myFruits2.get(i))) {
				myFruits.add(myFruits2.get(i));
			}
		}
		
		System.out.println(myFruits);
		
		for (String fruit : myFruits) {
			System.out.println(fruit);
		}
		
		ArrayList<StaffMember> rollcallList = new ArrayList<StaffMember>();
		rollcallList.add(new Surgeon("Nathan", "Green", 5, "oncology")); // these parameter are
		rollcallList.add(new Doctor("Rachel", "Martin", 5)); // passed into each object's constructor
		rollcallList.add(new Programmer("Brian", "Jacks", "C++"));
		
		for (int i=0; i<rollcallList.size(); i++) {
			System.out.println(rollcallList.get(i));
		}
		
		for (StaffMember staff : rollcallList) {
			System.out.println(staff);
		}
		
		Iterator<StaffMember> iterator = rollcallList.iterator();
		while(iterator.hasNext()) {				 // while the iterator has a next value...
			System.out.println(iterator.next()); // ...print the next value
		}
		
	}

}
