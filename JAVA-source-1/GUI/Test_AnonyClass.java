/*
	匿名类
	
		创建匿名类的三种方式
			一个类中的某个方法内部可以生成一个匿名类;
			匿名类中的所有方法的内部都可以直接访问包括该匿名类的最外部类中的所有属性成员和方法成员;
		分类
			继承父类
			实现接口
			实现抽象类
			
		创建匿名类之实现接口
			假设A是接口名
			格式：
				new A()
				{
					实现接口中方法的代码;
				}
			功能：
				生成一个实现了A接口的匿名类对象;
				
		创建匿名类之实现抽象类
			假设A是抽象类
			格式：
				newA()
				{
					实现了A类的所有抽象类的方法代码;
					添加自己的方法或属性代码 (不建议，因为没有实际意义);
				}
			功能：
				条件：生成一个匿名类，该匿名类必须得实现了A类的所有抽象方法, 当然该匿名类也可以定义自己的属性和方法;
				最终生成了一个A类的子类对象;
				
		创建匿名类之继承父类
			假设A是个类名
			格式：
				newA()
				{
					重写了A类的方法代码;
					添加自己的属性和方法 (不建议，因为没有实际意义);
				}
			功能：
				生成一个A类的子类对象，该匿名类对象继承了A的所有非Private成员;
				
		匿名类的优缺点
			如果一个类的语句比较少，逻辑比较简单，而且不经常变动, 这个时侯可以使用匿名类;
			
			如果一个类包含了很重要的逻辑，将来要经常修改，则这个类就不应该当做匿名类来使用，匿名类会导致代码的混乱;

*/

import java.awt.*;
import java.awt.event.*;

public class Test_AnonyClass
{
	public static void main(String[] args)
	{
		Frame f = new Frame("AnonyClass");
		
		f.addWindowListener(
			new WindowAdapter()		//匿名类
			{
				@Override
				public void windowClosing(WindowEvent e)
				{
					System.exit(-1);
				}
			}
		);
		
		f.setSize(200, 200);
		f.setVisible(true);
	}
}