package filereadwrite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading {

	public static void main(String[] args) {
		
		try {
			// create buffered reader
			FileReader fr = new FileReader("Teams.txt");
			BufferedReader br = new BufferedReader(fr);
			String lineString = br.readLine();
			// read all lines until line var is null
			while (lineString != null) {
				System.out.println(lineString);
				lineString = br.readLine();
			}

			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Something went wrong when trying to read the file");
		}
		

	}

}
