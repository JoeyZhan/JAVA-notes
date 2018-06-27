/*
	Thread (�߳�) ���÷�_10
	
	Thread ��ͬ��_1
	
		Synchronized (ͬ��)
			synchronized ������������
				һ������;
				һ�������ڲ���ĳ�������;
			
			��ʽ:
				synchronized(�������)
				{
					ͬ�������;
				}
			
			����:(41��)
				ʹһ���߳����ڲ���ĳ��Դʱ, �������������̲߳�������Դ;
	
			�书�ܽ���:
					�ж� �ö��� �Ƿ��Ѿ��������߳�ռ��, ��������Ѿ��������߳�ռ��, ��ǰ�߳�����ȴ���, 
				�������û�б�ռ��, ��ǰ�߳�ռ�� �ö���, ��ִ�� ͬ�������, �ڵ�ǰ�߳�ִ�� ͬ�������ʱ, 
				�����߳̽��޷�ִ�� �Լ���ͬ�������, ��ǰ�߳�ִ���� ͬ��������, ���Զ��ͷŶ� �ö��� ��ռ��,
				��ʱ���߳��������߳� �ụ�ྺ���� �ö����ռ��;
				
			��ע:  ռ��(��ռ) ��רҵ����� ����, ռ��(��ռ) ס���Ǹ����� ��רҵ����� ������;
	
		��Ʊͬ������_1
			�õ�һ�ִ���Thread�ķ�ʽ; (��Ҫ����Ӧ����������Ϊ static)
				���������� Ticket ����, �����߳�;
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

public class Test_Thread_Ticket_1
{
	public static void main(String[] args)
	{
		Ticket tit_1 = new Ticket();			//���������� Ticket ����;
		tit_1.setName("Thread-Ticket-tit_1");
		tit_1.start();
		
		Ticket tit_2 = new Ticket();
		tit_2.setName("Thread-Ticket-tit_2");
		tit_2.start();
	}
}