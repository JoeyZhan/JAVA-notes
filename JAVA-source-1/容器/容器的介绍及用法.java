/*
	容器的介绍及用法
	
		为什么需要容器
		
			数组存在两个缺陷：
				数组长度难以扩充
				数组中元素类型必须相同
				
			容器可以弥补数组的这两个缺陷
			举例：
				假设A是个类名
				A[] arr = new A[10];
				表示分配了一个数组，数组的每个元素都是A类对象的一个引用，但是如果想扩充数组的长度，
				比如希望数组的长度变成15，我们是不能直接在原数组内存的后面追加内存的，必须得另外分配长度为15的内存空间，
				然后利用System.arraycopy()方法来把原数组的内容拷贝到新内存中，很明显，这即耗时，又耗内存！
				所以一旦数组内存已分配，你想改变数组的长度，效率就会变的很低;
				
				
		容器与现实的对应关系
		
			集合就是将若干用途、性质相同或相近的“数据”组合而成一个整体。
			
			数学上，集合类型可以归纳为三种：
				集（Set)
					Set集合中不区分元素的顺序，不允许出现重复元素。
					
				列表（List)
					List集合区分元素的顺序，且允许包含重复元素。
					
				映射（Map)
					映射中保存成对的“键-值”(Key-Value)信息，映射中不能包含重复的键，每个键最多只能映射一个值。
					
			Java设计了三个接口来对应数学上的三种集合类型，这三个接口名字分别是 Set、List、Map;

			
		容器的框架图
			
			J2SDK所提供的容器API位于java.util包内。
			容器API的类图结构如下:
				
										 HashSet
								1.Set  {												
				Collection	｛			 LinkedList
				(interface)		2.List:	 ArrayList
										
					
					Map: 	 HashMap
				(interface)	
			
		
			Collection 接口一定义了存取一组对象的方法，其子接口 Set 和 List 分别定义了存储方式;
			
			Map 接口定义了存储 "键(key)-值(value)映射" 的方法
				
				
			
		Collection 接口中的方法
	
			int size();
				返回此 collection 中的元素;
				
			boolean isEmpty();
				判断容器里是否为空，空为真;
				
			boolean containesAll(collection c);
				判断形参c所指向的集合中所有的元素是否已经全部包含在了当前集合中，是则返回true，否则false;
				e.g.: a.containesAll(c);		判断a中是否包含了c中全部的元素;
			
			Iterator iterator();	//未了解
				返回能够遍历当前集合所有元素的迭代器;
				
			Object[] toArray()
				(容器不是数组，不能通过下标的方式访问容器中的元素，只有数组才可以通过下标来访问)
				返回一个包含此 collection 中的所有元素的数组;
				
			boolean add(Object e)
				把e添加到当前集合中;(当e不是对象时，将会自动转换为对象，然后进行添加);
				
			boolean remove(Obeject o)
				将o删除;
				
			boolean addAll(Collection c)
				将c中所有的元素添加到当前集合中;
				
			boolean removeAll(Collection c)
				删除当前容器中有c容器中的元素;
				
			void clear()
				清楚当前容器中的所有元素;
				
			boolean equals(Object o)	//未了解	难度大
				
			int hashCode()		//未了解	难度大
				
*/