/*
	Thread (�߳�) ���÷�_9
	
	Thread �Ŀ���_6
		�̵߳� �������ڵĿ���(��������):	
			�÷���(�Զ��巽��)��̫������, �о�����, �Ҳ����������İ�һ��������ֹ;
*/

class A extends Thread
{
	private boolean flag = true;
	public void run()
	{
		while(flag)
			System.out.printf("%s\n", Thread.currentThread().getName());
	}
	
	public void shutDown()
	{
		this.flag = false;
	}
}

public class Test_Thread_Shutdown
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		aa_1.start();
		
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
		}
		aa_1.shutDown();
	}
}