/*
	��̬���÷�
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

public class TestPoly
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		B bb_1 = new B();
		
		aa_1.f();
		bb_1.f();
		
		aa_1 = bb_1;	//��bb_1����aa_1����������Ϊ������Ե������࿴�������Ա����ok;
	  //bb_1 = aa_1;	//��aa_1����bb_1��������������Ϊ���಻�ܵ������࿴�������Ա����error;
		aa_1.f();
	}
}

/*
	2018-03-30 23:21:39
	
	���н����
		A�࣡
		B��!
		B�࣡
		
	------------
	��᣺
		�������Ϊ è���Ե��������������������ﲻ�ܵ���è��������
*/