/*
	Thread (线程) 的用法_6
	
	Thread 的控制_3
		线程的 yield(让步):
			让出CPU, 给其他线程执行的机会;
			让运行中的线程主动放弃当前获得的CPU处理机会, 但不是使该线程进入阻塞状态, 而是使之转入就绪状态;
		
		方法: public static void yield()
		
*/

class Tyield extends Thread
{
	public void run()
	{
		for(int i=0; i<100; ++i)
		{
			System.out.printf("%s - %d\n", Thread.currentThread().getName(), i);
			if(0 == i%10)
			{
				Thread.yield();
			}
		}
	}
}

public class Test_Thread_Yield
{
	public static void main(String[] args)
	{
		Tyield ty_1 = new Tyield();
		Tyield ty_2 = new Tyield();
		
		ty_1.setName("ty_1-Thread");
		ty_2.setName("ty_2-Thread");
		
		ty_1.start();
		ty_2.start();
	}
}
