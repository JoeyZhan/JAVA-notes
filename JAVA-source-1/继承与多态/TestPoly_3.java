/*
	��̬���÷�_3
	
	�������ͨ�� �������ַ�������� �ķ�ʽ �� ���� ����Ӹ���̳й����Ķ���
	�������޷�ͨ�� ���ַ�ʽ ������ ������������еĳ�Ա��
	
*/

class A
{
	public void f()
	{
		System.out.printf("A��!\n");
	}
}

class B extends A
{
	public void f()
	{
		System.out.printf("B��!\n");
	}
	
	public void g()
	{
		System.out.printf("B��g����!\n");
	}
}

public class TestPoly_3
{
	public static void main(String[] args)
	{
		A aa_1 = new B();	//�ȼ���A aa; aa = new B();
		B bb_1 = new B();
		
		aa_1.f();
		//aa_1.g();		//error  ��̬ �޷�ͨ�� �������� ���� �������� ���г�Ա��
		bb_1.g();
	}
}