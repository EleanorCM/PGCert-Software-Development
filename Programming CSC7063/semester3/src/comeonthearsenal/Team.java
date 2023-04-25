package comeonthearsenal;

public class Team {
	private String name;
	private String teamPlayed;
	private int goalsFor = 0;
	private int goalsAgainst = 0;
	private int wins = 0;
	private int draws = 0;
	private int losses = 0;
	private int totalPoints = 0;
	

	public Team(String name, int goalsFor, int goalsAgainst, String teamPlayed) {
		setName(name);
		setTeamPlayed(teamPlayed);
		setGoalsFor(goalsFor);
		setGoalsAgainst(goalsAgainst);
		calculateWinsLossesAndDraws();
		this.totalPoints=goalsFor;
	}

	public void calculateWinsLossesAndDraws() {
		if (goalsFor > goalsAgainst) {
			this.wins++;
		} else if (goalsFor == goalsAgainst) {
			this.draws++;
		} else {
			this.losses++;
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamPlayed() {
		return teamPlayed;
	}

	public void setTeamPlayed(String teamPlayed) {
		this.teamPlayed = teamPlayed;
	}

	public int getGoalsFor() {
		return goalsFor;
	}

	public void setGoalsFor(int goalsFor) {
		this.goalsFor = goalsFor;
		this.totalPoints += goalsFor;
	}

	public int getGoalsAgainst() {
		return goalsAgainst;
	}

	public void setGoalsAgainst(int goalsAgainst) {
		this.goalsAgainst += goalsAgainst;
	}

	public int getWins() {
		return wins;
	}

	public int getDraws() {
		return draws;
	}

	public int getLosses() {
		return losses;
	}

	public void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getTotalPoints() {
		return totalPoints;
	}
	
	public void printAll() {
		System.out.println("Name "+ getName());
		System.out.println("Wins "+ getWins());
		System.out.println("losses "+ getLosses());
		System.out.println("Draws "+ getDraws());
		System.out.println("Total points " + getTotalPoints());
	}

}
