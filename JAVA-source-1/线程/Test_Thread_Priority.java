/*
	Thread (�߳�) ���÷�_4
	
	Thread �Ŀ���_1
		�̵߳� Priority(���ȼ�)
		
			�̵߳����ȼ�����������ʾ����Χ��1��10������Խ�߼���Խ��;
		
			���̵߳�ȱʡ���ȼ��� 5, ���̵߳����ȼ�Ĭ�����丸�߳���ͬ;
			
				Thread.MIN_PRIORITY == 1;
				Thread.MAX_PRIORITY == 10;
				Thread.NORM_PRIORITY == 5;
			
			��û������̶߳�������ȼ� ����:
				int getPriority();
				void setPriority(int newPriority);
				(58��);
		
		Java �ṩһ���̵߳���������س�����������������״̬�������߳�, �̵߳����������̵߳����ȼ�����Ӧ�����ĸ��߳���ִ��;
		
		ͨ�� �����ȼ����߳� ������ ���ȼ��͵��߳� ִ�У�����������������
		��� ʵ�ʿ����в������� �������ȼ��������߳����д���;
		
		e.g. С֪ʶ��: ʱ��ת�ֵ����㷨;
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
		
		aa_1.setPriority(aa_1.NORM_PRIORITY + 3);		//�������ȼ�: ��Ĭ�����ȼ�(5)�� + 3;	//ÿ���̵߳�Ĭ�����ȼ���Ϊ 5;
		//aa_1.setPriority(aa_1.getPriority() + 3);		//����ͬ��;
		trd_1.setPriority(trd_1.MIN_PRIORITY);
		
		aa_1.start();
		aa_2.start();
		trd_1.start();
	}
}