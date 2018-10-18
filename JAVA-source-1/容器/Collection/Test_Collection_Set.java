/*
	Collection接口的子接口 —— Set接口

		Set 接口

			Set接口是Collection的子接口，Set接口没有提供额外的方法，但实现Set接口的容器类中的元素是没有有顺序的，而且不可以重复。
			
			Set容器可以与数学中 “集合” 的概念相对应。
			
			J2SDK API中所提供的Set容器类有Hashset,Treeset等。
		
			因为 Set 和 List 都是继承自 Collection 接口，所以 Set 和 List 中有很多方法是一样的;
			但List接口中有add, set, indexof方法，
			而Set接口中却只有add方法，没有set,indexof方法，因为Set是无序不能重复的，不存在某元素具体位置这个概念;
			
		Hashset类	(Test_Set_HashSet_1.java)
		
			Hashset类实现了Set接口;
			
			Hashset容器中的元素是不能重复，无顺序的;
			
			存放入Hashset容器中的类必须要实现equals()和hashCode()方法;
*/