
public class Ashish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=15;int gap=max-2;
		for(int i=1;i<max-2;i++)
			{
			    for(int x=1;x<=i;x++)System.out.print("*");
			    for(int x=1;x<=gap;x++)System.out.print(" ");
			    for(int x=1;x<=i;x++)System.out.print("*");
			    System.out.println();
			    gap=gap-2;
			}

	}

}
