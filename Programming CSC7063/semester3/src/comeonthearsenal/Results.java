package comeonthearsenal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Results {
	
	private static Map<String, Team> teamsMap = null; 

	public Results() {
	}
	
	private static void printResults() {
		System.out.println("Printing results");
		System.out.println("----------------");
		for (String team : teamsMap.keySet()) {
			Team currentTeam = teamsMap.get(team);
			currentTeam.printAll();
		}
	}

	public static void main(String[] args) throws IOException {
		File file = new File("Results.txt");
		FileReader fr;
		BufferedReader br;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			br.readLine();
			String line = br.readLine();
			teamsMap = new HashMap<String, Team>();

			while (line != null) {
				String[] tokens = line.split(" ");		
				String teamName = tokens[0];
				int goalsFor = Integer.parseInt(tokens[1]);
				int goalsAgainst = Integer.parseInt(tokens[2]);
				String teamPlayed = tokens[3];
				
				if (!teamsMap.containsKey(teamName)) {
					teamsMap.put(teamName, new Team(teamName, goalsFor, goalsAgainst, teamPlayed));
				} else {
					Team homeTeam = teamsMap.get(teamName);
					homeTeam.setGoalsFor(goalsFor);
					homeTeam.calculateWinsLossesAndDraws();
				}
				
				if (!teamsMap.containsKey(teamPlayed)) {
					teamsMap.put(teamPlayed, new Team(teamPlayed, goalsAgainst, goalsFor, teamName));
				} else {
					Team awayTeam = teamsMap.get(teamPlayed);
					awayTeam.setGoalsFor(goalsAgainst);
					awayTeam.calculateWinsLossesAndDraws();
				}	
				line = br.readLine();
			}
			
	
		} catch (FileNotFoundException e) {
			System.err.println("File not found at this location");
		}
		
		printResults();
	}
}
