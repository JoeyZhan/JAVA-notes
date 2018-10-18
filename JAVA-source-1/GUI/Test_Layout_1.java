/*
	Layout ¾ÙÀý_1
*/

import java.awt.*;

public class Test_Layout_1
{
	public static void main(String[] args)
	{
		Frame f = new Frame("Layout");
		Panel p_1 = new Panel();
		Panel p_2 = new Panel();
		Panel p_1_1 = new Panel();
		Panel p_2_1 = new Panel();
		
		Button p_bt_1 = new Button("BUTTON_1");
		Button p_bt_2 = new Button("BUTTON_2");
		Button p_bt_3 = new Button("BUTTON_3");
		Button p_bt_4 = new Button("BUTTON_4");
		Button p_bt_5 = new Button("BUTTON_5");
		Button p_bt_6 = new Button("BUTTON_6");
		Button p_bt_7 = new Button("BUTTON_7");
		Button p_bt_8 = new Button("BUTTON_8");
		Button p_bt_9 = new Button("BUTTON_9");
		Button p_bt_10 = new Button("BUTTON_10");
		
		f.setLayout(new GridLayout(2, 1));
		p_1.setLayout(new BorderLayout());
		p_1_1.setLayout(new GridLayout(2, 1));
		p_2.setLayout(new BorderLayout());
		p_2_1.setLayout(new GridLayout(2, 2));
		
		f.add(p_1);
		f.add(p_2);		

		p_1.add(p_bt_1, BorderLayout.WEST);
		p_1.add(p_bt_2, BorderLayout.EAST);
		p_1.add(p_1_1, BorderLayout.CENTER);
		
		p_2.add(p_bt_5, BorderLayout.WEST);
		p_2.add(p_bt_6, BorderLayout.EAST);
		p_2.add(p_2_1, BorderLayout.CENTER);
		
		p_1_1.add(p_bt_3);		
		p_1_1.add(p_bt_4);

		p_2_1.add(p_bt_7);
		p_2_1.add(p_bt_8);
		p_2_1.add(p_bt_9);
		p_2_1.add(p_bt_10);
		
		f.pack();
		f.setVisible(true);
	}
}