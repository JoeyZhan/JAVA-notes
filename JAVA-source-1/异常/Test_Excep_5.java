/*
	Exception(异常) 的用法_5
	
	处理异常的第二种方式: throws;
	必须捕获并处理的异常-IOException
	
	throws 不表示该方法 一定 会抛出异常，该方法也可以不抛出异常；
	
	建议：对 throws 出的所有异常进行处理
		  如果一个方法内部已经对异常进行处理，则就不要再 throws;
*/

import java.io.*;

class A
{
	public void f() throws IOException	//throws IOException 表示调用f方法时，f方法 可能 会抛出IOException类异常，建议你调用 f方法 时，最好对 f方法 可能抛出的 IOException类异常进行捕捉;
	{
		throw new IOException();	//throw 抛出异常;
		//IOException - 继承自 Exception 但又不是 RuntimeException 的异常，属于必须捕获并处理的异常;
	}
	
	public void g()
	{
		throw new ArithmeticException();
		//ArithmeticException - 继承自 RuntimeException 的异常，属于可处理也可不处理的异常;
	}
}

public class Test_Excep_5
{
	public static void main(String[] args) //throws IOException	//处理异常的第二种方法：throws, 本方法不进行处理，交给Java虚拟机处理;
	{
		A aa_1 = new A();
		
		try	//处理异常的第一种方法;
		{
			aa_1.f();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

/*
	运行结果:
		java.io.IOException
        at A.f(Test_Excep_5.java:14)
        at Test_Excep_5.main(Test_Excep_5.java:33)

*/