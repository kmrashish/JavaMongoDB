
final class Calculator{
	
	public  String Calculate(int operation, double a, double b)
	{
		switch(operation)
		{
		case 1:
			return "Result after addition is "+(a+b);
		case 2:
			return "Result after subtraction is "+(a-b);
		case 3:
			return "Result after multiplication is "+(a*b);
		case 4:
			if(b==0) return "Error!! division by zero";
			else
			return "Result after division is "+(a/b);
		default:
			return "Invalid Operation Code!! Try Again";				
		}
	}
	
}


