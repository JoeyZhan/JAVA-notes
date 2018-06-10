/*
	Thread (线程) 的用法_7
	
	Thread 的控制_4
		线程的 join(串行化):
			
			在多线程程序中, 如果在一个线程运行的过程中要用到另一个线程的运行结果, 则可进行线程的串行化处理;
			
		方法: public final void join() throws InterruptedException
		
		作用: 44行; 
		
		注意！！！ tj_1.join();  不是暂停 tj_1对象所对应的线程！！！
		
*/

class Tjoin extends Thread
{
	public void run()
	{
		for(int i=0; i<10; ++i)
		{
			System.out.printf("%s\n", Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}

public class Test_Thread_Join
{
	public static void main(String[] args)
	{
		Tjoin tj_1 = new Tjoin();
		tj_1.start();
		
		try
		{
			tj_1.join();	
			//暂停 当前正在执行 tj_1.join(); 的线程, 即main主线程;
			//直到 tj_1所对应的线程 运行终止后, 当前线程(main主线程)才会获得继续执行的机会;
		}
		catch(InterruptedException e)
		{
		}
		
		Thread.currentThread().setName("Thread-Main");
		for(int i=0; i<10; ++i)
		{
			System.out.printf("%s\n", Thread.currentThread().getName());
		}
	}
}