/*
	Exception(�쳣) ���÷�_7
	
	�̳��쳣�Ĵ���
	������catch���࣬��catch���࣬�����catch���࣬������Ҳ����catch������쳣(��̬)���������޷�catch����Ӧ���쳣�������ʱ�����;
	
	��д���� �׳��쳣 �ķ�Χ ���ܴ��� ����д�����ų����쳣��Χ;
	35�� ����throws A��B, Ҳ����throws A,B  Ҳ���Բ�throws����������throws C;
	��"���า���˻��෽��ʱ�����෽���׳��쳣�ķ�Χ���ܴ��ڻ��෽���׳����쳣��Χ";
*/

class A extends Exception
{
}

class B extends A
{
}

class M
{
	public void compare(int i, int j) throws A, B
	{
		if (i > j)
			throw new A();
		else
			throw new B();
	}
}

class EM extends M
{
	//����throws A��B, Ҳ����throws A,B  Ҳ���Բ�throws����������throws C
	//��"���า���˻��෽��ʱ�����෽���׳��쳣�ķ�Χ���ܴ��ڻ��෽���׳����쳣��Χ"
	public void compare(int i, int j) throws A
	{
		
	}
	
	/*
	public void compare(int i, int j) throws B			//ok
	
	public void compare(int i, int j) throws A, B		//ok
	
	public void compare(int i, int j) throws A, B, C	//error
	*/
}

public class Test_Excep_7
{
	public static void main(String[] args)
	{
		M m_1 = new M()
		
		try
		{
			m_1.compare(6, 7)
		}
		catch (B bb)	//��catch���࣬��catch���࣬�����catch���࣬������Ҳ����catch������쳣(��̬)���������޷�catch����Ӧ���쳣�������ʱ�����;
		{
			System.out.printf("���ߴ���ǰ�ߣ�\n");
		}
		catch (A aa)
		{
			System.out.printf("ǰ�ߴ��ں��ߣ�\n");
		}
	}
}