/*
	UDP ������
	
	�ͻ���/���Ͷ�
*/

import java.io.*;
import java.net.*;

public class Test_UDP_Client 
{
	public static void main(String args[]) throws Exception
	{
		//������ͷ(�׽���)
		DatagramSocket ds = new DatagramSocket();
		
		long l = 10000L;
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		dos.writeLong(l);
		
		byte buf[] = baos.toByteArray();
		
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 5218);		
		/*
			"127.0.0.1"ΪString�������ͣ�����IP��ַ��IP��ַ��java������ java.net.InetAddress �� ��ʾ,
			��java.net.InetAddress ��û�й��췽�������Ҫ��"127.0.0.1"ת����ip��ַ������д�ɣ�
			InetAddress.getByName("127.0.0.1") ���� new InetSocketAddress("127.0.0.1", 5218),	���߱�������ip+�˿ں�;
			
			e.g.
			DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 5218));
		*/
		
		ds.send(dp);	//����ͷ�ϰѼ�װ���е����ݷ��͸��Է�
		ds.close();
	}
}