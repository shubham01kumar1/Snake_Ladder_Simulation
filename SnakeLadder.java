public class SnakeLadder {
	
	public static void main(String[] args) {
		Game player1=new Game();
		Game player2=new Game();
		int countDieRolled=0;
		boolean playing=true;
		
		while(playing) {
			System.out.println("----------------Player-1 playing------------------------");
			boolean winner_Flag=player1.simulation();
			if(winner_Flag) {
				System.out.println("\n*****************WINNER IS PLAYER-1******************");
				countDieRolled=player1.totalDieRolled + player2.totalDieRolled;
				System.out.println("total no. of times die rolled in this game is "+countDieRolled);
				break;
			}
			System.out.println("----------------Player-2 playing--------------------------");
			winner_Flag=player2.simulation();
			if(winner_Flag) {
				System.out.println("\n****************WINNER IS PLAYER-2******************");
				countDieRolled=player1.totalDieRolled + player2.totalDieRolled;
				System.out.println("total no. of times die rolled in this game is "+countDieRolled);
				break;
			}
		}
	}
}
	
class Game {
	int position=0;
	int totalDieRolled=0;
	boolean winning_Flag=false;
	
	boolean simulation() {
		boolean next_Chance=true;
		while (next_Chance) {
			int die=(int)(Math.floor(Math.random()*10)%6)+1;
			totalDieRolled+=1;
			System.out.println("die="+die);
			
			int option=(int)(Math.floor(Math.random()*10)%3)+1;		
			if (option==1) {
				System.out.println("NO play,stays at same position");
				next_Chance=false;
			}	
			else if (option==2 && (position+die)<=100) {
				System.out.println("Ladder, moving ahead by the position received on die");
				position+=die;
				if (position==100) {
					winning_Flag=true;
					next_Chance=false;
				}
			}
			else {
				System.out.println("Snake, moving behind by the position received on die");
				position-=die;
				if (position<0)
					position=0;
				next_Chance=false;
			}
			System.out.println("position of player after this die roll is "+position);
		}
		return winning_Flag;
	}
}