/*
	UDP传输文件
	
	数据包大小受限制;
*/

import java.io.*;
import java.net.*;

public class Test_UDP_Client_data
{
	public static void main(String args[]) throws Exception
	{
		DatagramSocket ds = new DatagramSocket();
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\C\\C-source 2\\Student_Management_System.c"));
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(baos);
		byte buf_d[] = new byte[1024];
		int len = bis.read(buf_d);
		while(-1 != len)
		{
			dos.write(buf_d);
			len = bis.read(buf_d);
		}
		
		byte buf[] = baos.toByteArray();
		baos.flush();
		
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 5218);		

		ds.send(dp);	
		ds.close();
	}
}
//@JoeyChim-2018-10-16 18:23:03