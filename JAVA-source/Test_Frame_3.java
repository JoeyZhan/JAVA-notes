/*
	Frame 的用法_举例_2
*/

import java.awt.*;

public class Test_Frame_3
{
	public static void main(String[] args)
	{
		MyFrame MF_1 = new MyFrame(200, 200, 300, 300, Color.RED);
		MyFrame MF_2 = new MyFrame(500, 200, 300, 300, Color.BLUE);
		MyFrame MF_3 = new MyFrame(200, 500, 300, 300, Color.GREEN);
		MyFrame MF_4 = new MyFrame(500, 500, 300, 300, Color.YELLOW);
	}
}

class MyFrame extends Frame
{
	public static int id = 0;
	
	public MyFrame(int x, int y, int w, int h, Color c)
	{
		super("MyFrame" + (++id));
		setBackground(c);
		setLayout(null);
		setBounds(x, y, w, h);
		setVisible(true);
	}
}