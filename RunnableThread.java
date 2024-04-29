class ThreadRun implements Runnable
{
	public void run() 
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("From "+Thread.currentThread().getName()+" i = "+i);
		}
	}
}
public class RunnableThread
{
	public static void main(String[] args) {
		ThreadRun r1 = new ThreadRun();
		ThreadRun r2 = new ThreadRun();
		Thread t1 = new Thread(r1,"First Thread  ");
		Thread t2 = new Thread(r2,"Second Thread ");
	t1.start();
	t2.start();
	for(int i=0;i<10;i++)
	{
		System.out.println(Thread.currentThread().getName()+" = "+i);	
	}
	}
}