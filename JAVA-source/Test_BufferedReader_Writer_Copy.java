/*
	BufferedReader �� BufferedWriter (�ַ�������)
	
		�ַ����������� �ı��ļ�����_1
*/

import java.io.*;

public class Test_BufferedReader_Writer_Copy
{
	public static void main(String[] args) throws IOException
	{
		String str = null;
		
		BufferedReader br = new BufferedReader(new FileReader("Test_BufferedReader_Writer_Copy.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("Test.txt"));
		
		str = br.readLine();		//��һ���ַ���
		while (null != str)
		{
			bw.write(str);
			bw.newLine();			//д��һ���зָ���
			str = br.readLine();
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}