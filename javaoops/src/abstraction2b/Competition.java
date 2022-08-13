package abstraction2b;

public class Competition implements ClassC{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassC games = new Competition();
		games.carromboard();
		games.chess();
		games.quizCompetition();
		games.shuttle();
		games.poemcompetition();
		games.cricket();
		games.footBall();
		games.kabbadi();
		games.volleyBall();
		games.highJump();
		
	}

	@Override
	public void carromboard() {
		// TODO Auto-generated method stub
		System.out.println("carromboard :" + "it allows 4 players to play");
	}

	@Override
	public void chess() {
		// TODO Auto-generated method stub
		System.out.println("chess :" + "it allows 2 players to play");
	}

	@Override
	public void kabbadi() {
		// TODO Auto-generated method stub
		System.out.println("kabaddi :" + "it allows 7 players to play on each side");
	}

	@Override
	public void cricket() {
		// TODO Auto-generated method stub
		System.out.println("cricket :" + "it allows 11 players to play on each side");
	}

	@Override
	public void shuttle() {
		// TODO Auto-generated method stub
		System.out.println("shuttle :" + "it allows 2 players to play");		
	}

	@Override
	public void quizCompetition() {
		// TODO Auto-generated method stub
		System.out.println("quizCompetition :" + "it allows 2 players to play");		
	}

	@Override
	public void poemcompetition() {
		// TODO Auto-generated method stub
		System.out.println("poemcompetition :" + "it allows to play group of participants");				
	}

	@Override
	public void volleyBall() {
		// TODO Auto-generated method stub
		System.out.println("volleyBall :" + "it allows 10 players to play");	
	}

	@Override
	public void highJump() {
		// TODO Auto-generated method stub
		System.out.println("shuttle :" + "it allows 2 players to play");
	}

	@Override
	public void footBall() {
		// TODO Auto-generated method stub
		System.out.println("footBall :" + "it allows 11 players to play");
	}
	
	

}
