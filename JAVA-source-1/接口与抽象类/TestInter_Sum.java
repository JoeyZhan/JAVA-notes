/*
	接口(interface) 的总结:
	
	接口的定义
		接口就是 抽象方法 和 常量值 的集合，从本质上讲，接口是一种特殊的抽象类；
		
	接口的要点
		1.接口中定义的属性必须是 public static final的，而接口中定义的方法则必须是 public abstract 的，
		  因此这些修饰符可以部分或全部省略；(TestInter_1.java)

		2.接口中定义的属性的值在实现类中不能被更改；(TestInter_1.java)

		3.一个类只能实现(implements)某个接口，不能继承(extends)某个接口；(TestInter_2.java)

		4.但接口可以继承接口；(TestInter_2.java)
		
		5.接口不但可以继承接口，而且可以继承多个接口，即接口实现多继承；(TestInter_2.java)

		6.一个文件的名字必须得和该文件中public 接口的名字一样；
			(一个文件中有且只能有一个public类)；

		7.如果一个类只实现了一个接口的部分方法，则该类必须声明为抽象类；(TestInter_3.java)

		8.一个类可以在继承一个父类的同时实现一个或多个接口，但 extends 必须在 implements 之前；(TestInter_3.java)

		9.不可以new出接口对象，但可以定义一个 接口引用类型 的变量并将其指向 实现接口的对象，达到多态的目的！(TestInter_4.java)

	接口的作用
		通过接口可以实现不相关的相同行为
			如：Java规定所有可以完成自我赋值功能的类必须得实现 java.lang.Cloneable接口，但该接口却是空的，
			该接口中没有任何内容，目的只是为了起个标志作用；
			
		接口提供了不同对象进行协作的平台
			如：事件处理
			
		接口可以实现多继承，从一定程度上弥补了类只能单继承的缺陷；
		
		接口是我们了解一个类功能的重要途径
			如：Java整个容器框架就是以接口的方式建立起来的，实现不同接口的类完成的是不同的功能，接口使我们了解一个类功能的重要途径；
			
	接口与抽象类区别
		接口中的方法不允许有方法体，但抽象类却允许；
		
		Java类不允许多继承，接口却允许多继承
			接口可以实现多继承，即一个接口可以有多个父类；
			但Java类只允许单继承，即一个类只能有一个父类；
	
*/