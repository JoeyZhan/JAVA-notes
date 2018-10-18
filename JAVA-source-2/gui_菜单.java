import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test_1
{
	public static void main(String[] args)
	{
		Frame f = new Frame("������Ϸ");
		Menu gameMenu = new Menu("��Ϸ");
	    MenuItem gameMenuItem_1 = new MenuItem("��ʼ��Ϸ");
	    MenuItem gameMenuItem_2 = new MenuItem("�����趨");
		Menu sysMenu = new Menu("ϵͳ");
	    MenuItem sysMenuItem_1 = new MenuItem("����");
	    MenuItem sysMenuItem_2 = new MenuItem("�˳�");
		
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		Label lb = new Label("���������Ʒ");
		lb.setFont(new Font("Dialog", 1, 40));
		lb.setForeground(Color.red);
		f.add(lb);
		
		gameMenu.add(gameMenuItem_1);
		gameMenu.add(gameMenuItem_2);
		sysMenu.add(sysMenuItem_1);
		sysMenu.add(sysMenuItem_2);
		
		
		sysMenuItem_1.addActionListener(new AboutActionListener());
		sysMenuItem_2.addActionListener(new ExitActionListener());
		
		MenuBar menuBar = new MenuBar();
		menuBar.add(gameMenu);
		menuBar.add(sysMenu);
		f.setMenuBar(menuBar);
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
  
class AboutActionListener implements ActionListener
{
   public void actionPerformed(ActionEvent e)
   {
	   Frame f = new Frame("����");
	   Label lb = new Label("רҵ ѧ�� ����");
	   Button bt = new Button("ȷ��");
	   Panel p_1 = new Panel();
	   Panel p_2 = new Panel();
	   bt.addActionListener(new ExitActionListener());
	   f.setLayout(new GridLayout(2, 1));
	   f.add(p_1);
	   f.add(p_2);
	   p_1.add(lb);
	   p_2.add(bt);
	   f.setSize(300, 100);
	   f.setVisible(true);
   }
}

class ExitActionListener implements ActionListener
{
   public void actionPerformed(ActionEvent e)
   {
	   System.exit(0);
   }
}


