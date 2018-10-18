/*
	thisָ���ʹ��_1
	
	this��һ�� ϵͳ������ָ�� ���Զ������� �Ǿ�̬ �ĳ�Ա���������б��У�
*/

class A
{
	private int i;
	
	public A(int j)
	{
		i = j;
	}
	
	//����� show ����(����) ֻ������һ���ռ䣬���۶����˶��� A��Ķ���������Ķ���ֻ��ʹ����ͬһ�� show������
	public void show()	
	{
		System.out.printf("i = %d", i);		//����� i �� ��9�� �������� i;
	}
	/*
	��c���Ե�д������⣺
	void show(A * this)
	{
		printf("i = %d\n", (*this).i);
	}
	*/
}

public class TestThis_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A(233);
		A aa_2 = new A(666);	//���ﶨ��� ���� �����ڴ���ֱ�����˲�ͬ���ڴ�ռ䣻
		
		aa_1.show();			//������ show����(����) ���ڴ���ֻ������һ���ռ䣬Ҳ����˵ aa_1��aa_2 ʹ�õ���ͬһ�� show����(����)��
		aa_2.show();
		/*
		��c���Ե�д������⣺
		aa_1.show(aa_1);
		aa_2.show(aa_2);	
		*/
	}
}

/*
	2018-03-16 13:39:26
	
	��̬�����ڲ� û�� thisָ��;
*/

/*
	2018-03-16 13:43:22
	
	TestThis_1.2.java
-------------------------
	class A
	{
		private int i;
		
		public A(int j)
		{
			i = j;
		}
		
		public void show()                                   //	aa_1 �� aa_2 ���ڴ��зֱ��и��Ե� ���ݳ�Աi��
		{                                                    //	����aa_1 �� aa_2 ����show()������
			System.out.printf("i = %d", i);                  //	show�������֪������� i Ӧ�����ĸ������е� i �أ�
		}                                                    
	}                                                        //	ʵ����ÿ����static�����ж���������һ�� thisָ�룬
															 //	ָ��ǰ���ڵ��ø÷����Ķ���
	public class TestThis_1.2()
	{
		public static void main(String[] args)
		{
			A aa_1 = new A(233);
			A aa_2 = new A(666);
			
			aa_1.show();
			aa_2.show();
		}
	}
*/