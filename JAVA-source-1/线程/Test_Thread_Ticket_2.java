/*
	Thread (�߳�) ���÷�_11
	
	Thread ��ͬ��_1
	
		��Ʊͬ������_2
			�õڶ��ִ���Thread�ķ�ʽ; (����Ҫ����Ӧ����������Ϊ static)
				������һ�� Ticket �࣬���� Thread ��, �����߳�;
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
					System.out.printf("%s: ������ %d ��Ʊ! ʣ�� %d ��!\n", Thread.currentThread().getName(), i, tickets);
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
		Ticket tit = new Ticket();					//������һ�� Ticket ����, ���ٽ��ö����������� Thread ����;
		Thread trd_1 = new Thread(tit);
		trd_1.setName("Thread-Ticket-trd_1");
		trd_1.start();
		
		Thread trd_2 = new Thread(tit);
		trd_2.setName("Thread-Ticket-trd_2");
		trd_2.start();
	}
}