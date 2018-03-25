/*
	extends(继承) 的用法_1

	语法：class 类名 extends 继承类名
*/

class human
{
	public String name = "Lebron";
	public int age = 23;
}

class student extends human		//继承human的属性
{
	public double score = 98;
}

class graduate extends student		//继承student的属性
{
	public String teacher = "LBJ";
}

public class TestExtends_1
{
	public static void main(String[] args)
	{
		graduate gd = new graduate();
		System.out.printf("%s %d %f %s", gd.name, gd.age, gd.score, gd.teacher);
	}
}

/*
	2018-03-25 23:00:32
	
	疑问：String是什么意思？
*/