package filereadwrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {

	public static void main(String[] args) {
		File file = new File("Teams.txt");
		FileWriter fw;
		String[] places = {"Italy", "Spain", "France", "Portugal", "Germany"};
		
		try {
			
			// check if the file exists
			if (!file.exists()) {		// If given file does not exist...
				file.createNewFile();	// ...create it
			}
			
			fw = new FileWriter(file, true); // "true" pertains to boolean *append* (adds to end rather than overwriting)
			BufferedWriter bw = new BufferedWriter(fw); // This is the file write handler
			
			for (String place : places) {
				bw.write(place + "\n");
			}
			
			bw.close();
			fw.close();	// Until you close the file, it has a LOCK on it - nothing else will be able to access it
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
