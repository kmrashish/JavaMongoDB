

public abstract class Vehicle {

	protected boolean isStarted;
	protected int noOfTyres;
	
	public boolean start() throws Exception{
		if(isStarted) throw new Exception("Already Started");
		else this.isStarted=true;
		return this.isStarted;	
	}
	
	public int getNoOfTyres()
	{
		return noOfTyres;
	}
}

