/*
	interface(�ӿ�) ���÷�_2
	
*/

interface It
{
	public static final int i = 233;
	public abstract void f();
}

interface It_2
{
	int j = 666;
	void j();
}

/*	error	It�ǽӿڣ�һ����ֻ��implements(ʵ��)ĳ���ӿڣ������� extends(�̳�) ĳ���ӿ�;
class B extends It		//class B implements It{}	//ok
{
}
*/

//	ok	�ӿڿ��Լ̳нӿ�;
interface extIt extends It
{
}
//	ok  �ӿڲ������Լ̳нӿڣ����ҿ��Լ̳ж���ӿڣ����ӿ������̳У�
interface extIt_2 extends It, It_2
{
}

public class TestInter_2
{
	public static void main(String[] args)
	{
		
	}
}