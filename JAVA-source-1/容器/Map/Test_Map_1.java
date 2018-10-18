/*
	Map接口
	
		Map(映射) 是一种把 键对象 和 值对象 进行映射的集合，它的每一个元素都包含一对 键对象 和 值对象;
		
		向 Map集合 中加入元素时，必须提供一对 键对象 和 值对象，从 Map集合 中检索元素时，
		只要给出 键对象，就会返回对应的值对象;
	
		接口Map 提供了根据关键字找对应的值的方法: get()，定义如下：
		 Object get(Object key) 
			
		
	Map接口方法介绍
		
		接口Map 还提供了设置关键字和对应值的方法: put()，定义如下：
		 Object put(Object key, Object value) 
		1. 根据 key 计算出存储位置，然后把 value 存入位置，如果该位置原来已有元素，则覆盖它;
		
		void putAll(Map m);
			把 m容器 中所有的元素存入当前容器中;
			
		Set keySet();
			返回 该Map容器的键 组成的集合;
			
		V get(Object key);
			返回 key键 映射的值，如果没有找到，则返回null;
		
		int size();
			返回该 Map容器中 键的数量;
			
		boolean isEmpty();
			该 Map容器 键值为空时，返回true;
			
		boolean containsKey(Object key);
			判断该 Map容器 中是否包含 key键值，如果包含返回true;
			
		boolean containsValue(Object value);
			判断该 Map容器 中是否有 一个或多个键 映射 value值，如果有返回true;
			
		Object remove(Object key);
			从该 Map容器 中删除 key键值(如果存在该键值);
			
		void clear();
			从该 Map容器 中删除所有 键值;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
*/