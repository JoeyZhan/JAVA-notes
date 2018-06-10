/*
	Thread (线程) 的用法_4
	
	Thread 的控制_1
		线程的 Priority(优先级)
		
			线程的优先级用数字来表示，范围从1到10，数字越高级别越高;
		
			主线程的缺省优先级是 5, 子线程的优先级默认与其父线程相同;
			
				Thread.MIN_PRIORITY == 1;
				Thread.MAX_PRIORITY == 10;
				Thread.NORM_PRIORITY == 5;
			
			获得或设置线程对象的优先级 方法:
				int getPriority();
				void setPriority(int newPriority);
				(58行);
		
		Java 提供一个线程调度器来监控程序中启动后进入就绪状态的所有线程, 线程调度器按照线程的优先级决定应调度哪个线程来执行;
		
		通常 高优先级的线程 将先于 优先级低的线程 执行，但并不总是这样，
		因此 实际开发中并不单纯 依赖优先级来决定线程运行次序;
		
		e.g. 小知识点: 时间转轮调度算法;
*/

class A extends Thread
{
	public void run()
	{
		for(int i=0; i<10; ++i)
			System.out.printf("%s\n", Thread.currentThread().getName());
	}
}

class B implements Runnable
{
	public void run()
	{
		for(int i=0; i<10; ++i)
			System.out.printf("%s\n", Thread.currentThread().getName());
	}
}

public class Test_Thread_Priority
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		A aa_2 = new A();
		Thread trd_1 = new Thread(new B());
		
		aa_1.setName("aa_1-Thread");
		aa_2.setName("aa_2-Thread");
		trd_1.setName("trd_1-Thread");
		
		aa_1.setPriority(aa_1.NORM_PRIORITY + 3);		//设置优先级: 在默认优先级(5)上 + 3;	//每个线程的默认优先级都为 5;
		//aa_1.setPriority(aa_1.getPriority() + 3);		//作用同上;
		trd_1.setPriority(trd_1.MIN_PRIORITY);
		
		aa_1.start();
		aa_2.start();
		trd_1.start();
	}
}