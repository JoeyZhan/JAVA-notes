/*
	Thread (�߳�) ���÷�_2
	
	Thread �Ĵ�������_2:
		����һ��ʵ���� Runnable�ӿڵ���;
		���� �������;
		���� ������� ����һ�� Thread����, ������start()����;
*/

class A implements Runnable
{
	public void run()
	{
		while(true)
			System.out.println("A");
	}
}

class B
{
}

public class Test_Thread_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		
		Thread trd_1 = new Thread(aa_1);	//public Thread(Runnable target);
		trd_1.start();
		
		//B bb_1 = new B();
		//Thread trd_2 = new Thread(bb_1);	//error	B��Ϊʵ��Runnable�ӿڣ�Thread�еĹ��캯�����β�ΪRunnable����(26��ע��);
		
		while(true)
			System.out.println("main");
	}
}