package Day3;
class MultiThreading extends Thread
{
	int threadNumber;
	MultiThreading(int threadNumber)
	{
		this.threadNumber = threadNumber;
	}
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(i+": Thread Number : "+threadNumber);
			if (threadNumber==3)
				throw new RuntimeException();
			try 
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				throw new RuntimeException(e);
			}
		}
	}
}
public class Program1 
{
	public static void main(String[] args) 
	{
//		MultiThreading t1 = new MultiThreading();
//		MultiThreading t2 = new MultiThreading();
//		t1.start();
//		t2.start();
		for (int i=1;i<=5;i++)
		{
			MultiThreading t=new MultiThreading(i);
			t.start();
		}
	}
}
