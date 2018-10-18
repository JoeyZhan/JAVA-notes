/*
	TreeSet 类
	
		TreeSet 类实现了 Set接口
		
		TreeSet 是一个有序集合，TreeSet中元素将按照升序排列，缺省是按照自然顺序进行排序，因此TreeSet中元素要实现Comparable接口;
		
		记住：所有可以进行排序的类都应该实现Comparable接口 
		
	HashSet 和 TreeSet 的比较
	
		HashSet是基于Hash算法实现的，其性能通常都优于TreeSet;
		
		通常应该使用HashSet，而在需要排序的功能时，才使用TreeSet;

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