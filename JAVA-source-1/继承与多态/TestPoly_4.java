/*
	��̬���÷�_4
		ʵ������һ������ʵ�ֵ���A  B  C ����� f�����ĺ��� 
*/

class A
{
	public void f()
	{
		System.out.printf("A�࣡\n");
	}
}

class B extends A
{
	public void f()
	{
		System.out.printf("B�࣡\n");
	}
}

class C extends B
{
	public void f()
	{
		System.out.printf("C�࣡\n");
	}
}

public class TestPoly_4
{
	//m��������ʵ�� ���� ����A���� ���ж���f�����Ĺ��ܣ�
	public static void m(A aa)
	{
		aa.f();
	}
	
	public static void main(String[] args)
	{
		A aa_1 = new A();
		B bb_1 = new B();
		C cc_1 = new C();
		
		m(aa_1);
		m(bb_1);
		m(cc_1);
	}
}