/*
	TreeSet ��
	
		TreeSet ��ʵ���� Set�ӿ�
		
		TreeSet ��һ�����򼯺ϣ�TreeSet��Ԫ�ؽ������������У�ȱʡ�ǰ�����Ȼ˳������������TreeSet��Ԫ��Ҫʵ��Comparable�ӿ�;
		
		��ס�����п��Խ���������඼Ӧ��ʵ��Comparable�ӿ� 
		
	HashSet �� TreeSet �ıȽ�
	
		HashSet�ǻ���Hash�㷨ʵ�ֵģ�������ͨ��������TreeSet;
		
		ͨ��Ӧ��ʹ��HashSet��������Ҫ����Ĺ���ʱ����ʹ��TreeSet;

*/

import java.util.*;

public class Test_TreeSet_1
{
	public static void main(String[] args)
	{
		Collection c = new TreeSet();
		c.add("123");
		c.add("456");
		c.add("234");
		c.add("111");
		c.add("678");
		
		Iterator it = c.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}