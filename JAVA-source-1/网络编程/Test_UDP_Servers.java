/*
	UDP ������
	
	��������/���ն�
*/

import java.io.*;
import java.net.*;

public class Test_UDP_Servers
{
	public static void main(String args[]) throws Exception
	{
		//������ͷ(�׽���)
		DatagramSocket ds = new DatagramSocket(5218);	//5218ָ����ͷ(�׽���) ռ����5218�˿�;
		
		//������������������ݵļ�װ��(��)
		byte buf[] = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		
		try
		{
			while(true)	
			{
				//����ͷ���ü�װ����ܶԷ����͹���������
				ds.receive(dp);	//ע�⣺�����ִ����Ͼ���ζ�ţ�dp���ݰ��о��Ѿ������˴ӿͻ��˽��չ���������
				
				//�Ӽ�װ����ȡ���Է����͹���������
				ByteArrayInputStream bais = new ByteArrayInputStream(dp.getData());
				DataInputStream dis = new DataInputStream(bais);
				//1. ByteArrayInputStream���ں˱����Ǹ��ֽ����飬�����ǴӸ��ֽ������ж�ȡ����  
				//2. dp.getData()��ʾ��dp��װ���е�����ת��Ϊһ���ֽ����鲢���ظ��ֽ�����
				System.out.println(dis.readLong());
			}
		}
		catch(Exception e){
			e.printStackTrace();
			ds.close();		//�ر���ͷ
		}
	}
}