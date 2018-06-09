/*
	Thread (线程) 的用法_1
	
	Thread 的创建方法_1:
		定义一个继承Thread的类, 并重写Thread的run方法;
		创建并调用继承自Thread的start()方法;
		
	Thread 中 start()方法的功能就是 创建一个新线程,	并自动调用该线程的 run()方法, 直接调用 run()方法是不会创建一个新的线程的;
	
	执行一个线程实际上就是执行该线程的 run()方法 中的代码;
	
	执行完 对象名.start();方法(29行) 后 并不表示该对象 所对应的线程就一定会 立即得到执行,
	对象名.start(); 执行完后只是表示 该对象线程 具有了可以被CPU执行的资格，但由于想抢占CPU执行的线程很多，
	CPU 并不一定 会立即去执行该 对象 所对应的线程;
	
	一个Thread对象能且只能代表一个线程
	一个Thread对象不能调用两次 start() 方法, 否则会抛出 java.lang.IllegalThreadStateException 异常;
*/

class A extends Thread	//创建一个继承Thread的类
{
	public void run()	//重写Thread的run方法
	{
		while(true)
			System.out.println("A");
	}
}

public class Test_Thread_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		aa_1.start();	//调用继承自Thread的start()方法
		//aa_1.start();		//exception: java.lang.IllegalThreadStateException,	
							//一个Thread对象能且仅能代表一个线程，一个Thread对象不能调用两次start()方法;
		while(true)
			System.out.println("main");
	}
}