package phone;

import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Menu extends JPanel{

	public Menu(MenuItem[] items) {
		
		this.setLayout(new GridLayout(items.length, 1)); 
		
		for (MenuItem item : items) {
			
			this.add(item); 
			
		}
		
		items[0].selected(true);
	}
	
}
