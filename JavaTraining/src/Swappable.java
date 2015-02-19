
public class Swappable<T>{
	private T i;
	private T j;
	public Swappable(T x, T y)
	{
		i=x;
		j=y;
	}
	public void setI(T x)
	{
		i=x;
	}
	public void setJ(T y)
	{
		j=y;
	}
}
