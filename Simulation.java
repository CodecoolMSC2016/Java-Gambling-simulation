import java.util.Random;

public class Simulation{
	
	int[] black = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35 };
	
	public RouletteNumber generateData(){
		
		Random randomNumber = new Random();
		int randomNumber = randomNumber.nextInt(37);
		
		RouletteNumber winnerNumber = new RouletteNumber();
		winnerNumber.setValue(randomNumber);
		
		if (randomNumber.equals(0)){
		
			winnerNumber.setNumberType("null");
			
		}else if (randomNumber % 2 == 0){
		
			winnerNumber.setNumberType("even");
			
		}else{
			
			winnerNumber.setNumberType("odd");
		}
		
		if (ArrayUtils.contains(black, randomNumber)){

			winnerNumber.setColor("black");

		}else{

			winnerNumber.setColor("red");

		}
		
		
	}

}