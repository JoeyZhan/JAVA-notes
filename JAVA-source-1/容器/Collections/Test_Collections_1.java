/*
	Collections类中方法的用法_举例_1

*/

import java.util.*;

public class Test_Collections_1
{
	public static void main(String[] args)
	{
		List lt = new LinkedList();
		
		for (int i = 0; i<7; ++i)
		{
			lt.add("A" + i);
		}
		System.out.println("lt: " + lt);
		
		Collections.shuffle(lt);	//对lt容器内的对象进行随机排序;
		System.out.println("随机后: " + lt);
		
		Collections.sort(lt);	//排序，默认为升序，如果需要降序，则先调用Collections.sort(); 再调用Collections.reverse();
		System.out.println("排序后(升序): " + lt);
		
		Collections.reverse(lt);	//倒置
		System.out.println("倒置后: " + lt);
		 
		System.out.println("折半查找a5: " + Collections.binarySearch(lt, "A5"));		//折半查找
		//此时lt不是为升序状态，调用binarySearch()方法会出错;
		
		Collections.sort(lt);
		System.out.println("重新排序后: " + lt);
		
		System.out.println("折半查找a5: " + Collections.binarySearch(lt, "A5"));
		//使用Collections.binarySearch()方法的前提是：该容器的对象已被升序排序好;
		
		Collections.fill(lt, "A666");	//重写lt，用"A666"对象重写容器中所有对象; 即将容器中所有的对象都变成: "A666";
		System.out.println(lt);
	}
}

/*	2018-09-17 20:08:50
	运行结果:	lt: [A0, A1, A2, A3, A4, A5, A6]
				随机后: [A3, A0, A1, A2, A4, A5, A6]
				排序后(升序): [A0, A1, A2, A3, A4, A5, A6]
				倒置后: [A6, A5, A4, A3, A2, A1, A0]
				折半查找a5: -8
				重新排序后: [A0, A1, A2, A3, A4, A5, A6]
				折半查找a5: 5
				[A666, A666, A666, A666, A666, A666, A666]

*/