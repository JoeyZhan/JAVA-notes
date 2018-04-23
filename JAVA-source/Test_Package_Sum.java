/*
	Package(包) 的总结
	
	1. package 语句必须得是第一条语句；
	
	2. package Test.main 表示：把该文件中所有的类放入Test.main这个包中；
	   并且该文件中所有的类真正名字将是包名和类名的组合；
	   
	如：类 TestPackage 的名字将变成 Test.main.TestPackage, 而不再是TestPackage;
	
	3. 编译时建议使用 javac -d . TestPackage.java, 尽量不要使用 java TestPackage.java, 因为后者要自己手动建立包目录;
		("-d" 表示自动生成包层，"." 表示这个包层是在当前目录下建立的);
	
	(以上内容在 Test_Package_1.java)
	
	
	同包不同类的相互访问：
		当两个类是在同一个包中时，彼此可以相互访问，只要是非私有成员都可以被同包的另一个类访问;
		(Test_Package_2_A&B.java)
		
	不同包类的相互访问：
		访问方法一：
			调用时使用类的全名(文件目录+类名);
			(Test_Package_3_A&B.java)
			
		访问方法二：
			使用import语句导入一个包中的特定类或所有类；
			(Test_Package_4_A&B.java)
	
	--------------------------------------------------------
	归档工具Jar
	
	Java 归档工具是JDK中提供的一种多用途的存档及压缩工具，可以将多个文件或目录合并压缩为单个的Java归档文件
	
	jar文件的主要作用：
		发布和使用类库
		便于资源的组合和管理
		
	Jar的使用：
		格式：
			jar -cvf 要生成的包名.jar *	
			
		举例：
			jar -cvf c.jar *
				功能：把当前路径下所有的文件即文件夹下所有的内容打包成c.jar
			jar -tf c.jar
				功能：在DOS下显示c.jar这个包解压后的文件内容
			jar -xf d:\1\c.jar
				功能：把d:\1\c.jar 这个文件中的内容解压到当前目录下
	
	如何使用jar包中的类
		
		假设现在有一个T.jar包，要想在任何目录下都可以访问T.jar包中的类，
		则设置classpath时，必须把包名T.jar也设置进去，因为T.jar也相当一个目录;
		(set classpath:xxx\xxx.jar)(注意！一定要是classpath！)(在DOS下设置的环境变量属于临时的，退出DOS后消失！)
		
		如在d:\share\java下有一个T.jar, 则classpath必须设置为d:\share\java\T.jar，
		不能设置为d:\share\java, 也不能设置成d:share\java\T, 否则在非当前目录下是无法访问T.jar包中的类的;
		
		import 包里的类名;
		
		
	访问权限控制符
	
			public		protected	   default		private
		同包同类	 	√		 √		   √		  	√
		
		访问同包	  	√		 √		   √
		不同类
		
		同包不同类	       √		√		  √		   
		继承
		
		不同包继承	       √		√
		
		访问不同包
		无任何关系	       √
		的类
*/