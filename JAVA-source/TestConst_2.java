/* 
	������캯�����ܴ����ĳ�ͻ
*/

class A
{
	private int i;
	//�����9-11�д���ע�͵��������ͻᱨ��
	public A()
	{
	}//11
	
	public A(int j)
	{
		i = j;
	}
}

class TestConst_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		A aa_2 = new A(1);
	}
}

/*
	2018-03-13 14:24:05
	
	һ�������Ϊ�ඨ���˹��췽����ϵͳ�Ͳ����ṩĬ�ϵĹ��췽���ˣ�
	
	��һ�����󱻴���ʱ��������и������͵ĳ�Ա�����Զ����г�ʼ����ֵ��
	
	��Ա��������					��ʼ��
	byte							0
	short                           0
	int								0
	long							0L
	
	float							0.0F
	double							0.0D
	
	char							'\u0000'(��ʾΪ��)
	boolean							False
	
	All reference type				Null
*/