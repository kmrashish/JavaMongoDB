
public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc=new Account(100, 1000);
		CustomEx ce=new CustomEx();
		try{
		ce.getDifference(acc.getInBalance(), acc.getFinBalance());
		}
		catch(Exception e){System.out.println(e.toString());}
		String s1=new String("abc");
		String s2=new String("abc");
		System.out.println(s1==s2);  //use == for primitive data types 
		System.out.println(s1.equals(s2));  //use .equals() for object data types
		System.out.println(ce.hashCode());
		
		//Swappable<Integer> sw=new Swappable<Integer>();
	}
	static void swap(Integer i, Integer j)
	{
		Integer c=i;
		i=j;
		j=c;
		System.out.println(i+" "+j);
	}

}

