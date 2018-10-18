/*
	Exception(�쳣)
	
	finally���÷�
	���� try ��ָ���ĳ�������Ƿ� �׳��쳣��Ҳ���� catch��� ���쳣�����Ƿ����������쳣������һ�£�
	finally �еĴ���һ����õ�ִ��;
	
	finally ���Ϊ�쳣�����ṩһ��ͳһ�ĳ��ڣ�ʹ���� �������� ת�� �������������֮ǰ��
	�ܹ��Գ����״̬��ͳһ�Ĺ���;
	
	ͨ���� finally ����п��Խ�����Դ�������������رմ򿪵��ļ���ɾ����ʱ�ļ���;
*/

import java.io.*;
import java.util.*;

class A
{
	int m;
	
	public int divide(int a, int b)
	{
		m = a/b;
		return m;
	}
}

public class Test_Excep_finally
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		
		try
		{
			aa_1.divide(6, 0);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.printf("catch�����쳣��\n\n");
		}
		finally	//���� try��û���׳��쳣��������û�� catch���쳣��finally��Ĵ��붼ִ��;
		{
			try
			{
				aa_1.divide(6, 0);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.printf("catch finally�������\n");
			}
		}
	}
}

/*
	���н��:
		java.lang.ArithmeticException: / by zero
        at A.divide(Test_Excep_finally.java:16)
        at Test_Excep_finally.main(Test_Excep_finally.java:29)
		catch�����쳣��

		java.lang.ArithmeticException: / by zero
        at A.divide(Test_Excep_finally.java:16)
        at Test_Excep_finally.main(Test_Excep_finally.java:44)
		catch finally�������

*/