/*
	Frame 的用法_举例_1
*/

import java.awt.*;

public class Test_Frame_2
{
	public static void main(String[] args)
	{
		Frame f = new Frame("FRAME");
		f.setSize(250, 250);
		f.setVisible(true);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){
		}
		
		f.setLocation(300, 300);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e){
		}
		
		f.setVisible(false);		
	}
}