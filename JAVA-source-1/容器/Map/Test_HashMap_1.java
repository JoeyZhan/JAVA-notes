/*
	Test_HashMap_1

*/

import java.util.*;

public class Test_HashMap_1
{
	public static void main(String[] args)
	{
		HashMap hm_1 = new HashMap();
		HashMap hm_2 = new HashMap();
		hm_1.put(23, "leborn");
		hm_1.put(24, "kobe");
		hm_1.put(30, "curry");
		
		System.out.println("hm_1->" + hm_1);
		System.out.println("hm_1_size->" + hm_1.size());
		
		hm_1.put(00, "love");
		hm_1.put(13, "pual");
		
		System.out.println("hm_1_size->" + hm_1.size());
		System.out.println("hm_1->" + hm_1);
		
		System.out.println(hm_1.containsKey(30));
		System.out.println(hm_2.containsKey(31));
		System.out.println(hm_1.containsValue("leborn"));
		System.out.println(hm_2.containsValue("jb"));
	}
}