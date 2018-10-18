/*
	Iterator 接口

		学过数据结构的朋友应该知道要想遍历链表中的元素，判断是否存在下一个元素，取出下一个元素这都是非常麻烦的事情，
		这些复杂易出错的操作在 Java 中用 hasNext、next、remove 这三个方法来表示，令人欣慰的是这三个方法的具体实现都已经由Sun公司编好了，
		并且API中所有继承了 Collection 的类都已经实现 Iterator 接口中的这三个方法; 
		
		Iterafor 接口用来以统一的方式对各种不同集合中的元素进行遍历;
		
		实现 Iterator 接口的对象又称为迭代器，利用该对象可以方便的遍历容器中的元素;

	Iterator方法介绍
	
		boolean hasNext();
			用来判断当前游标的后面还是否存在元素，如果存在返回真，否则返回假;
			
		Object next();
			先返回当前游标右边的元素，然后游标后移一个位置;
			
		void remove()	(remove()方法不推荐使用)
			删除最近返回的元素，在调用remove之前，我们至少保证先调用一次next方法，而且调用next之后只能调用一次remove方法;

*/

import java.util.*;

public class Test_Iterator_1
{
	//可以遍历所有Collection接口的实现类
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