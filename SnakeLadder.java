public class SnakeLadder {
	
	public static void main(String[] args) {
		int position=0;
		int totalDieRolled=0;
		while(position!=100) {
			int die=(int)(Math.floor(Math.random()*10)%6)+1;
			totalDieRolled+=1;
			System.out.println("die="+die);
			
			int option=(int)(Math.floor(Math.random()*10)%3)+1;		
			if (option==1) {
				System.out.println("NO play,stays at same position");
			}
			else if (option==2) {
				System.out.println("Ladder, moving ahead by the position received on die");
				if ((position+die)<=100)
					position+=die;
			}
			else {
				System.out.println("Snake, moving behind by the position received on die");
				position-=die;
				if (position<0)
					position=0;
			}
			System.out.println("position of player after this die roll is "+position);
		}
		System.out.println("winning position is reached "+ position);
		System.out.println("total number die rolled in the game: "+totalDieRolled);
	}	
}
