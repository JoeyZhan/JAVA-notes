/*
	Exception(异常) 的总结
	
	什么是异常
		
		异常(Exception) 是程序运行过程中发生的事件，该事件可以中断程序指令的正常执行流程;
	
	为什么需要异常
		
		处理 无法通过 逻辑判断 来解决的 问题;
		(Test_Excep_3.java)
	
	异常的处理机制(重点)
		
		当Java程序运行时出现问题时，系统会自动检测到该错误，并立即生成一个与该错误对应的异常对象;
		
		然后把该异常对象提交给Java虚拟机;
		
		Java虚拟机会自动寻找相应的处理代码来处理这个异常，如果没有找到，则由Java虚拟机做一些简单的处理后，程序被强行终止;
		
		程序员可以自己编写代码来捕捉可能出现的异常，并编写代码来处理相应的异常;

	常见的异常
	
		空指针异常(Test_Excep_4_1.java)
		
		下标越界异常(Test_Excep_4_2.java)
		
		算术异常(Test_Excep_1.java)
		
	异常的分类
	
				Error 是系统错误，程序员无法处理这些异常
		Throwable｛						凡是继承自 Exception 但又不是 RuntimeException 子类的异常，我们都必须捕捉并进行处理;
				Exception 是程序员可以捕获并处理的异常  {
									 RuntimeException 的子类异常 是你可以处理也可以不处理的异常;
	
	
		Error: 
				由 Java虚拟机生成并抛出，包括动态链接失败，虚拟机错误等，Java程序无法对此错误进行处理;
				
		RuntimeException:
				Java虚拟机在运行时生成的异常，e.g.除零错误等系统，数组下标越界等，其产生比较频繁，处理玛法，对程序可读性和运行效率影响太大，
			因此由系统检测，用户可不做处理，系统将它们交给缺省的异常处理程序(有必要时，用户可对齐处理);
			
		Exception:
				一般程序中可预知的问题，其产生的异常可能会带来意想不到的结果，因此Java编译器要求Java程序必须捕获或声明所有的非运行时的异常;
			
	Finally的作用
		
		无论 try 所指定的程序块中是否 抛出异常，也无论 catch语句 的异常类型是否与抛弃的异常的类型一致，
		finally 中的代码一定会得到执行;
	
		finally 语句为异常处理提供一个统一的出口，使得在 控制流程 转到 程序的其他部分之前，
		能够对程序的状态作统一的管理;
	
		通常在 finally 语句中可以进行资源的清除工作，如关闭打开的文件，删除临时文件等;
		
		(Test_Excep_finally.java)
		
	throw
	
		throw 用来抛出异常
		
		格式：throw new 异常名(参数);
		
		假设 f方法 抛出了 A异常，则 f方法 有两种方式来处理 A异常
			1. throws A
				谁调用 f方法，谁处理 A异常，f方法本身不处理A异常;
			
			2. try{...} catch(){...}
				f方法自己本身来处理异常;
		
		要抛出的异常，必须得是 Throwable 的子类;
		
		(Test_Excep_5.java)
		
	throws
	
		格式：
			void f() throws A
			{
				...;
			}
		
		throws A 表示调用f方法时，f方法 可能 会抛出 A类异常，建议你调用 f方法 时，最好对 f方法 可能抛出的 A类 异常进行捕捉;
		
		throws 不表示该方法 一定 会抛出异常，该方法也可以不抛出异常；
		
		建议：对 throws 出的所有异常进行处理;
		
		如果一个方法内部已经对异常进行处理，则就不要再 throws;
		
		(Test_Excep_5.java)
		
	注意问题
	
		所有的 catch 只能有一个会被执行;
		
		有可能所有的 catch 都没有执行;
		
		先 catch 子类异常，再 catch 父类异常，如果先catch父类，而父类也可以catch子类的异常(多态)，子类则无法catch到对应的异常，则编译时会出错;
	
		catch 与 catch 之间是不能有其他代码的;
		
		重写方法抛出异常的范围不能大于被重写方法排除的异常范围;
		
		(Test_Excep_7.java)
		
	其他
		
		try{}catch{} 语句赋值的问题(Test_Excep_2.java)
		
		自定义异常(Test_Excep_6.java)
		
	
	异常的优缺点
	
		优点：
			强制 程序员 考虑 程序的安全性与健壮性;
			
			增强了程序员对程序的可控性;
			
			有利于代码的调试;
			
			把错误处理代码从常规代码中分离出来;
			
		注意：
			异常并不一定能够使程序的逻辑更清晰,
				(因为有时候我们必须得编写代码捕捉异常，所以可能会导致程序的逻辑非常混乱)
		
			异常并不能解决所有问题;
			
			
		
		
	2018-05-22 14:31:14	by Joeyzhan
*/
