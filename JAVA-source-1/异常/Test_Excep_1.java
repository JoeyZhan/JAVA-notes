/*
	Exception(�쳣) ���÷�_1
	
	�����쳣-�������
*/

class A
{
	public int numb;
	
	public int divide(int a, int b)
	{
		numb = a / b;
		return numb;
	}
}

public class Test_Excep_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		
		try
		{
			int i = aa_1.divide(6, 0);		
		}
		catch(ArithmeticException e)	//e��������23���׳����쳣����;
		{
			e.printStackTrace();	//���Լ����Ϊ������쳣�ľ�����Ϣ;
			System.out.printf("\n�쳣���������\n\n");
		}
		
		System.out.printf("Test_Excep_1\n");
	}
}


/*
	���н����
		java.lang.ArithmeticException: / by zero
        at A.divide(Test_Excep_1.java:13)
        at Test_Excep_1.main(Test_Excep_1.java:26)

		�쳣���������

		Test_Excep_1

*/