
public class CustomEx extends Exception{
	private double amount;
	public String msg;
	
	public double getDifference(double x, double y) throws Exception
	{
		double diff=x-y;
		if(diff<0)throw new Exception();
		return diff;		
	}

}
