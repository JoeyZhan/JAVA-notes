/*
	this指针的使用_2
	
	this.i = i;
*/

class A
{
	private int i = 666;
	
	public A(int i)
	{
		//this.i = i;	将形参i赋给该构造方法本次运行创建的那个新对象的i数据成员
					  //即 将第9行的形参 i 赋给 第7行的类属性 i;

		System.out.printf("%d\n", i);		//这里的 i 是第9行的形参 i；
		System.out.printf("%d\n", this.i);	//这里的 i(this.i) 是第7行的类属性 i；
	}
	
	public void show()
	{
		System.out.printf("%d", this.i);	//等价于System.out.printf("%d", i);		因为this代表正在调用show方法的对象;
											//这里的i是第7行的类属性 i;
											//并且这里的 this 可以省略;
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
	2018-03-16 23:10:33

	TestThis_2.2.java
----------------------------
//关于使用this有何意义的举例

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