import java.util.*;

/**
 * @author aaron
 *
 */
 
// JA: Where are the Goal and Player classes defined?
// error null pointer excption
public class SoccerMatch {
	Date startTime;
	Date endTime;
	String location; 
	String home;
	String visitor; 
	
	Player[] homePlayers;
	Player[] visitorPlayers;
	Goal visitorGoal;
	Goal homeGoal;
	Player homePlayer; 
	Player visitorPlayer;
	Goal[] homeGoals;
	Goal[] visitorGoals;
	int homePlayerCounter, visitorPlayerCounter;
	int homeGoalsCounter, visitorGoalsCounter;
	
	SoccerMatch() {
		// set up what all vars above will equal
		// e.g. homePlayerr = new Player[11]
		// cycle through array to make sure all values set to null
		startTime = endTime = null;
		location = home = visitor = null;
		setup(); 
	}

	SoccerMatch(Date startTime, Date endTime, String location, String home, String visitor) {
		this.startTime = startTime;
		this.endTime = endTime;
		this.location = location;
		this.home = home;
		this.visitor = visitor;
				setup(); 
	}
	
	public void setup() { 
		homePlayers = new Player[11];
		visitorPlayers = new Player[11];
		homeGoals = new Goal[10];
		visitorGoals = new Goal[10];
		
		homePlayerCounter = visitorPlayerCounter = homeGoalsCounter = visitorGoalsCounter = 0;
		
		homePlayers = new Player[11];
		visitorPlayers = new Player[11];
		homeGoals = new Goal[10];
		visitorGoals = new Goal[10];
		
		homePlayerCounter = visitorPlayerCounter = homeGoalsCounter = visitorGoalsCounter = 0;
		
		for(int i = 0; i < 11; i++) {
			homePlayer = new Player(); 
			visitorPlayer = new Player(); 
			homePlayers[i] = homePlayer;
			visitorPlayers[i] = visitorPlayer; 
		}
		
		
		for (int i = 0; i < 10; i++) {
			visitorGoal = new Goal();
			homeGoal = new Goal(); 
			homeGoals[i] = homeGoal; 
			visitorGoals[i] = visitorGoal; 
		}
		
		
	}
	
	public void addHomePlayer(Player p)
	{
		for(int i = 0; i < homePlayers.length; i++) {
			if(homePlayers[i]==null) {
				homePlayers[i] = p;
				break;
			}
		}
	}
	public void addVisitorPlayer(Player p)
	{
		visitorPlayers[visitorPlayerCounter++] = p;
	}
	//home score
	public void addHomeGoal(Goal g
			
			
			
			)
	{
		homeGoals[homeGoalsCounter++] = g;
	}
	//visitor score
	public void addVisitorGoal(Goal g)
	{
		visitorGoals[visitorGoalsCounter++] = g;
	}
	
	public Goal[] getHomeGoals()
	{
	return homeGoals;
	}	
	
	public Goal []getVisitorGoals() {
	return visitorGoals;
	}
	
	public String getWinner() {
		String winStatus = "";
		
		
		// put winStatus stuff here, they're your print statements
		// do current scores, if home won, if visitor won, or if tie
		
		if( homePlayerCounter > visitorPlayerCounter) {
			System.out.print("Home Team Wins");
		}
		
		if( homePlayerCounter < visitorPlayerCounter) {
			System.out.print("Visitor Team Wins");
		}
		if(homePlayerCounter == visitorPlayerCounter) {
			System.out.print("Its a tie");
		}
		
		
		return winStatus;
	}

}
