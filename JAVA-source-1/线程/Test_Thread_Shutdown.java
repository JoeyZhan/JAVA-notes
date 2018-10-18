/*
	Thread (线程) 的用法_9
	
	Thread 的控制_6
		线程的 生命周期的控制(结束进程):	
			该方法(自定义方法)无太大意义, 有局限性, 且并不能真正的把一个进程终止;
*/

class A extends Thread
{
	private boolean flag = true;
	public void run()
	{
		while(flag)
			System.out.printf("%s\n", Thread.currentThread().getName());
	}
	
	public void shutDown()
	{
		this.flag = false;
	}
}

public class Test_Thread_Shutdown
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		aa_1.start();
		
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
		}
		aa_1.shutDown();
	}
}