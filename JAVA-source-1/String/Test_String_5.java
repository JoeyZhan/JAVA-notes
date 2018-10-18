/*
	String 的 常用方法 的用法_5
	
	统计String对象中 大小写字母，非字母，各自出现的个数;	
*/

public class Test_String_5
{
	public static void main(String[] args)
	{
		String str = "W1a2k3a4n5d6a Forever! ";
		
		int cntU = 0;	//大写个数
		int cntL = 0;	//小写个数
		int cntOther = 0;
		int i;
		
		//方法一：
		for (i = 0; i<str.length(); ++i)
		{
			char ch = str.charAt(i);
			
			if (Character.isUpperCase(ch))
				++cntU;
			else if (Character.isLowerCase(ch))
				++cntL;
			else
				++cntOther;
		}

		
		//方法一：
		/*
		for (i=0; i<str.length(); ++i)
		{
			char ch = str.charAt(i);
			
			if (ch >= 'A' && ch <='Z')
				++cntU;
			else if (ch >= 'a' && ch <= 'z')
				++cntL;
			else
				++cntOther;		
		}
		*/
		
		System.out.printf("大写字母个数：%d\n", cntU);
		System.out.printf("小写字母个数：%d\n", cntL);
		System.out.printf("非字母个数：%d\n", cntOther);

	}
}