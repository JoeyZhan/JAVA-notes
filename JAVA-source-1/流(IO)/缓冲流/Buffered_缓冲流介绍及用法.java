/*
	Buffered (������)
	
	����������
		
		���������Ǵ��л����������������;
	
		���������������ļ������Ƕ�io���ʵĴ������������ǵ�Ӳ�̣�
		
		������������Ǵ�������������Ҳ�а�������������������������ڽڵ������ڵ���Ҳ��ԭʼ����;
		
		�������ǰ�����ԭʼ�ڵ����ϵ������൱�ڰ����ڹܵ��ϵĹܵ�;
		
	
	���������췽��
	
		������Ҫ "�׽�" ����Ӧ�Ľڵ���֮�ϣ��Զ�д�������ṩ�˻���Ĺ��ܣ�����˶�д��Ч�ʣ�ͬʱ������һЩ�µķ�����
		J2SDK�ṩ�����ֻ��������䳣�õĹ��췽��Ϊ:
			BufferedReader(Reader in)
			BufreredReader(Reader in, int sz)	//szΪ�Զ��建�����Ĵ�С;
			
			BufferedWriter(Writer out)
			BufferedWrlter(Writer out, int size)
			
			BufferedInputStream(InputStream in)
			BufferedInputStream(InputStream in, int size)
			
			BufferedOutputStream(OutputStream out)
			BufferedOutputStream(OutputStream out, int size)
			
		����������֧���丸���mark��reset����;
		BufferedReader�ṩ��readLine �������ڶ�ȡһ���ַ������ԣ�r���n�ָ���;
		BufferedWriter�ṩ��newLine ����д��һ���зָ���;
		��������Ļ�������д�������ݻ������ڴ��л��棬ʹ��flush��������ʹ�ڴ��е���������д��;
		
	
	BufferedInputStream �� BufferedOutputStream
	
		BufferedInputStream���������������������һ��������ж������ֽڵ�����;
		BufferedOutputStream��������������������һ����Ӳ��д�����ֽڵ�����;
		
		BufferedInputStream �� BufferedOutputStream ���ǰ������������������ InputStream �� OutputStream;
		���ӣ�
			���� BufferedInputStream �� BufferedOutputStream ��ɴ������ļ��ĸ��ƣ���Զ�ȵ������� FileInputStream �� FileOutputStream Ҫ��ö�;

		BufferedInputStream������
			public int read(byte[] b)
			���������Ѵӵ�ǰ�����������豸�ж�ȡ���������ݴ���һ��byte������
			
		BufferedOutputStream������
			public int write(byte[] b)
			����������byte�����е������������ǰ�������������豸��
			
		�������ϣ����BufferedInputStream��BufferedOutputStream��ɡ���һ���豸�е����ݵ�����һ���豸�С���
		���Ǿ�Ӧ�ö���һ����ʱ��byte���͵����飬�������ʱ������Ϊ����������������н�������ת��Ŧ��

	
	BufferedReader �� BufferedWriter
		
		Reader��FileReader��InputStream��FileInputStream��BufferedInputStream ���ж�û�� readLine ����;
		
		DataInputStream �� ����readLine�����������������Ϊ��ʱ;
		
		BufferedReader������readLine���������Ҹ÷����ǿ�����ȷ��ʹ�õ�;
		
		BufferedReader������readLine�Ǹ��ǳ����õķ���, BufferedReader�Ǹ�Ҫ����ʹ�õ���;
		
		����BufferedReader��BufferedWriter������߶�д�ı��ļ����ݵ��ٶ�;






		
	
	
*/