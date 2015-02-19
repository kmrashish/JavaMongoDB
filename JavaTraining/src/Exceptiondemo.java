import java.io.IOException;


public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=0;
		System.out.println(divide(x, y));
		
		

	}
	@SuppressWarnings("finally")
	public static String divide(int x, int y) throws ArithmeticException
	{
		String result="Neither Try nor Catch executed successfully";
		try
		{
		result="Result: "+(x/y);
		String s=null;
		System.out.println(s);
		
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception: "+ex.getMessage()+"\n");
			result=ex.toString();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			return result;
		}
	}

}
