package dictionaryattack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryAttack {
	
	public static String passwordString;
	public static String currentDictString;
	public static FileReader fr;
	public static BufferedReader br;
	public static boolean wordFound = false;
	public static File file;
	
	public static void main(String[] args) throws IOException {
		passwordString = getPasswordString();
		br = getFileHandler("rockyou.txt");
		
		while ((currentDictString = br.readLine())!=null) {
			if (currentDictString.equalsIgnoreCase(passwordString)) {
				wordFound = true;
			}
		}
		System.out.println(passwordString + " is a " + (wordFound ? "weak" : "strong") + " password.");
		br.close();
		
	} //end main
	
	// method to get password
	public static String getPasswordString() {
		String userPasswordString;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a password: ");
		userPasswordString = scanner.nextLine();
		scanner.close();
		return userPasswordString;
		
	};
	
	// method to get file handler
	public static BufferedReader getFileHandler(String filePath) {
		try {
			file = new File(filePath);
			System.out.println(file.exists());
			fr = new FileReader(file);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Exiting");
		}
		return br;
	}
	
	// method to compare
	

}