/*
	Thread (�߳�) ���÷�_6
	
	Thread �Ŀ���_3
		�̵߳� yield(�ò�):
			�ó�CPU, �������߳�ִ�еĻ���;
			�������е��߳�����������ǰ��õ�CPU�������, ������ʹ���߳̽�������״̬, ����ʹ֮ת�����״̬;
		
		����: public static void yield()
		
*/

class Tyield extends Thread
{
	public void run()
	{
		for(int i=0; i<100; ++i)
		{
			System.out.printf("%s - %d\n", Thread.currentThread().getName(), i);
			if(0 == i%10)
			{
				Thread.yield();
			}
		}
	}
}

public class Test_Thread_Yield
{
	public static void main(String[] args)
	{
		Tyield ty_1 = new Tyield();
		Tyield ty_2 = new Tyield();
		
		ty_1.setName("ty_1-Thread");
		ty_2.setName("ty_2-Thread");
		
		ty_1.start();
		ty_2.start();
	}
}
