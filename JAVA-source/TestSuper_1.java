/*
	Super ���÷�
	
	super �����ã����� ���� ���� ���� �� ���캯����
*/

class A
{
	public int i;
	public int j;
	
	public A()
	{
	}
	
	public A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
}

class B extends A
{
	public int k;
	
	public B()
	{
	}
	
	public B(int i, int j, int k)
	{
		super(i, j);	//super Ӧ������ͨ���ǰ�棻����superֻ�ܱ� ���캯�� ���ã���ͨ�����޷�����super��
		this.k = k;
	}
}

public class TestSuper_1
{
	public static void main(String[] args)
	{
		B bb_1 = new B(233, 666, 236);
		System.out.printf("%d %d %d\n", bb_1.i, bb_1.j, bb_1.k);
	}
}