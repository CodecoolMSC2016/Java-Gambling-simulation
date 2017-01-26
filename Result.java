public class Result {
	//todo: write setters,valOcc felkell dolgozni for ciklusal pl és kell a max értéke
	double oddPercent,evenPercent,zeroPercent,blackPercent,redPercent,numberPercent;
	Map<Integer,Integer> valOcc;
	
	public Result(){
		
		this.oddPercent = null;
		this.evenPercent = null;
		this.zeroPercent = null;
		this.blackPercent = null;
		this.redPercent = null;
		this.valOcc = null;
		this.numberPercent = null;
	
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
	
}
