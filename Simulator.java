import java.util.*;
//toDO: kell a run methodba egy Result példányositás és az lesz a return után pl Result pelda = new Result() , majd settereknek átaddod az eredményeket *percent,return pelda
public class Simulator{
	
	Simulation roulette;
	Logger logger;
	
	public Simulator(Simulation roulette){
	
		this.roulette = roulette;
	}
	
	
	public Simulator(Simulation roulette,Logger logger){
	
		this.roulette = roulette;
		this.logger = logger;
	}

	public Result run(){
		int oddCounter = 0;
		int evenCounter = 0;
		int blackCounter = 0;
		int redCounter = 0;
		int zeroCounter = 0;
		Map<Integer,Integer> valOcc = new HashMap<Integer,Integer>();
		for (RouletteNumber number : roulette.winnerNumbers){
			
			if(!valOcc.containsKey(number.getValue())) {
			
				valOcc.put(number.getValue(),1);
			}else{
				
				valOcc.put(number.getValue(),valOcc.get(number.getValue())+1);
			
			}
			
			
			if(number.getNumberType().equals("odd")){
				oddCounter ++;
			}else if (number.getNumberType().equals("even")){
				evenCounter ++;
			}else if (number.getNumberType().equals("null")){
				zeroCounter ++;
			}
			
			if(number.getColor().equals("black")){
			
				blackCounter++;
			}else if(number.getColor().equals("red")){
				
				redCounter++;
			
			}
		
		}  
		double oddPercent = ((double)oddCounter/roulette.winnerNumbers.length)*100;
		double evenPercent = ((double)evenCounter/roulette.winnerNumbers.length)*100;
		double zeroPercent = ((double)zeroCounter/roulette.winnerNumbers.length)*100;
		double blackPercent = ((double)blackCounter/roulette.winnerNumbers.length)*100;
		double redPercent = ((double)redCounter/roulette.winnerNumbers.length)*100;
		Result result = new Result(oddPercent, evenPercent, zeroPercent, blackPercent, redPercent, valOcc);
		return result;
	}
}