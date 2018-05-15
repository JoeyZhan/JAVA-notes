/*
	Exception(异常) 的用法_2
	
	try{}catch{} 语句赋值的问题
*/

public class Test_Excep_2
{
	public static void main(String[] args)
	{
		int i;
		//int i = 0;	//任意赋个值;
		try
		{
			i = 666;
			System.out.printf("i = %d\n", i);
		}
		catch(Exception e)
		{
			
		}
		
		System.out.printf("i = %d\n", i);	//error  java编译器认为  i 变量 可能 尚未初始化，因为14行代码放在 try语句中，
							//	 java编译器认为放在try语句中的都说明 有可能出错，所以它在 编译时 自动忽略 14行代码，而在 运行时 又顺利执行；
							//	 解决方法：11行;
	}
}


/*
	运行结果：
		Test_Excep_2.java:22: 错误: 可能尚未初始化变量i
                System.out.printf("i = %d", i);
                                            ^
		1 个错误

		
	疑问：
		java编译器认为放在try语句中的都说明 有可能出错，它在 编译时 自动忽略 14行代码，而在 运行时 又顺利执行；
		这是否能说明，try{}catch{} 中的 语句 只会在 运行时 执行？？？
*/
