/*
	Super ���÷�_3

*/

class A
{
	public A()
	{
		System.out.printf("A��\n");
	}
	
	public A(int i)
	{
	}
}

class B extends A
{
	public B()
	{
		super(233);		//����Ѹ����ע�͵��Ļ��� �������Ĭ�ϵ����Զ����ص���super();
						//���������û���޲εĹ��캯������ᱨ��
						//һ������Ĺ��캯����ֻ�ܳ���һ�� super(...);
		System.out.printf("B��\n");
	}
}

class C extends B
{
	public C()
	{
		//int k = 10;	//����������Ч����������Ϊ�ᵼ��super()��䲻�ǹ��캯���ĵ�һ����䣻
						//super()��� ���������� ��ͨ��� ǰ�棻
		
		super();	//ÿ�����๹�췽���ĵ�һ����䣬���������ĵ���super(), �������û���޲εĹ��캯������ô�ڱ����ʱ��ͻᱨ��
					//super();  ��������д��Ҳ���Բ�д����д�Ļ���ϵͳ���Զ��������ص�super();
					//���д�����Ļ������������Ҫ������ǰ�治�ܼ��κ���䣬Ҳ����˵�������뱣֤�ǵ�һ����䣻
					//super() Ҳ���Ը�Ϊ super(2);   ��ǰ���Ǹ�������д�һ�������Ĺ��캯��������Ҳ�ᱨ��
					//�����36�и�Ϊ super(2), �����ʱ�ͻᱨ��
					
		System.out.printf("C��\n");
	}
}

public class TestSuper_3
{
	public static void main(String[] args)
	{
		C cc_1 = new C();
	}
}

