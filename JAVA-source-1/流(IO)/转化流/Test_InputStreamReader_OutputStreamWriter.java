/*
	InputStreamReader 和 OutputStreamWriter (转换流)
	(这两种流都是包裹流)
	
		OutputStreamWriter流 是把 OutputStream流 转化成 Writer流 的流
		InputstreamReader 是把 InputStream 转化成 Reader
		OutputStreamWriter和InputStreamReader都是包裹流
		
		readLine() 与回车符的问题
		
			String str = "123";
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Str = br.readLine();
			
		此程序如果直接输入回车的话，则
		1. br.readLine() 会丢弃回车符，而不是返回回车符，即	br.readline() 遇到回车符时终止读取，并且会把读取到的回车符自动丢弃掉;
		2. br.readLine(）返回的是 "" 而不是 null , "" 表示空字符串, null表示空指针，空指针就是空地址，而空地址就是不指向任何存储单元的意思;
		
*/

import java.io.*;

public class Test_InputStreamReader_OutputStreamWriter
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
			/*
				BufferedReader(Reader in) 的形参为 Reader类型，而 System.in 则为 inputStream类型的，
				所以需要 InputStreamReader包裹流 去将 inputStream类型 转化为 Reader类型;
			*/
			String str = bis.readLine();
			System.out.println("str = " + str);
		}
		catch (Exception e){
		}
		
	}
}