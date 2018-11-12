import java.awt.GridLayout;

import javax.swing.*;

public class View {

//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;
//	private JButton button7;
//	private JButton button8;
//	private JButton button9;
	private JButton [][] buttons;
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
		this.buttons = new JButton [3][3];
		
		
		for (int i = 0; i<3; i++) {
			for(int j = 0; j < 3; j++) {
				
				this.buttons[i][j] = new JButton("" + i+j);
				this.buttons[i][j].setActionCommand(""+ i+j);
				this.buttons[i][j].addActionListener(cont);
				frame.add(buttons[i][j]);
			}
			
		}
		
		
		
//		button1 = new JButton("");
//		button1.setActionCommand("1");
//		button1.addActionListener(cont);
//		
//		button2 = new JButton("");
//		button2.setActionCommand("2");
//		button2.addActionListener(cont);
//		
//		button3 = new JButton("");
//		button3.setActionCommand("3");
//		button3.addActionListener(cont);
//		
//		button4 = new JButton("");
//		button4.setActionCommand("4");
//		button4.addActionListener(cont);
//		
//		button5 = new JButton("");
//		button5.setActionCommand("5");
//		button5.addActionListener(cont);
//		
//		button6 = new JButton("");
//		button6.setActionCommand("6");
//		button6.addActionListener(cont);
//		
//		button7 = new JButton("");
//		button7.setActionCommand("7");
//		button7.addActionListener(cont);
//		
//		button8 = new JButton("");
//		button8.setActionCommand("8");
//		button8.addActionListener(cont);
//		
//		button9 = new JButton("");
//		button9.setActionCommand("9");
//		button9.addActionListener(cont);
		
//		frame.add(button1);
//		frame.add(button2);
//		frame.add(button3);
//		frame.add(button4);
//		frame.add(button5);
//		frame.add(button6);
//		frame.add(button7);
//		frame.add(button8);
//		frame.add(button9);
//		
		
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
	
	
	public JButton[][] getButtons(){
		return this.buttons;
	}
	
	public static void main(String []args) {
		new View();
	}
	
	
	
	
}
