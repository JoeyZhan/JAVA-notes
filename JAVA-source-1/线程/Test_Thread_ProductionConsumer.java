/*
	Thread (线程) 的用法_12
	
	Thread 的同步_2
	
		生产消费
			Quetion: 一个仓库最多容纳10个产品，制造商现在要制造20件及更多产品存入仓库中，销售者则要从仓库取出这20件及更多产品来出售;
					制造商制造产品和销售者取出产品的速度很可能是不一样的，编程实现两者的同步;
					
	同步的相关方法
		wait(阻塞)
			使用方法:	xx.wait()
			作用:	将执行 xx.wait() 的当前线程转入阻塞状态, 让出CPU的控制权;
					释放对该 对象(xx) 的锁定;
		
		notify(唤醒)
			使用方法:	xx.notify()
			作用:	假设执行 xx.notify() 的 当前线程 为 T1;
					如果当前时刻有其他线程 因为 执行了 xx.wait() 而陷入阻塞状态, 则叫醒其中一个线程, 具体叫醒哪个，这由系统调度器控制，程序员无法控制;
					(所谓 叫醒某个线程 就是 令该线程 从因为 wait 而陷入阻塞状态 转入 就绪状态);
			
			另外 即使没有其它线程陷入阻塞, 也可以执行 notify, 即 就算一个线程都没叫醒也可以;
				
		notifyAll
			使用方法:	xx.notifyAll()
			作用:	叫醒其他所有因为执行了 xx.wait() 而陷入阻塞状态的线程;
*/
import java.util.Scanner;

class SynStack
{
	private char[] data = new char[10];
	private int cnt = 0;
	
	public synchronized void push(char c)
	{
		while (cnt == data.length)		//循环检测	//不能用 if语句;
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
		System.out.printf("容器 %d 存入: %c\n", cnt, c);
		System.out.printf("%s 生产出 %d 号产品, 内容: %c\n\n", Thread.currentThread().getName(), cnt, c);
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

		System.out.printf("容器 %d 取出: %c\n", cnt, data[cnt-1]);
		System.out.printf("%s 出售出 %d 号产品, 内容: %c\n\n", Thread.currentThread().getName(), cnt, data[cnt-1]);
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
		
		System.out.printf("请输入需要生产产品数量:");
		cnt = sc.nextInt();
		Production prd = new Production(syn, cnt);
		
		System.out.printf("请输入需要销售产品数量:");
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