/*
	������(abstract)���÷�_2
	
*/

abstract class A
{
	public abstract void f();
}

class B extends A
{
	public void f()
	{
		System.out.printf("B��̳���A�����࣡\n");
	}
}

public class TestAbs_2
{
	public static void main(String[] args)
	{
	  //A aa_1 = new A();	//error	 �޷� new ��һ�� ���������;
		A aa_1;				//ok	 ������	����һ�� ����������;
		aa_1 = new B();		//ok	 ���������ĵ�ַ���������������;
		aa_1.f()			//ok	 ������ʵ�ֶ�̬;
	}
}

/*
	2018-04-05 13:37:36
	
	�ܽ᣺
		�������޷��������󣬼� �޷�new ��һ�� ���������
		�����Զ���һ�� ���������
		
		���������ͨ�� ���������ĵ�ַ�����������Ӧ��(25��) �ķ�ʽ �� ʵ�ֶ�̬��
*/