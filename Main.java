

public class Main{
	
	public static void main(String[] args){
		Simulation roulette;
		if(args.length != 0){
		int round = Integer.parseInt(args[0]);
		roulette = generateSimulation(round);
		
		}
		else {
			roulette = new Simulation();
			roulette.load();
		}
		
		Simulator result = new Simulator(roulette);
		result.run();
	}
	
	public static Simulation generateSimulation(int round){
		Simulation roulette = new Simulation();
		for(int i = 0; i < round; i++){
			
			roulette.generateData();
		}
		return roulette;
	}

}