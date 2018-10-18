import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test_1
{
	public static void main(String[] args)
	{
		Frame f = new Frame("赛马游戏");
		Menu gameMenu = new Menu("游戏");
	    MenuItem gameMenuItem_1 = new MenuItem("开始游戏");
	    MenuItem gameMenuItem_2 = new MenuItem("参数设定");
		Menu sysMenu = new Menu("系统");
	    MenuItem sysMenuItem_1 = new MenuItem("关于");
	    MenuItem sysMenuItem_2 = new MenuItem("退出");
		
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		Label lb = new Label("个人软件产品");
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
	   Frame f = new Frame("关于");
	   Label lb = new Label("专业 学号 姓名");
	   Button bt = new Button("确定");
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


