/*
	�Ĵ�������������� �� ���÷���
	
		InputStream��outputStream��д���ݵĵ�λ��һ�� �ֽ�;
		
		Reader �� Writer ��д���ݵĵ�λ��һ�� �ַ�;
		
		��Java��һ���ַ�ռ�����ֽ�
		
						�ֽ���			�ַ���
		������:		InputStream			Reader
		�����:		OutputStream		Writer
		
		InputStream��OutputStream��Reader��Writer���ĸ��඼�� ������;
		������ Stream ��β�Ķ����ֽ���;
		
		
		
	InputStream ���г��õķ���
		public int read() throws IOException
			��ȡһ���ֽڲ���������ʽ����
			
			�����ȡ����������ĩβ�򷵻�-1
			
		public int read(byte[] b) throws IOException
			�� ������ �ж�ȡһ���������ֽڣ������䴢���� ���������� b �У������ͷ���ʵ�ʶ�ȡ���ֽ���;
			
			���b�ĳ���ΪO���򲻶�ȡ�κ��ֽڲ����� 0�������Ϊ��λ���ļ�ĩβ��û�п��õ��ֽڣ��򷵻� -1;
			
			���ӣ�
				FileInputStream fis = new FileInputStream("d:\\Share\\errorlog.txt");
				len = fis.read(buf);
					�� fis�� �������� d:\\Share\\errorlog.txt �ļ��ж�ȡ���ݣ�������ȡ����������д�� buf���� �У�
				����ֵ��ʵ��д�� buf���� ���ֽڸ����������ȡ���ļ��Ľ�β���򷵻� -1;
				
		
		public int read(byte[] b, int off, int len) throws IOException
			��������������ȡ len ���ֽڵ����ݲ����� byte ������;
			
			b��ʾ��ȡ������Ҫ��������������;
			
			off��ʾ��һ������������Ҫ�����λ�ã����±�;
			
			len��ʾ����ܶ�ȡ���ֽ���;
			
			������ˮ�������������豸�ж�ȡ�ĵ�һ���ֽڴ洢��Ԫ�� b[off] �У���һ���ֽڴ洢�� b[off+1] �У��������ƣ���ȡ���ֽ���������len;
			
			���Զ�ȡ len ���ֽڣ�����ȡ���ֽ�Ҳ����С�ڸ�ֵ����������ʽ����ʵ�ʶ�ȡ���ֽ���;
			
			����������ļ���ĩβ���򷵻�-1;
	

		Void close() throws IOException
			�رմ����������ͷ����������������ϵͳ��Դ
			
		long skip(long n) throws IOException
			�����Ͷ����������������ݵ�n���ֽڡ�
			(����õĺ���)

			
			
	OutputStream ���г��õķ���
		void write(int b) throws IOException
			���������д��һ���ֽ����ݣ����ֽ�����Ϊ����b�ĵ�8λ
		
		void write(byte[] b) throws IOException
			��һ���ֽ����͵������е�����д�������
		
		void write(byte[] b, int off, int len) throws IOException
			��һ���ֽ����͵������еĴ�ָ��λ��(off) ��ʼ�� len���ֽ�д�뵽�����
		
		void close() throws IOException
			�ر����ͷ��ڴ���Դ
		
		void flush() throws IOException
			��������л��������ȫ��д����Ŀ�ĵ�
			
			
			
	Reader ���ĳ��÷���
		int read() throws IOException
			��ȡһ���ַ�������������ʽ���أ�0��255), �������-1�ѵ���������ĩβ
		
		int read(Char[] cbuf) throws IOException
			��ȡһϵ���ַ����洢��һ������ buffer, ����ʵ�ʶ�ȡ���ַ����������ȡǰ�ѵ���������ĩβ����-1
		
		int read(char[] cbuf, int offset, int length) throws IOException
			����ȡ length���ַ�, ���洢��һ������ buffer����lengthλ�ÿ�ʼ����ʵ�ʶ�ȡ���ַ����������ȡǰ�Ե���������ĩβ����-1
		
		void close() throws IOException
			�ر����ͷ��ڴ���Դ
		
		long skip(long n) throws IOException
			���� n ���ַ�����������ʵ���������ֽ���
			
			
			
	Writer ���г��÷���
		void write(int c) throws IOException
			���������д��һ���ַ����ݣ����ֽ�����Ϊ����b�ĵ�16λ

		void write(char[] cbuf) throws IOException
			��һ���ַ����͵������е�����д�������
			
		void write(char[] cbuf, int offset, int length) throws IOException
			��һ���ַ����͵������еĴ�ָ��λ�� (offset) ��ʼ��
			length ���ַ�д�뵽�����
		
		void write(String string) throws IOException
			��һ���ַ����е��ַ�д�뵽�����

		void write(String string, int offset, int length) throws IOException
			��һ���ַ����� offset ��ʼ�� length ���ַ�д�뵽�����
			
		void close() throws IOException
			�ر����ͷ��ڴ���Դ
			
		vold flush() throws IOException
			��������л��������ȫ��д����Ŀ�ĵ�






*/