/*
	Exception(�쳣) ���÷�_5
	
	�����쳣�ĵڶ��ַ�ʽ: throws;
	���벶�񲢴�����쳣-IOException
	
	throws ����ʾ�÷��� һ�� ���׳��쳣���÷���Ҳ���Բ��׳��쳣��
	
	���飺�� throws ���������쳣���д���
		  ���һ�������ڲ��Ѿ����쳣���д�����Ͳ�Ҫ�� throws;
*/

import java.io.*;

class A
{
	public void f() throws IOException	//throws IOException ��ʾ����f����ʱ��f���� ���� ���׳�IOException���쳣����������� f���� ʱ����ö� f���� �����׳��� IOException���쳣���в�׽;
	{
		throw new IOException();	//throw �׳��쳣;
		//IOException - �̳��� Exception ���ֲ��� RuntimeException ���쳣�����ڱ��벶�񲢴�����쳣;
	}
	
	public void g()
	{
		throw new ArithmeticException();
		//ArithmeticException - �̳��� RuntimeException ���쳣�����ڿɴ���Ҳ�ɲ�������쳣;
	}
}

public class Test_Excep_5
{
	public static void main(String[] args) //throws IOException	//�����쳣�ĵڶ��ַ�����throws, �����������д�������Java���������;
	{
		A aa_1 = new A();
		
		try	//�����쳣�ĵ�һ�ַ���;
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
	���н��:
		java.io.IOException
        at A.f(Test_Excep_5.java:14)
        at Test_Excep_5.main(Test_Excep_5.java:33)

*/