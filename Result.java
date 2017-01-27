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


