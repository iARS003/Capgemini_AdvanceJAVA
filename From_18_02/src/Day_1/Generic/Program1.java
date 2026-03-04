package Day_1.Generic;

public class Program1 
{
	public static void main(String [] args)
	{
		Box <String> box = new Box();
		box.set("10");
		System.out.println(box.value);
		String s =box.get();
		System.out.println(s);
	}
}
class Box <T>
{
	T value;
	void set(T value)
	{
		this.value=value;
	}
	T get ()
	{
		return value;
		
	}
}
