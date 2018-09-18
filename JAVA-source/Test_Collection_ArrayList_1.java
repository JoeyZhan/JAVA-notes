/*
	ArrayList 及其方法用法
			
		Object[] toArray()
			(容器不是数组，不能通过下标的方式访问容器中的元素，只有数组才可以通过下标来访问)
			返回一个包含此 collection 中的所有元素的数组;
			
		boolean add(Object e)
			把e添加到当前集合中;(当e不是对象时，将会自动转换为对象，然后进行添加);
			
		
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
		
		//System.out.println(al[3]);	error:容器不是数组，可以通过下面的方法将 容器所有元素 返回到一个数组里；
		Object[] obArr = al.toArray();
		System.out.println(obArr[3]);
	}
}