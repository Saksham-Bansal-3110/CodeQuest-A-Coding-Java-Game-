package window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
	
	 UI ui = new UI();
	 choiceHandler chandler = new choiceHandler();
	
	public static void main(String[] args) {
		
		new Game();
	}
	
	public Game() {
		
		ui.createUI(chandler);
		ui.Level(chandler);
	}
	
    public class choiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			String Button = event.getActionCommand();
			
			switch(Button) {
			case "start": break;
			}
		}
	}
}
