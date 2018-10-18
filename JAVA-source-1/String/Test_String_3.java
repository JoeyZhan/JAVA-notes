/*
	String 的 常用方法 的用法_3
	
*/

public class Test_String_3
{
	public static void main(String[] args)
	{
		String s1 = "Welcome to Java World!";
		
		System.out.println(s1.startsWith("Welcome"));	//true
		System.out.println(s1.endsWith("World"));		//false  "World!"
		
		String sL = s1.toLowerCase();
		String sU = s1.toUpperCase();
		
		System.out.println(sL);		//welcome to java world!
		System.out.println(sU);		//WELCOME TO JAVA WORLD!
		
		String subS = s1.substring(11);
		System.out.println(subS);	//Java World!
		
		String s2 = " sun java ";
		
		String sp = s2.trim();		
		System.out.println(sp);		//sun java
	}
}