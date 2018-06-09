/*
	Thread (线程) 的用法_2
	
	Thread 的创建方法_2:
		定义一个实现了 Runnable接口的类;
		创建 该类对象;
		利用 该类对象 构造一个 Thread对象, 并调用start()方法;
*/

class A implements Runnable
{
	public void run()
	{
		while(true)
			System.out.println("A");
	}
}

class B
{
}

public class Test_Thread_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		
		Thread trd_1 = new Thread(aa_1);	//public Thread(Runnable target);
		trd_1.start();
		
		//B bb_1 = new B();
		//Thread trd_2 = new Thread(bb_1);	//error	B类为实现Runnable接口，Thread中的构造函数的形参为Runnable类型(26行注释);
		
		while(true)
			System.out.println("main");
	}
}