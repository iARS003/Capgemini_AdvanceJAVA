package Day_2;

public class Program5 
{
	static final Object lock = new Object();
	public static void main(String[] args) throws Exception
	{
		Thread worker = new Thread
				(
					()->{
						try 
						{
							System.out.println("Worker : Started");
							Thread.sleep(2000); // time in milliseconds so 2000 -> 2 seconds
							synchronized(lock)
							{
								System.out.println("Worker: Going to waiting state");
								lock.wait();
							}
							System.out.println("Worker: Resumed and finishing");
						}
						catch(InterruptedException e)
						{
							throw new RuntimeException(e);
						}
					}
				);
		System.out.println("State after creation: "+worker.getState());
		worker.start();
		Thread.sleep(100);
		System.out.println("Start after starting: "+worker.getState());
		Thread.sleep(500);
		System.out.println("Start during sleep: "+worker.getState());
		Thread.sleep(2000);
		System.out.println("Start during wait: "+worker.getState());
		synchronized(lock)
		{
			lock.notify();
		}
		worker.join();
		System.out.println("Start after complete: "+worker.getState());
		
	}
}
/*
 Life Cycle states
	New -> Runnable -> Blocked -> Waiting ->Timed Waiting ->Terminated
	
	Life Cycle flow
	New -> Runnable -> (Waiting / Blocked / Timed_Waiting) -> Runnable -> Terminated
*/