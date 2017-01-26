

public class Main{
	
	public static void main(String[] args){
		if(args.length != 0){
		int round = Integer.parseInt(args[0]);
		generateSimulation(round);
		}
		else {
			Simulation roulette = new Simulation();
			roulette.load();
			System.out.println(roulette.winnerNumbers.length);
		}
		
	}
	
	public static Simulation generateSimulation(int round){
		Simulation roulette = new Simulation();
		for(int i = 0; i < round; i++){
			
			roulette.generateData();
		}
		return roulette;
	}

}