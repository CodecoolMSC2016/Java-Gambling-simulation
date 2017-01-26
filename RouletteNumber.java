public class RouletteNumber{

	String color, numberType;
	int value;
	
	public RouletteNumber(){
		
		this.color = "";
		this.numberType = "";
		this.value = 0;
	}
	
	public String getColor(){
		
		return color;
	}
	
	public String getNumberType(){
		
		return numberType;
	}
	
	public int getValue(){
		
		return value;
	}
	
	public void setGetColor(String color){
		
		this.color = color;
	}
	
	public void setNumberType(String numberType){
	
		this.numberType = numberType;
	}
	
	public void setValue(int value){
	
		this.value = value;
	}
}