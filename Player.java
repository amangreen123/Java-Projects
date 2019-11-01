public class Player {
	private String name;
	private String team;
	private int goals;
	
	Player()
	{
		name = team = "";
		goals = 0;
	}
	
	Player(String name, int goal, String teams) {
		this.name = name;
		this.team = team;
		this.goals = goals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	public String toString()
	{
		return  "\nPlayer:	" + name + "\n \t Team:	" + team + "\n \t Goals:	" + goals;
	}
}
