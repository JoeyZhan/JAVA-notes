/*
	���ͱ���תString�����ַ���
*/

class Test
{
	public static void main(String[] args)
	{
		int i = 123;
		String str;
		
		str = i + "";	//��һ�ַ���;
		str = Integer.toString(i);	//�ڶ��ַ���;
		str = String.valueOf(i);	//�����ַ���;
		//�����ַ���;
		Integer it = new Integer(i);
		str = it.toString();
	}
}