/*
	ArrayList ���䷽���÷�
			
		Object[] toArray()
			(�����������飬����ͨ���±�ķ�ʽ���������е�Ԫ�أ�ֻ������ſ���ͨ���±�������)
			����һ�������� collection �е�����Ԫ�ص�����;
			
		boolean add(Object e)
			��e��ӵ���ǰ������;(��e���Ƕ���ʱ�������Զ�ת��Ϊ����Ȼ��������);
			
		
*/

import java.util.*;

class tostring
{
	public String toString()
	{
		return "tostring = LBJ-23-LA";
	}
}

public class Test_Collection_ArrayList_1
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("Lebron James");
		al.add(23);
		al.add("LA");
		al.add(new tostring());
		System.out.println(al);
		
		System.out.println("get(3) = " + al.get(3));
		
		//System.out.println(al[3]);	error:�����������飬����ͨ������ķ����� ��������Ԫ�� ���ص�һ�������
		Object[] obArr = al.toArray();
		System.out.println(obArr[3]);
	}
}