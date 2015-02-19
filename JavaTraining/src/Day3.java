

public class Day3 {
		
		public static void main(String args[])
		{
			String abc="Hello";
			String xyz="Hello";
			String s1= new String(xyz);
			System.out.println(abc.equals(xyz));
			System.out.println(abc==xyz);
			System.out.println(abc==s1);
			int x= s1.length();
			System.out.println(x);
			char x1= abc.charAt(3);
			System.out.println(x1);
			System.out.println(s1.substring(1,4));
			System.out.println(s1.indexOf("H"));
			StringBuffer buf= new StringBuffer("Ashish");
			buf.append(true);
			System.out.println(buf);
			buf.append(false);
			System.out.println(buf);
			StringBuilder buff1= new StringBuilder("jaskeerat");
			buff1.append(false);
			System.out.println(buff1);
			buff1.append(true);
			System.out.println(buff1);
			Integer y=new Integer(2);
			System.out.println(y.compareTo(0));
			int p=10;
			int z= p+y;
			System.out.println(z);
			System.out.println(((false?false:true)?false:true)?false:true);
			
			
		}
	
}
