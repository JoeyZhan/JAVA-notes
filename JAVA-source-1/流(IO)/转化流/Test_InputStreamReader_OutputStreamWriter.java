/*
	InputStreamReader �� OutputStreamWriter (ת����)
	(�����������ǰ�����)
	
		OutputStreamWriter�� �ǰ� OutputStream�� ת���� Writer�� ����
		InputstreamReader �ǰ� InputStream ת���� Reader
		OutputStreamWriter��InputStreamReader���ǰ�����
		
		readLine() ��س���������
		
			String str = "123";
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Str = br.readLine();
			
		�˳������ֱ������س��Ļ�����
		1. br.readLine() �ᶪ���س����������Ƿ��ػس�������	br.readline() �����س���ʱ��ֹ��ȡ�����һ�Ѷ�ȡ���Ļس����Զ�������;
		2. br.readLine(�����ص��� "" ������ null , "" ��ʾ���ַ���, null��ʾ��ָ�룬��ָ����ǿյ�ַ�����յ�ַ���ǲ�ָ���κδ洢��Ԫ����˼;
		
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
				BufferedReader(Reader in) ���β�Ϊ Reader���ͣ��� System.in ��Ϊ inputStream���͵ģ�
				������Ҫ InputStreamReader������ ȥ�� inputStream���� ת��Ϊ Reader����;
			*/
			String str = bis.readLine();
			System.out.println("str = " + str);
		}
		catch (Exception e){
		}
		
	}
}