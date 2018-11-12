import java.awt.GridLayout;

import javax.swing.*;

public class View {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JFrame frame;
	private GridLayout layout;
	private Model model;
	private Controller cont;
	private JOptionPane pane;
	
	
	public View() {
		
		model = new Model();
		cont = new Controller (this, model);
		frame = new JFrame ("Magic Square");
		layout = new GridLayout(3,3);
		frame.setLayout(layout);
		
		button1 = new JButton("1");
		button1.setActionCommand("1");
		button1.addActionListener(cont);
		
		button2 = new JButton("2");
		button2.setActionCommand("2");
		button2.addActionListener(cont);
		
		button3 = new JButton("3");
		button3.setActionCommand("3");
		button3.addActionListener(cont);
		
		button4 = new JButton("4");
		button4.setActionCommand("4");
		button4.addActionListener(cont);
		
		button5 = new JButton("5");
		button5.setActionCommand("5");
		button5.addActionListener(cont);
		
		button6 = new JButton("6");
		button6.setActionCommand("6");
		button6.addActionListener(cont);
		
		button7 = new JButton("7");
		button7.setActionCommand("7");
		button7.addActionListener(cont);
		
		button8 = new JButton("8");
		button8.setActionCommand("8");
		button8.addActionListener(cont);
		
		button9 = new JButton("9");
		button9.setActionCommand("9");
		button9.addActionListener(cont);
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	
	public void setButtonText(Object object, int num) {
		((AbstractButton) object).setText("" + num);
	}
	
	public int getValue() {
		String i = JOptionPane.showInputDialog("Enter Your Number");
		int j = Integer.parseInt(i);
		return j;
	}
	
	
	public static void main(String []args) {
		new View();
	}
	
	
}
