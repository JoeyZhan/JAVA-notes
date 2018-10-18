/*
	ByteArrayInputStream/OutputStream �� DataInputStream/OutputStream (������)
	
		��һ������������д���ֽ�����Ȼ���ٴ��ֽ����������_����_1
		
			��һ��long���͵�����д��byte������,Ȼ���ٴ�byte�����ж�ȡ�����long���͵�����
			  
			��Ϊ�������о���Ҫ����ֵ�����ݴ���byte������Ȼ������DatagramPacket�������紫�䵽Ŀ�ļ������
			Ŀ�ļ�����ٴ�byte�����а�ԭ��ֵ�����ݻ�ԭ����;
		
		ByteArrayOutputStream   DataOutputStream  ByteInputStream DataInputStream ����ʹ��
			
			DataOutputStream���е�writeLong(long n)�ǰ�n�������ڴ��еĶ����ƴ���д����������ӵ����豸��;

*/

import java.io.*;

public class Test_ByteArray_DataInputStream
{
	public static void main(String[] args) throws IOException
	{
		long l = 12345678910L;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		/*
			24��API:"public ByteArrayOutputStream(): ����һ���µ� byte ���������������������������� 32 �ֽڣ����б�Ҫ���������С�� "
			24�д���һ��ִ����ϣ���ζ������: 1�����ڴ���������һ����СΪ32���ֽڵ�byte����;
											  2����һ������baos�Ĺܵ������ӵ��˸�byte�����У����ҿ���ͨ������ܵ����byte������д������;
			��Ȼ��ʱ����ͨ��baos��baos�����ӵ������ڴ��з���õ�byte������д�����ݣ�
			����ByteArrayOutputStream���� û�� �ṩ ����ֱ�Ӱ�long�������� ֱ��д��ByteArrayOutputStream�������ӵ���byte�����еķ���, 
			��˵����û��ͨ��baos��baos�����ӵ���byte������д��long���͵�����, 
			��API�ĵ����Է���: ByteArrayOutputStream���в�û������writeLong()�����ķ�����
			���� DataOutputStream ����ȴ��writeLong() writeFloat()�ȷ���
		*/
		dos.writeLong(l);
		/*
			��n�����������10000L���ڴ��еĶ����ƴ���д��dos��������baos�ܵ������ӵ����ڴ��еĴ�СΪ32�ֽڵ�byte�����У�
			�����н�����������Ƕ�����д�룬���ǰ�10000Lת��Ϊ�ַ�'1' '0' '0' '0' '0'д��byte�����У�
			���ǰ�10000L���ڴ��е��ܹ�8���ֽڵĶ����ƴ���д��byte������;
		*/
		dos.flush();		
		
		byte[] bt = baos.toByteArray();
		dos.close();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(bt);
		DataInputStream dis = new DataInputStream(bais);
		long l_2 = dis.readLong();
		dis.close();
		
		System.out.printf("%d\n", l_2);
	}
}