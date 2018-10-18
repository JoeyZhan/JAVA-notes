/*
	Comparable �ӿ�
	
	Ϊ��Ҫʹ��Comparable�ӿڣ�
	
		������������ �� string�������ݣ����Ǳ˴˵ıȽϱ�׼Java���Ա����Ѿ��ṩ����;
		
		�û��Զ��������֮��Ƚϵı�׼��Java���Ա�����û���ṩ��;
		
		�������һ�������к����û��Զ������͵����ݣ�����������Ҫ��������Ԫ�ؽ������򣬻����ĳһԪ��ʱ��
		���Ǿͱ�����ƶ�������Ԫ����Ԫ��֮��Ƚϵı�׼;
		
		������Ҫ���ж���Ƚ�/����ĳ��Ͼ��ɿ���ʵ��Comparable�ӿ�;

	���п��ԡ����򡱵��඼ʵ����java.lang.Comparable�ӿڣ�Comparable�ӿ���ֻ��һ������:
		public int compareTo(Object obj);
		�÷���:
			���� 0 ��ʾ  this==obj;
			����������ʾ this>obj;
			���ظ�����ʾ this<obj;
	
		ʵ���� Comparable�ӿ� ����ͨ��ʵ�� ComparaTo() �����Ӷ�ȷ�������������򷽷�;
		
*/

import java.util.*;

class NBA implements Comparable
{
	private int id = 0;
	private String name = null;
	
	public NBA(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return id + "-" + name;
	}
	
	@Override
	public int compareTo(Object o)		//����Ϊ�û��Զ����࣬������Ҫ�û���дComparable�ӿ��е� compareTo()��������ָ����������ı�׼;
	{
		NBA nba = (NBA)o;
		
		if (this.id < nba.id)
			return -1;
		else if (this.id == nba.id)
			return 0;
		else
			return 1;
	}
}

public class Test_Comparable_comparableTo
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		
		l.add(new NBA(1000, "Lebron"));
		l.add(new NBA(1003, "DWADE"));
		l.add(new NBA(1005, "LOVE"));
		l.add(new NBA(1001, "JORDAN"));
		l.add(new NBA(1004, "CURRY"));
		
		Collections.sort(l);		//��Ҫ�� �û��Զ������ �����������ڸ� �Զ����� ��дComparable�ӿ��е� compareTo()��������ϸ���ݲο� 46��;
		System.out.println(l);
	}
}

/*	2018-09-18 21:36:45
	���н��:
		[1000-Lebron, 1001-JORDAN, 1003-DWADE, 1004-CURRY, 1005-LOVE]
		
	�������������������ظ����벻�ظ���ʹ��Set;
*/











