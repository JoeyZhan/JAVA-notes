/*
	interface(�ӿ�) ���÷�_4
	
*/

interface It
{
	public static final int i = 233;
	public abstract void f();
}

class A implements It
{
	public void f()
	{
		System.out.printf("A��ʵ��It�ӿڣ�\n");
	}
}

public class TestInter_4
{
	public static void main(String[] args)
	{
		//It it_1 = new It();	//error	  �ӿ��ǳ���ģ��޷�ʵ�廯;
		//�����Զ���һ�� �ӿ��������͵ı��� ������ָ�� ʵ�ֽӿڵĶ��󣬴ﵽ��̬��Ŀ�ģ�
		It it_1 = new A();
		it_1.f();
	}
}