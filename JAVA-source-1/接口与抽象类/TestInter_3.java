/*
	interface(�ӿ�)	���÷�_3
	
*/

interface It
{
	public static final int i = 233;
	public abstract void f();
	public abstract void j();
}

abstract class It_2 implements It	//���һ����ֻʵ����һ���ӿڵĲ��ַ�����������������Ϊ�����࣬����ǰ������η� abstract;
{
	public void f()
	{
		System.out.printf("A��ʵ��It�ӿ�!\n");
	}
}

class A
{
	public int a;
}

class B extends A implements It		//һ��������ڼ̳�һ�������ͬʱʵ��һ�������ӿ�;
{									//�� extends ������ implements ֮ǰ;
	public void f()
	{
	}
	public void j()
	{
	}
}

public class TestInter_3
{
	public static void main(String[] args)
	{
		
	}
}