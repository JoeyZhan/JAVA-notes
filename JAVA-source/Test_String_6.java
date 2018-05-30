/*
	String 的 常用方法 的用法_6
	
	统计一个字符串在另一个字符串中出现的次数;
*/

public class Test_String_6
{
	public static void main(String[] args)
	{
		String str1 = "abcdasabcdasdbabc";
		String str2 = "abc";
		int index = -1;
		int cnt = 0;
		
		index = str1.indexOf(str2);
		while (-1 != index)
		{
			++cnt;
			index = str1.indexOf(str2, index + str2.length());
		}
		
		System.out.printf("cnt = %d\n", cnt);
	}
}