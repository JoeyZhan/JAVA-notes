/*
	toString ���÷�_1
	
	���е��඼Ĭ���Զ��̳��� Object��;
	
	Object�� �е� toString���� Ĭ�Ϸ���(δ��д) ���� ������� �� �ö����ϣ��(�ڴ��ַ) ��ɵ�һ���ַ���;(31��)

	System.out.println(�������);
	ʵ��������Ǹö���� toString() ���������ص��ַ���;(25��);
	
	Ϊ��ʵ����Ҫ������������д�� ����Object �̳е� toString����;(37��)
*/

//Test_toString_1_1.java
class A
{
	
}

public class Test_toString_1_1
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		System.out.println(aa_1);
	}
}

/*
	���н����
		A@15db9742
*/

//Test_toString_1_2.java
class A	//���е��඼Ĭ���Զ��̳��� Object��;
{
	public String toString()	//��д�̳��� ����Object �� toString����;
	{
		return "this is A!";
	}
}

public class Test_toString_1_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		System.out.println(aa_1);	//������Ǹö���� toString() ���������ص��ַ���;
	}
}

/*
	���н����
		this is A!
*/