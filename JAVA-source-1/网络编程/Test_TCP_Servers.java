import java.io.*;
import java.net.*;

public class Test_TCP_Servers
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(5128);
	/*
		5128�Ƕ˿ںţ���ʾ�÷����������ڼ���666�˿��Ƿ��пͻ��˳��������,
		new���� ServerSocket ���� ss �������Զ������ͻ�����û���� 5128�˿� ��������
		Ҫ����� 5128�˿� �Ƿ��пͻ��˵����������ĵ���ss�����accept����,
		���������ֻ��8����һ�еĴ���Ļ�������������ʱ�����κ�����������������ֹ; 
	*/
		
		while(true)
		{
			Socket s = ss.accept();
		/*
			accept()���ܣ��ȴ��ͻ��˵����ӣ�û�����ӣ����������������ͣ�Ͳ�ǰ��
			������յ��ͻ��˵�һ�����ӣ����Զ��������ӷ�װΪһ��Socket���󣬳��򽫲������������Ǽ�������ִ��;
			����� s ʵ�������ӵ��ͻ��˵� s ���������˵� s.getInputStream() �Ϳͻ��˵� s.getOutputStream() ʵ����ͬһ���ܵ�;
			accept()������ʽ������������ղ����ͻ��˵����ӣ������ֹͣ��ǰ; 
		*/
			System.out.printf("���ӳɹ�!\n");
			
			DataInputStream dis = new DataInputStream(s.getInputStream());	//ͨ��Socket������Ի��InputStream��OutputStream�����ܵ�;
			
			System.out.println(dis.readUTF());	//readUTF()����Ҳ������ʽ������������ղ����ͻ������ݣ������ֹͣ��ǰ;
			dis.close();
			s.close();
		}
		
	}
}