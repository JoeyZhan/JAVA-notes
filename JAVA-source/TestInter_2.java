/*
	interface(接口) 的用法_2
	
*/

interface It
{
	public static final int i = 233;
	public abstract void f();
}

interface It_2
{
	int j = 666;
	void j();
}

/*	error	It是接口，一个类只能implements(实现)某个接口，但不能 extends(继承) 某个接口;
class B extends It		//class B implements It{}	//ok
{
}
*/

//	ok  接口可以继承接口;
interface extIt extends It
{
}
//	ok  接口不但可以继承接口，而且可以继承多个接口，即接口允许多继承；
interface extIt_2 extends It, It_2
{
}

public class TestInter_2
{
	public static void main(String[] args)
	{
		
	}
}
