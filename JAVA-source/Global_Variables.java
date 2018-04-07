/*
	Global variables(全局变量) 的相关问题
	
*/

class Gvar
{
	int i;
	//i = 233;	//error	  全局变量只能 在定义时 或者 在方法中(13行) 进行赋值初始化;
	
	public void f()
	{
		i = 666;
		
		System.out.printf("%d\n", i);
	}
}

public class Global_Variables
{
	public static void main(String[] args)
	{
		
	}
}