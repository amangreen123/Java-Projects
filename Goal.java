
public class Goal {
	private int minute ;
	private Player player;
	
	Goal()
	{
		minute = 0;
		player = null;
	}
	Goal(int minute, Player player) {
		this.minute = minute;
		this.player = player;
		int goals = player.getGoals()+1;
		player.setGoals(goals);
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	

	public String toString()
	{
		return "\n \tGoal min:	" + minute + "\n \t Player:	" + player.getName();
	}
}
