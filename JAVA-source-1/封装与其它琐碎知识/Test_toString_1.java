/*
	toString 的用法_1
	
	所有的类都默认自动继承了 Object类;
	
	Object类 中的 toString方法 默认返回(未重写) 的是 类的名字 和 该对象哈希码(内存地址) 组成的一个字符串;(31行)

	System.out.println(类对象名);
	实际输出的是该对象的 toString() 方法所返回的字符串;(25行);
	
	为了实际需要，建议子类重写从 父类Object 继承的 toString方法;(37行)
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
	运行结果：
		A@15db9742
*/

//Test_toString_1_2.java
class A	//所有的类都默认自动继承了 Object类;
{
	public String toString()	//重写继承自 父类Object 的 toString方法;
	{
		return "this is A!";
	}
}

public class Test_toString_1_2
{
	public static void main(String[] args)
	{
		A aa_1 = new A();
		System.out.println(aa_1);	//输出的是该对象的 toString() 方法所返回的字符串;
	}
}

/*
	运行结果：
		this is A!
*/