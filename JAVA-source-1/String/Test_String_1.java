/*
	String 的 常用方法 的用法_1

	字符串 和 整型 的相互转换;
*/

public class Test_String_1
{
	public static void main(String[] args)
	{
		int i = 123;
		String str = "456";
		
		//str = i;
		//i = str;	//error 
		
		str = String.valueOf(i);	//将 整型 转换成 字符串;
		System.out.printf("str = %s\n", str);
		
		i = Integer.parseInt(str);	//将 字符串 转化成 整型;
		System.out.printf("i = %d\n", i);
	}
}