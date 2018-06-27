/*
	Thread (�߳�) ���÷�_12
	
	Thread ��ͬ��_2
	
		��������
			Quetion: һ���ֿ��������10����Ʒ������������Ҫ����20���������Ʒ����ֿ��У���������Ҫ�Ӳֿ�ȡ����20���������Ʒ������;
					�����������Ʒ��������ȡ����Ʒ���ٶȺܿ����ǲ�һ���ģ����ʵ�����ߵ�ͬ��;
					
	ͬ������ط���
		wait(����)
			ʹ�÷���:	xx.wait()
			����:	��ִ�� xx.wait() �ĵ�ǰ�߳�ת������״̬, �ó�CPU�Ŀ���Ȩ;
					�ͷŶԸ� ����(xx) ������;
		
		notify(����)
			ʹ�÷���:	xx.notify()
			����:	����ִ�� xx.notify() �� ��ǰ�߳� Ϊ T1;
					�����ǰʱ���������߳� ��Ϊ ִ���� xx.wait() ����������״̬, ���������һ���߳�, ��������ĸ�������ϵͳ���������ƣ�����Ա�޷�����;
					(��ν ����ĳ���߳� ���� ����߳� ����Ϊ wait ����������״̬ ת�� ����״̬);
			
			���� ��ʹû�������߳���������, Ҳ����ִ�� notify, �� ����һ���̶߳�û����Ҳ����;
				
		notifyAll
			ʹ�÷���:	xx.notifyAll()
			����:	��������������Ϊִ���� xx.wait() ����������״̬���߳�;
*/
import java.util.Scanner;

class SynStack
{
	private char[] data = new char[10];
	private int cnt = 0;
	
	public synchronized void push(char c)
	{
		while (cnt == data.length)		//ѭ�����	//������ if���;
		{
			try{
				this.wait();			
			}
			catch(Exception e){
			}
		}
		this.notify();					
		
		data[cnt] = c;
		++cnt;
		System.out.printf("���� %d ����: %c\n", cnt, c);
		System.out.printf("%s ������ %d �Ų�Ʒ, ����: %c\n\n", Thread.currentThread().getName(), cnt, c);
	}
	
	public synchronized void pop()
	{
		while (cnt == 0)
		{
			try{
				this.wait();
			}
			catch(Exception e){
			}
		}
		this.notify();

		System.out.printf("���� %d ȡ��: %c\n", cnt, data[cnt-1]);
		System.out.printf("%s ���۳� %d �Ų�Ʒ, ����: %c\n\n", Thread.currentThread().getName(), cnt, data[cnt-1]);
		--cnt;
	}
}

class Production implements Runnable
{
	private SynStack syn = null;
	private int cnt = 0;
	
	public Production(SynStack syn, int cnt)
	{
		this.syn = syn;
		this.cnt = cnt;
	}
	
	public void run()
	{		
		for(int i=0; i<cnt; ++i)
		{
			syn.push((char)('a'+i));
		}
	}
}

class Consumer implements Runnable
{
	private SynStack syn = null;
	private int cnt = 0;
	
	public Consumer(SynStack syn, int cnt)
	{
		this.syn = syn;
		this.cnt = cnt;
	}
	
	public void run()
	{		
		for(int i=0; i<cnt; ++i)
		{
			try{
				Thread.sleep(10);
			}
			catch(Exception e){
			}
			syn.pop();
		}
	}
}

public class Test_Thread_ProductionConsumer
{
	public static void main(String[] args)
	{
		SynStack syn = new SynStack();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		System.out.printf("��������Ҫ������Ʒ����:");
		cnt = sc.nextInt();
		Production prd = new Production(syn, cnt);
		
		System.out.printf("��������Ҫ���۲�Ʒ����:");
		cnt = sc.nextInt();
		Consumer csm = new Consumer(syn, cnt);
		
		Thread trdPrd = new Thread(prd);
		trdPrd.setName("Prodcution-Thread");
		Thread trdCsm = new Thread(csm);
		trdCsm.setName("Consumer-Thread");
		
		trdPrd.start();
		trdCsm.start();
	}
}