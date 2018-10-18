/*
	Exception(异常) 的用法_7
	
	继承异常的处理
	必须先catch子类，再catch父类，如果先catch父类，而父类也可以catch子类的异常(多态)，子类则无法catch到对应的异常，则编译时会出错;
	
	重写方法 抛出异常 的范围 不能大于 被重写方法排除的异常范围;
	35行 可以throws A或B, 也可以throws A,B  也可以不throws，但不可以throws C;
	即"子类覆盖了基类方法时，子类方法抛出异常的范围不能大于基类方法抛出的异常范围";
*/

class A extends Exception
{
}

class B extends A
{
}

class M
{
	public void compare(int i, int j) throws A, B
	{
		if (i > j)
			throw new A();
		else
			throw new B();
	}
}

class EM extends M
{
	//可以throws A或B, 也可以throws A,B  也可以不throws，但不可以throws C
	//即"子类覆盖了基类方法时，子类方法抛出异常的范围不能大于基类方法抛出的异常范围"
	public void compare(int i, int j) throws A
	{
		
	}
	
	/*
	public void compare(int i, int j) throws B			//ok
	
	public void compare(int i, int j) throws A, B		//ok
	
	public void compare(int i, int j) throws A, B, C	//error
	*/
}

public class Test_Excep_7
{
	public static void main(String[] args)
	{
		M m_1 = new M()
		
		try
		{
			m_1.compare(6, 7)
		}
		catch (B bb)	//先catch子类，再catch父类，如果先catch父类，而父类也可以catch子类的异常(多态)，子类则无法catch到对应的异常，则编译时会出错;
		{
			System.out.printf("后者大于前者！\n");
		}
		catch (A aa)
		{
			System.out.printf("前者大于后者！\n");
		}
	}
}