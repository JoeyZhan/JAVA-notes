/*
	Thread (�߳�) ���÷�_1
	
	Thread �Ĵ�������_1:
		����һ���̳�Thread����, ����дThread��run����;
		���������ü̳���Thread��start()����;
		
	Thread �� start()�����Ĺ��ܾ��� ����һ�����߳�,	���Զ����ø��̵߳� run()����, ֱ�ӵ��� run()�����ǲ��ᴴ��һ���µ��̵߳�;
	
	ִ��һ���߳�ʵ���Ͼ���ִ�и��̵߳� run()���� �еĴ���;
	
	ִ���� ������.start();����(29��) �� ������ʾ�ö��� ����Ӧ���߳̾�һ���� �����õ�ִ��,
	������.start(); ִ�����ֻ�Ǳ�ʾ �ö����߳� �����˿��Ա�CPUִ�е��ʸ񣬵���������ռCPUִ�е��̺߳ܶ࣬
	CPU ����һ�� ������ȥִ�и� ���� ����Ӧ���߳�;
	
	һ��Thread��������ֻ�ܴ���һ���߳�
	һ��Thread�����ܵ������� start() ����, ������׳� java.lang.IllegalThreadStateException �쳣;
*/

class A extends Thread	//����һ���̳�Thread����
{
	public void run()	//��дThread��run����
	{
		while(true)
			System.out.println("A");
	}
}

public class Test_Thread_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		aa_1.start();	//���ü̳���Thread��start()����
		//aa_1.start();		//exception: java.lang.IllegalThreadStateException,	
							//һ��Thread�������ҽ��ܴ���һ���̣߳�һ��Thread�����ܵ�������start()����;
		while(true)
			System.out.println("main");
	}
}