/*
	Thread (线程) 的用法_10
	
	Thread 的同步_1
	
		Synchronized (同步)
			synchronized 可以用来修饰
				一个方法;
				一个方法内部的某个代码块;
			
			格式:
				synchronized(类对象名)
				{
					同步代码块;
				}
			
			功能:(41行)
				使一个线程正在操作某资源时, 将不允许其它线程操作该资源;
	
			其功能解析:
					判断 该对象 是否已经被其他线程占用, 如果发现已经被其他线程占用, 则当前线程陷入等待中, 
				如果发现没有被占用, 则当前线程占用 该对象, 并执行 同步代码块, 在当前线程执行 同步代码块时, 
				其他线程将无法执行 自己的同步代码块, 当前线程执行完 同步代码块后, 会自动释放对 该对象 的占用,
				此时该线程与其它线程 会互相竞争对 该对象的占用;
				
			附注:  占用(霸占) 的专业术语叫 锁定, 占用(霸占) 住的那个对象 的专业术语叫 监听器;
	
		买票同步程序_1
			用第一种创建Thread的方式; (需要将相应的属性声明为 static)
				构造了两个 Ticket 对象, 两个线程;
*/

class Ticket extends Thread
{
	public static int tickets = 100;
	public static int i = 0;
	public static String str = new String("ture");
	
	public void run()
	{
		while (true)
		{
			synchronized (str)
			{
				if(tickets > 0)
				{
					++i;
					--tickets;
					System.out.printf("%s: 卖出第 %d 张票! 剩余 %d 张!\n", Thread.currentThread().getName(), i, tickets);
					try
					{
						Thread.sleep(100);
					}
					catch(Exception e)
					{
					}
				}
				else
					break;
			}
		}
	}
}

public class Test_Thread_Ticket_1
{
	public static void main(String[] args)
	{
		Ticket tit_1 = new Ticket();			//构造了两个 Ticket 对象;
		tit_1.setName("Thread-Ticket-tit_1");
		tit_1.start();
		
		Ticket tit_2 = new Ticket();
		tit_2.setName("Thread-Ticket-tit_2");
		tit_2.start();
	}
}