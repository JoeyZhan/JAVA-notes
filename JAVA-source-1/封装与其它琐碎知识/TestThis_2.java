/*
	thisָ���ʹ��_2
	
	this.i = i;
*/

class A
{
	private int i = 666;
	
	public A(int i)		//ע�⣡�������캯�����β�ֻ���ڹ��캯������������������������Լ��������캯���ж��޷��������������
	{
		//this.i = i;	���β�i�����ù��췽���������д������Ǹ��¶����i���ݳ�Ա
					  //�� ����9�е��β� i ���� ��7�е������� i;

		System.out.printf("%d\n", i);		//����� i �ǵ�9�е��β� i��
		System.out.printf("%d\n", this.i);	//����� i(this.i) �ǵ�7�е������� i��
	}
	
	public void show()
	{
		System.out.printf("%d", this.i);	//�ȼ���System.out.printf("%d", i);		��Ϊthis�������ڵ���show�����Ķ���;
											//�����i�ǵ�7�е������� i;
											//��������� this ����ʡ��;
	}
}

public class TestThis_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A(233);
		aa_1.show();
	}
}

/*
	2018-03-17 00:24:21
	���ʣ�22�� �е� this.i �� i ��Ϊ ��7�е������� i�� ��ô��11�еĹ��캯���е��β� i ������� show����(����)�������
	�𣺹��캯���е��β� i �޷��� show����(����)�������׼ȷ��˵��Ӧ�����޷����κ� �����ڵĹ��캯�� ֮��ĺ������캯���������
		��ֻ���� ���ڵĹ��캯���� �������������
*/

/*
	2018-03-16 23:10:33

	TestThis_2.2.java
----------------------------
//����ʹ��this�к�����ľ���

class Student
{
	private String name;
	private int age;
	
	public Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void showInformation()
	{
		System.out.printf("name = %s, age = %d\n", this.name, this.age);
	}
}

public class TestThis_2.2
{
	public static void main(String[] args)
	{
		Student Stu_1 = new Student(a, 18);
	}
}










*/