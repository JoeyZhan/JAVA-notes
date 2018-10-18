/*
	PrintStream 
		
		Print��
			
			Print ��ֻ�����������
			
		Print��������
		
			Writer �� write ��������д��:
				һ���ַ�
				һ���ַ�����
				һ���ַ������һ����
				һ���ַ���
				һ���ַ���һ����
			
			OutputStream �� write ��������д��:
				һ���ֽ�
				һ���ֽ�����
				һ���ֽ������һ����
				
			DataOutputStream ������д��:
				һ���ֽ�
				һ���ֽ�����(�̳���OutputStream)
				һ���ֽ������һ����
				���еĻ����������ݵĶ����ƴ���
					e.g. WriteDouble(8.8); д����� 8.8 �Ķ����ƴ��룬��ռ8���ֽ�
					
			PrintStream ���� print ����д��:
				���л��������������͵��ַ���ʽ��ʾ
					e.g. print(8.8); д�����'8''.''8'�������ַ�����ռ3���ֽ�
					
		
		PrintStream �� OutputStream ����֮���ṩ����ǿ�Ĺ��ܣ������Է�������������������(����������byte��)�ĸ�ʽ����ʾ��ʽ;
		
		PrintStream ������ print �� println ���������ڸ��ֲ�ͬ�������ݵĸ�ʽ�����;
		
		DataOutputStream �е� writeXXX(data)�����ǰ�data���ڴ��еĶ���������д���ļ�;
		
		PrintStream �е� println(data) д�����Ǹ����ݵĸ�ʽ������ַ���;

		//��ʽ�������ָ��һ�����������ַ�����ʽ���;
*/

import java.io.*;

public class Test_PrintStream_1
{
	public static void main(String[] args) throws IOException
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("test_1.txt"));
		dos.writeLong(1234567890);		//DataOutputStreamд����Ƕ�����;
		dos.close();
		
		PrintStream ps = new PrintStream(new FileOutputStream("test_2.txt"));
		ps.println(1234567890);			//PrintStreamд������ַ�: '1' '2' '3'...;
		ps.close();
	}
}