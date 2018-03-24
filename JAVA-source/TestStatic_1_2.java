/*
	Static(��̬) ʵ��_2
	
	����������ã����� ֻ�� ����һ������
*/

class A
{
	public int i = 233;
	private static A aa = new A();
	
	private A()
	{
	}
	
	public static A getA()
	{
		return aa;
	}
}

public class TestStatic_1_2
{
	public static void main(String[] args)
	{
		A aa1 = A.getA();
		A aa2 = A.getA();
		
		aa1.i = 666;
		System.out.printf("%d\n", aa2.i);
		
		if (aa1 == aa2)
			System.out.printf("aa1 �� aa2 ���\n");
		else
			System.out.printf("aa1 �� aa2 �����\n");
		
//		A aa1 = new A();  // error ���A��Ĺ��췽����private�ģ���new A()�ͻᱨ��!
//		A aa2 = new A();  // ͬ��
	}
}

/*
	2018-03-24 17:43:01
	
	���н����
		666
		aa1 �� aa2 ���
	
	��᣺��Щ���ң��������ֻ������һ�� ����
		  ��Ϊ�β�ֱ�ӽ� �� �е� ���� ����ΪStatic(��̬),
		  �����������ɶ��ٶ�����ʹ�õĶ���ͬһ������
*/








