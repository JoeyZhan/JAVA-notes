/*
	Thread (�߳�) ���÷�_7
	
	Thread �Ŀ���_4
		�̵߳� join(���л�):
			
			�ڶ��̳߳�����, �����һ���߳����еĹ�����Ҫ�õ���һ���̵߳����н��, ��ɽ����̵߳Ĵ��л�����;
			
		����: public final void join() throws InterruptedException
		
		����: 44��; 
		
		ע�⣡���� tj_1.join();  ������ͣ tj_1��������Ӧ���̣߳�����
		
*/

class Tjoin extends Thread
{
	public void run()
	{
		for(int i=0; i<10; ++i)
		{
			System.out.printf("%s\n", Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}

public class Test_Thread_Join
{
	public static void main(String[] args)
	{
		Tjoin tj_1 = new Tjoin();
		tj_1.start();
		
		try
		{
			tj_1.join();	
			//��ͣ ��ǰ����ִ�� tj_1.join(); ���߳�, ��main���߳�;
			//ֱ�� tj_1����Ӧ���߳� ������ֹ��, ��ǰ�߳�(main���߳�)�Ż��ü���ִ�еĻ���;
		}
		catch(InterruptedException e)
		{
		}
		
		Thread.currentThread().setName("Thread-Main");
		for(int i=0; i<10; ++i)
		{
			System.out.printf("%s\n", Thread.currentThread().getName());
		}
	}
}