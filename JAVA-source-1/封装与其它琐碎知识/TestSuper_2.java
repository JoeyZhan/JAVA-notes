/*
	Super ���÷�_2
	
*/

class A
{
	public int i;
	
	A(int i)
	{
		this.i = i;
	}
}

class B extends A
{
	public B()
	{
		super(2);  //����������ע�͵���������
				   //��Ϊ �����๹�캯�� �������дsuper(...)��
				   //��Ĭ�ϵĻ����super();
	}
}

public class TestSuper_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A(233);
		B bb_1 = new B();
	}
}