public class SnakeLadder {
	public static void main(String[] args) {
		int position=0;
		int die=(int)(Math.floor(Math.random()*10)%6)+1;
		System.out.println("die="+die);
		int option=(int)(Math.floor(Math.random()*10)%3)+1;
		if (option==1) {
			System.out.println("NO play,stays at same position");
		}
		else if (option==2) {
			System.out.println("Ladder, moving ahead by the position received on die");
			position+=die;
		}
		else {
			System.out.println("Snake, moving behind by the position received on die");
			position-=die;
		}
	}
}
