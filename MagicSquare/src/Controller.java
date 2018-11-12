import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener{

	private Model model;
	private View view;
	
	public Controller (View v, Model m) {
		this.model = m;
		this.view = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() instanceof JButton) {
			int temp = view.getValue();
			view.setButtonText(arg0.getSource(), temp);
		}
		
	}

}
