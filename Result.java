import java.util.*;

public class Result {
	//todo: write setters,valOcc felkell dolgozni for ciklusal pl és kell a max értéke
	double oddPercent,evenPercent,zeroPercent,blackPercent,redPercent,numberPercent;
	Map<Integer,Integer> valOcc;
	
	public Result(){
		
		this.oddPercent = oddPercent;
		this.evenPercent = evenPercent;
		this.zeroPercent = zeroPercent;
		this.blackPercent = blackPercent;
		this.redPercent = redPercent;
		this.valOcc = Collections.<Integer, Integer>emptyMap();
		this.numberPercent = numberPercent;
	}
	
	public Result(double oddPercent, double evenPercent, double zeroPercent, double blackPercent, double redPercent, Map<Integer, Integer> valOcc){
		
		this.oddPercent = oddPercent;
		this.evenPercent = evenPercent;
		this.blackPercent = blackPercent;
		this.redPercent = redPercent;
		this.valOcc = valOcc;
		this.numberPercent = numberPercent;
	}
	
	public List<Integer> adjMaxot()
	{
		List<Integer> max = new ArrayList<Integer>();
		max.add(0);
		max.add(0);
		
		for (Integer i: valOcc.values())
		{
			if (i > max.get(1))
			{
				max.set(1, i);
			}
		}
		for (Map.Entry<Integer,Integer> entry : valOcc.entrySet())
		{
			if(entry.getValue().equals(max.get(1)))
			{
				max.set(0, entry.getKey());
			}
		}
			   
			  return max;
	}
		
	
	public double getOddPercent(){
	
		return oddPercent;
	}
	
	public double getEvenPercent(){
	
		return evenPercent;
	}
	
	public double getZeroPercent(){
	
		return zeroPercent;
	}
	
	public double getBlackPercent(){
	
		return blackPercent;
	}
	
	public double getRedPercent(){
	
		return redPercent;
	}
	
	public double getnumberPercent(){
	
		return numberPercent;
	}

	public Map<Integer,Integer> getValOcc(){
	
		return valOcc;
	}
	
	public void setOddPercent(Double value){

		this.oddPercent = value;
	}

	public  void setEvenPercent(Double value){

		this.evenPercent = value;
	}

	public  void setZeroPercent(Double value){

		this.zeroPercent = value;
	}

	public  void setBlackPercent(Double value){

		this.blackPercent = value;
	}

	public  void setRedPercent(Double value){

		this.redPercent = value;
	}

	public  void setValOcc(Map<Integer, Integer> value){

		this.valOcc = value;
	}

	public  void setNumberPercent(Double value){

		this.numberPercent = value;
	}
}


