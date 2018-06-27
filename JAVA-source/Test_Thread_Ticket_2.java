/*
	Thread (线程) 的用法_11
	
	Thread 的同步_1
	
		买票同步程序_2
			用第二种创建Thread的方式; (不需要将相应的属性声明为 static)
				构造了一个 Ticket 类，两个 Thread 类, 两个线程;
*/

class Ticket implements Runnable
{
	public int tickets = 100;
	public int i = 0;
	public String str = new String("ture");
	
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

public class Test_Thread_Ticket_2
{
	public static void main(String[] args)
	{
		Ticket tit = new Ticket();					//构造了一个 Ticket 对象, 并再将该对象构造了两个 Thread 对象;
		Thread trd_1 = new Thread(tit);
		trd_1.setName("Thread-Ticket-trd_1");
		trd_1.start();
		
		Thread trd_2 = new Thread(tit);
		trd_2.setName("Thread-Ticket-trd_2");
		trd_2.start();
	}
}