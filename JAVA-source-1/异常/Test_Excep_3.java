/*
	Exception(异常) 的用法_3
	
	读写错误异常 的处理
*/
import java.util.*;

public class Test_Excep_3
{
	public static void main(String[] args)
	{
		int i;
		
		try
		{
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			System.out.printf("%d\n", i);
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
			System.out.printf("读写错误!\n");
		}
	}
}

/*
	2018-05-16 00:05:53
	
	本程序出现的问题是无法通过逻辑判断来解决的(e.g. 像if else相关的逻辑判断语句)，
	而Java提供的异常处理机制可以很好的解决这个问题;
*/