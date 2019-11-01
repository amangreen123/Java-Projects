import java.util.Random;
import java.util.Date;


public class TestSoccerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

        Date d1 = new Date(2018, 11, 12, 10, 12, 30);
        Date d2 = new Date(2018, 11, 12, 12, 40, 30);

        SoccerMatch sm = new SoccerMatch(d1, d2, "Aaron's computer", "numbers", "letters");
        String homePlayerName [] = {"1","2","3","4","5","6","7","8","9","10","11"};
        String visitPlayerName [] = {"a","b","c","d","e","f","g","h","i","j","k"};
        
        
        for(int i = 0; i < homePlayerName.length; i++)
        {
            sm.addHomePlayer(new Player(homePlayerName[i], rand.nextInt(10), "12"));
            sm.addVisitorPlayer(new Player(visitPlayerName[i], rand.nextInt(10), "l"));
        }

        for(int i = 0; i < 10; i++)
        {
            sm.addHomeGoal(new Goal(rand.nextInt(59), sm.homePlayers[i]));
            sm.addVisitorGoal(new Goal(rand.nextInt(59), sm.visitorPlayers[i]));
        }

        System.out.print("\n\n Home Team Players  ");
        for(int i = 0; i < 11; i++)
        {
            System.out.println(sm.homePlayers[i]);
        }
        System.out.print("\n\n Visiting Team Players  ");
        for(int i = 0; i < 11; i++)
        {
            System.out.println(sm.visitorPlayers[i]);
        }
        System.out.print("\n\n Home Team Goals  ");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(sm.homeGoals[i]);
        }
        System.out.print("\n\n Visiting Team Goals  ");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(sm.visitorGoals[i]);
        }

        System.out.print("\n\n GAME STATUS  ");
        System.out.println(sm.getWinner());
		
	}
}