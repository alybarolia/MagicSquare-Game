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
			
			JButton[][] Newbuttons = view.getButtons(); 
			
			model.calculateTotal(Integer.parseInt(Newbuttons[0][0].getText()), Integer.parseInt(Newbuttons[1][1].getText()), Integer.parseInt(Newbuttons[2][2].getText()));
			
			boolean row1 = model.checkVals(Integer.parseInt(Newbuttons[0][0].getText()), Integer.parseInt(Newbuttons[0][1].getText()),Integer.parseInt(Newbuttons[0][2].getText()));
			boolean row2 = model.checkVals(Integer.parseInt(Newbuttons[1][0].getText()), Integer.parseInt(Newbuttons[1][1].getText()),Integer.parseInt(Newbuttons[1][2].getText()));
			boolean row3 = model.checkVals(Integer.parseInt(Newbuttons[2][0].getText()), Integer.parseInt(Newbuttons[2][1].getText()),Integer.parseInt(Newbuttons[2][2].getText()));
			boolean diagonal1 = model.checkVals(Integer.parseInt(Newbuttons[0][0].getText()), Integer.parseInt(Newbuttons[1][1].getText()),Integer.parseInt(Newbuttons[2][2].getText()));
			boolean diagonal2 = model.checkVals(Integer.parseInt(Newbuttons[0][2].getText()), Integer.parseInt(Newbuttons[1][1].getText()),Integer.parseInt(Newbuttons[2][0].getText()));
			boolean col1 = model.checkVals(Integer.parseInt(Newbuttons[0][0].getText()), Integer.parseInt(Newbuttons[1][0].getText()),Integer.parseInt(Newbuttons[2][0].getText()));
			boolean col2 = model.checkVals(Integer.parseInt(Newbuttons[0][1].getText()), Integer.parseInt(Newbuttons[1][1].getText()),Integer.parseInt(Newbuttons[2][1].getText()));
			boolean col3 = model.checkVals(Integer.parseInt(Newbuttons[0][2].getText()), Integer.parseInt(Newbuttons[1][2].getText()),Integer.parseInt(Newbuttons[2][2].getText()));
			
			if ((row1 && row2 && row3 && diagonal1 && diagonal2 && col1 && col2 && col3) == true) {
				view.victory();
			} 
		}
		
	}

}
