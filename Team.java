import java.util.ArrayList;

public class Team{
	private String teamName;
	private int rank; // 1.d
	private ArrayList<String> players; // 1.e

	public Team(String teamName){
		this.teamName = teamTame;
		this.players = new ArrayList<>();
	}

	// 1.h

	public String setRank(int Rank){ 
		this.rank = rank;


	}

    // 1.l

	public void addPlayer(String PlayerName){ 
		this.players.add(playername);

	}
	
	//1.j

	public String toString (){
		String result = "Team: " + teamName + ", Rank: " + rank + "\nPlayers: \n";
		for (String player : players){
			result += players + "\n";

		}
		return result;
	}
}

