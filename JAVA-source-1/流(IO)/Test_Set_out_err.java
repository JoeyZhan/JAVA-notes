/*
	��׼����������ض���

		����ʵ���� ���������������������ļ������쳣�ٰ��쳣��ϢҲ�������Ӧ���ļ��У�
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
			
			System.setOut(psOut);	//�ض��� out ����Ĺ����豸, System.out.println()Ĭ�Ϲ����豸Ϊ��ʾ��;
			System.setErr(psErr);	//�ض��� Err ����Ĺ����豸, System.err.println()Ĭ�Ϲ����豸Ϊ��ʾ��;
			
			while (true)
			{
				int num = sc.nextInt();		//�������int����ʱ����������쳣;
				System.out.println(num);
			}
		}
		catch (Exception e)
		{
			System.err.println("�쳣��������Ϣ��");
			e.printStackTrace();
		}
	}
}