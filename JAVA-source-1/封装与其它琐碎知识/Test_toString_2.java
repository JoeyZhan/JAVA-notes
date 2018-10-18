/*
	toString 的用法_2
	
	所有的类都默认自动继承了 Object类;
	
	Object类 中的 toString方法 默认返回(未重写) 的是 类的名字 和 该对象哈希码(内存地址) 组成的一个字符串;

	System.out.println(类对象名);
	实际输出的是该对象的 toString() 方法所返回的字符串;
	
	为了实际需要，建议子类重写从 父类Object 继承的 toString方法;
*/

class Point
{
	private int i, j;
	
	public Point(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	public String toString()	//重写从 父类Object 继承的 toString方法;
	{
		return "[" + i + "," + j + "]";
	}
}

public class Test_toString_2
{
	public static void main(String[] args)
	{
		Point p_1 = new Point(2, 3);
		Point p_2 = new Point(6, 9);
		
		System.out.println(p_1);
		System.out.println(p_2);
	}
}

/*
	运行结果：
		[2,3]
		[6,9]

*/