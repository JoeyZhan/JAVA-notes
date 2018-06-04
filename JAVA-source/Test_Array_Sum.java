/*
	Array(数组) 的总结(非重点，数组有缺陷)
	
	为什么需要数组？
		
		为了解决大量同类型数据的存储和使用问题;
		
		为了模拟现实世界;
		
	数组中的元素分为:
		基本类型变量
		引用类型变量
		
	创建并使用基本类型数组
		(Test_Array_1.java)
		
	创建并使用引用类型数组
		(Test_Array_2.java)
		
	多维数组
		e.g
			int[][] xx = new int[2][3];				//等长数组
			int[][] xx = {{1,2,3}, {4,5}, {6}};		//不等长数组
			(不等长数组可以用 Test_Array_2.java 来理解)
			
	数组的拷贝	(Test_Array_Copy.java)
		
		public static void arraycopy(Object arr1, int pos1, Object arr2, int pos2, int length)
		{
		};
		
		将 arr1 所指向的数组中 下标从 pos1 开始的总共 length 个元素, 
		覆盖掉 arr2 所指向的数组中 下标从 pos2 开始的 length 个元素;
		
		注意：
			arr1是源数组, arr2是目的数组!
			arraycopy() 全是小写, 不能是大写!
			
	数组的排序
		(Test_Array_Sort.java)
	
*/