/*
	equals() 和 hashCode() 方法
	
	什么类必须得重写 equals()和hashCode()方法？
	
		Hashtable Hashset HashMap都必须的同时实现equals()方法和hashCode()方法， 
		Treeset和TreeMap则不需要实现equals()方法和hashCode()方法;
		

	预备知识：
		散列码
		
			Object中的hashCode方法会返回该对象的内存真实地址的整数化表示，这个形象的不是真正地址的整数值就是哈希码;
			
			向HashSet中添加对象时，Hashset先通过该对象的hashCode()计算出相应的桶，
			然后再根据equals()方法找到相应的对象。如果容器中己存在该对象则不再添加，如果不存在，则添加进去！

			
	怎样重写equals()和hashCode()方法
	
		如何重写equals()
			
			public boolean equals(Object Obj)
			{
				如果this和Obj的内容是一摸一样的
					返回true
				否则
					返回false
			}
			
		如何重写hashCode()方法
		public int hashCode()
		{
			return 当前类中基本类型数据对象的hashCode()方法;
		}


	equals()和hashCode()方法举例
		例子：
			把学生信息存入Hashset容器中，要求不能出现重复的学生信息，最后把学生信息全部输出;	(Test_Set_HashSet_1.java)
		
		附注：
			Hashset中并没有public Object get(int index)方法，
			因此要想输出Hashset容器所有的元素，可以借助iterator()方法来实现;

		
		
		
		
		
		
		
		
*/