/*
	StringBuffer 的用法_1
	
*/

public class Test_StringBuffer_1
{
	public static void main(String[] args)
	{
		StringBuffer strB = new StringBuffer();
		
		strB.append("Lebron");		//为该对象添加字符序列;
		strB.append("23");
		
		System.out.println(strB);	//Lebron23
		
		strB.insert(6, "--");		//指定位置插入字符序列;		
		
		System.out.println(strB);	//Lebron--23
		
		strB.delete(3, 7);			//删除指定的字符;	((n+1) 到 n);
		
		System.out.println(strB);	//Leb-23
		
		strB.reverse();				//将字符序列逆序;
		
		System.out.println(strB);	//32-beL
		
		//StringBuffer str = strB.toString();	//error    String无法转换为StringBuffer;
		String str = strB.toString();
		
		System.out.println(str);	//32-beL
		
	}
}