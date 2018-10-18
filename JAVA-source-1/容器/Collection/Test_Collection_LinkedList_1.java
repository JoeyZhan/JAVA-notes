/*
	LinkedList 及其方法用法 

*/

import java.util.*;

class tostring
{
	private String name;
	private int numb;
	
	public tostring(String name, int numb)
	{
		this.name = name;
		this.numb = numb;
	}
	
	public String toString()
	{
		return name + " " + numb;
	}
}

public class Test_Collection_LinkedList_1
{
	public static void main(String[] args)
	{
		Collection ll = new LinkedList();
		ll.add("Lbj");
		ll.add("23");
		ll.add(new tostring("Lebron", 23));
		System.out.println(ll);
	}
}