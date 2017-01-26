import java.util.Random;
import java.util.*;
import java.text.*;
import java.io.*;

public class Simulation{
	
	FileWriter fileWriter;
	int[] black;
	RouletteNumber[] winnerNumbers;
	
	public Simulation(){
		
		try{
		this.fileWriter = new FileWriter("asd.csv");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
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
				}
			}

		if (winnerNumber.getColor() != "black"){
		
			winnerNumber.setColor("red");
		}
			

		//fileWriter.append("value,color,numberPropertie");
		try{
			fileWriter.append("\n");
			fileWriter.append(Integer.toString(winnerNumber.getValue()));
			fileWriter.append(",");
			fileWriter.append(winnerNumber.getColor());
			fileWriter.append(",");
			fileWriter.append(winnerNumber.getNumberType());
			
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		winnerNumbers = Arrays.copyOf(winnerNumbers, winnerNumbers.length + 1);
		winnerNumbers[winnerNumbers.length-1] = winnerNumber;
		
		
	}

}