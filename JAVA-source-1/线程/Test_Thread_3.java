/*
	Thread (�߳�) ���÷�_3
	
	Thread �еĳ��÷���:
		Thread.setName(String name)
			���õ�ǰ�̵߳�����;
			
		Thread.getName()
			���ص�ǰ�̵߳�����;
			
		Thread.currentThread()
			���� �Ե�ǰ����ִ�е��̶߳��� ������;
*/	

class A extends Thread
{
	public void run()
	{
		//System.out.printf("%s\n", Thread.getName());	//error
		System.out.printf("%s\n", Thread.currentThread().getName());
	}
}

public class Test_Thread_3
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		aa_1.setName("Thread-aa_1");
		aa_1.start();
		//System.out.printf("%s\n", aa_1.getName());
		
		A aa_2 = new A();
		aa_2.setName("Thread-aa_2");
		aa_2.start();
		
		A aa_3 = new A();
		aa_3.setName("Thread-aa_3");
		aa_3.start();
		
		Thread.currentThread().setName("Thread-Test_Thread_3-main");
		System.out.printf("%s\n", Thread.currentThread().getName());
	}
}