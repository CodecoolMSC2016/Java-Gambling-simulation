import java.util.Random;
import java.util.*;
import java.text.*;
import java.io.*;

public class Simulation{
	
	int[] black;
	RouletteNumber[] winnerNumbers;
	
	public Simulation(){
		
		this.black = new int[]{2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35 };
		this.winnerNumbers = new RouletteNumber[0];
	
	}
	
	
	public void generateData(){
		
		
		
		Random randomNumber = new Random();
		int randNum = randomNumber.nextInt(37);
		
		RouletteNumber winnerNumber = new RouletteNumber();
		winnerNumber.setValue(randNum);
		
		if (randNum == 0){
		
			winnerNumber.setNumberType("null");
			
		}else if (randNum % 2 == 0){
		
			winnerNumber.setNumberType("even");
			
		}else{
			
			winnerNumber.setNumberType("odd");
		}
		for (int i = 0 ; i < black.length; i++){
				if (randNum == black[i]){
					winnerNumber.setColor("black");
				}else if (randNum == 0) {
					
					winnerNumber.setColor("green");
				}
			}

		if (winnerNumber.getColor() != "black" && winnerNumber.getColor() != "green"){
		
			winnerNumber.setColor("red");
		}
			
		try{
			FileWriter fileWriter = new FileWriter("Simulation.csv",true);
			fileWriter.append("\n");
			fileWriter.append(Integer.toString(winnerNumber.getValue()));
			fileWriter.append(",");
			fileWriter.append(winnerNumber.getColor());
			fileWriter.append(",");
			fileWriter.append(winnerNumber.getNumberType());
			fileWriter.close();
			
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		winnerNumbers = Arrays.copyOf(winnerNumbers, winnerNumbers.length + 1);
		winnerNumbers[winnerNumbers.length-1] = winnerNumber;
		
		
	}
	
	public void load(){
		String csvFile = "Simulation.csv";
		this.winnerNumbers = new RouletteNumber[0];
		BufferedReader fileReader = null;
		
		try {
			String line = "";
			fileReader = new BufferedReader(new FileReader(csvFile));
			fileReader.readLine();
			while((line = fileReader.readLine()) != null){
				String[] tokens = line.split(",");
				RouletteNumber winnerNumber = new RouletteNumber();
				winnerNumber.setValue(Integer.parseInt(tokens[0]));
				winnerNumber.setColor(tokens[1]);
				winnerNumber.setNumberType(tokens[2]);
				
				this.winnerNumbers = Arrays.copyOf(this.winnerNumbers, this.winnerNumbers.length + 1);
				this.winnerNumbers[this.winnerNumbers.length-1] = winnerNumber;
				
				
			}
		}
			catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
		

	}
}