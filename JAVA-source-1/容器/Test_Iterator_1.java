/*
	Iterator �ӿ�

		ѧ�����ݽṹ������Ӧ��֪��Ҫ����������е�Ԫ�أ��ж��Ƿ������һ��Ԫ�أ�ȡ����һ��Ԫ���ⶼ�Ƿǳ��鷳�����飬
		��Щ�����׳���Ĳ����� Java ���� hasNext��next��remove ��������������ʾ��������ο���������������ľ���ʵ�ֶ��Ѿ���Sun��˾����ˣ�
		����API�����м̳��� Collection ���඼�Ѿ�ʵ�� Iterator �ӿ��е�����������; 
		
		Iterafor �ӿ�������ͳһ�ķ�ʽ�Ը��ֲ�ͬ�����е�Ԫ�ؽ��б���;
		
		ʵ�� Iterator �ӿڵĶ����ֳ�Ϊ�����������øö�����Է���ı��������е�Ԫ��;

	Iterator��������
	
		boolean hasNext();
			�����жϵ�ǰ�α�ĺ��滹�Ƿ����Ԫ�أ�������ڷ����棬���򷵻ؼ�;
			
		Object next();
			�ȷ��ص�ǰ�α��ұߵ�Ԫ�أ�Ȼ���α����һ��λ��;
			
		void remove()	(remove()�������Ƽ�ʹ��)
			ɾ��������ص�Ԫ�أ��ڵ���remove֮ǰ���������ٱ�֤�ȵ���һ��next���������ҵ���next֮��ֻ�ܵ���һ��remove����;

*/

import java.util.*;

public class Test_Iterator_1
{
	//���Ա�������Collection�ӿڵ�ʵ����
	public static void showCollection(Collection c)
	{
		Iterator it = c.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args)
	{
		ArrayList al_1 = new ArrayList();
		al_1.add("a001");
		al_1.add("jack");
		al_1.add(new Point(1, 1));
		System.out.println("al_1: ");
		showCollection(al_1);
		
		ArrayList al_2 = new ArrayList();
		al_2.add("a002");
		al_2.add("rose");
		al_2.add(new Point(1, 2));
		System.out.println("al_2: ");
		showCollection(al_2);
	}
}

class Point
{
	private int x, y;
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return "[" + x + "," + y + "]";
	}
}