/*
	Thread (线程) 的用法_3
	
	Thread 中的常用方法:
		Thread.setName(String name)
			设置当前线程的名字;
			
		Thread.getName()
			返回当前线程的名字;
			
		Thread.currentThread()
			返回 对当前正在执行的线程对象 的引用;
*/	

class A extends Thread
{
	public void run()
	{
		//System.out.printf("%s\n", Thread.getName());	//error
		System.out.printf("%s\n", Thread.currentThread().getName());
	}
}

public class Test_Thread_3
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		aa_1.setName("Thread-aa_1");
		aa_1.start();
		//System.out.printf("%s\n", aa_1.getName());
		
		A aa_2 = new A();
		aa_2.setName("Thread-aa_2");
		aa_2.start();
		
		A aa_3 = new A();
		aa_3.setName("Thread-aa_3");
		aa_3.start();
		
		Thread.currentThread().setName("Thread-Test_Thread_3-main");
		System.out.printf("%s\n", Thread.currentThread().getName());
	}
}