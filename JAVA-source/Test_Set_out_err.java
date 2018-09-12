/*
	标准输入输出的重定向

		程序实现了 将键盘输入的数据输出到文件里，如果异常再把异常信息也输出到对应的文件中！
*/

import java.io.*;
import java.util.Scanner;

public class Test_Set_out_err
{
	public static void main(String[] args)
	{
		PrintStream psOut = null;
		PrintStream psErr = null;
		Scanner sc = null;
		
		try
		{
			psOut = new PrintStream("psOut.txt");
			psErr = new PrintStream("psErr.txt");
			sc = new Scanner(System.in);
			
			System.setOut(psOut);	//重定向 out 输出的关联设备, System.out.println()默认关联设备为显示器;
			System.setErr(psErr);	//重定向 Err 输出的关联设备, System.err.println()默认关联设备为显示器;
			
			while (true)
			{
				int num = sc.nextInt();		//当输入非int数据时，将会出现异常;
				System.out.println(num);
			}
		}
		catch (Exception e)
		{
			System.err.println("异常！出错信息：");
			e.printStackTrace();
		}
	}
}