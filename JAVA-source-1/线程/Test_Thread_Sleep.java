/*
	Thread (线程) 的用法_5
	
	Thread 的控制_2
		线程的 sleep(休眠):
			
			暂停执行当前运行中的线程，使之进入阻塞状态, 待经过指定的"延迟时间"后再醒来并转入到就绪状态;
			
		相关方法:
			public static void sleep(long millis)
			public static void sleep(long millis, int nanos)	//nanos: 纳秒
				
		该方法是静态方法, 可以由Thread直接调用;
		
		sleep()方法会抛出InterruptedException异常, 必须try catch进行捕获;
		并且 无论是 继承Thread类 还是 实现Runnable接口, run()都不能抛出任何异常;
		原因: 重写方法抛出异常的范围不能大于被重写方法排除的异常范围;
*/

class A extends Thread
{
	public void run()
	{
		for(int i=0; i<10; ++i)	//无法throws Exception, 因为重写方法抛出异常的范围不能大于被重写方法排除的异常范围;
		{
			System.out.printf("%s\n", Thread.currentThread().getName());
			
			try		//必须try catch进行捕获, 父类Thread.sleep()会抛出异常, 并无法throws 出异常;
			{
				Thread.sleep(2000);		//休眠2000毫秒(2秒), 即 转入 阻塞状态 2s后 再转入 就绪状态;
			}
			catch(Exception e)
			{
			}
		}
	}
}
/*
class B implements Runnable
{
	public void run()
	{
		System.out.printf("%s", Thread.currentThread().getName());
	}
}
*/

public class Test_Thread_sleep
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		aa_1.start();
	}
}
