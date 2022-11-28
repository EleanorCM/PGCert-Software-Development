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
			// assign first line to variable
			String lineString = br.readLine();
			// read all lines until line var is null
			while (lineString != null) { // multiple .readLine()s after end of file will return multiple nulls
				System.out.println(lineString);
				lineString = br.readLine(); // moves to the next line
			}
			// null is returned only when the end of the stream is reached without reading any
			// additional characters
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			// IOException is more general - ie if the file can't be opened or found
		} catch (IOException e) {
			System.out.println("Something went wrong when trying to read the file");
		}
		

	}

}
