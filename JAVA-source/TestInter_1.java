/*
	Interface(�ӿ�) ���÷�_1
	
*/

interface It
{
	public static final int i = 233;
	//�ӿ��ж�������Ա����� public static final;
	public abstract void f();
	//�ӿ��ж���ķ��������� public abstract;	��˽ӿ��еķ����������з�����;
	
	//����Щ���η��ڽӿ��п���ʡ�ԣ���Ϊ�ӿ��ж�������Ժͷ����������������͵�;
	//int i = 233	//ok
	//void f();		//ok
}

class B implements It	//implements(ʵ��)
{
	public void f()
	{
	  //i = 666;	//error	  �ӿ��ж�������Ե�ֵ��ʵ�����в��ܱ�����, ��Ϊ����final���ι�;
		System.out.printf("%d\n", i);
	}
}

public class TestInter_1
{
	public static void main(String[] args)
	{
		It aa_1 = new B();
		aa_1.f();
	}
}