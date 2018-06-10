/*
	Thread (�߳�) ���÷�_5
	
	Thread �Ŀ���_2
		�̵߳� sleep(����):
			
			��ִͣ�е�ǰ�����е��̣߳�ʹ֮��������״̬, ������ָ����"�ӳ�ʱ��"����������ת�뵽����״̬;
			
		��ط���:
			public static void sleep(long millis)
			public static void sleep(long millis, int nanos)	//nanos: ����
				
		�÷����Ǿ�̬����, ������Threadֱ�ӵ���;
		
		sleep()�������׳�InterruptedException�쳣, ����try catch���в���;
		���� ������ �̳�Thread�� ���� ʵ��Runnable�ӿ�, run()�������׳��κ��쳣;
		ԭ��: ��д�����׳��쳣�ķ�Χ���ܴ��ڱ���д�����ų����쳣��Χ;
*/

class A extends Thread
{
	public void run()
	{
		for(int i=0; i<10; ++i)	//�޷�throws Exception, ��Ϊ��д�����׳��쳣�ķ�Χ���ܴ��ڱ���д�����ų����쳣��Χ;
		{
			System.out.printf("%s\n", Thread.currentThread().getName());
			
			try		//����try catch���в���, ����Thread.sleep()���׳��쳣, ���޷�throws ���쳣;
			{
				Thread.sleep(2000);		//����2000����(2��), �� ת�� ����״̬ 2s�� ��ת�� ����״̬;
			}
			catch(Exception e)
			{
			}
		}
	}
}
/*
class B implements Runnable
{
	public void run()
	{
		System.out.printf("%s", Thread.currentThread().getName());
	}
}
*/

public class Test_Thread_sleep
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		aa_1.start();
	}
}
