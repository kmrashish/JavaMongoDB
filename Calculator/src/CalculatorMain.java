
import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		double a=Double.parseDouble(s.nextLine());
		double b=Double.parseDouble(s.nextLine());
		System.out.println("Enter code for operation: \n 1. Addition 2. Subtraction 3. Multiplication 4. Division");
		int choice=Integer.parseInt(s.nextLine());
		String result=calc.Calculate(choice,a,b);
		System.out.println(result);
		s.close();
	}

}
