package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
<<<<<<< HEAD
		// 1. Ask the user if they know how to write code.
String name = JOptionPane.showInputDialog("Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world.
if(name.equals("Yes")) {JOptionPane.showMessageDialog(null, "You will rule the World!"); }
		// 3. Otherwise, wish them good luck washing dishes.
else {JOptionPane.showMessageDialog(null, "Well good luck washing Dishes.");
=======
		String query = JOptionPane.showInputDialog("Do you know how to code?");
		
		if(query.equals("yes") || query.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "You will aspire to take over the world!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You will be purged along with the rest of the computer-illiterate population once the coders take over.");
		}
>>>>>>> origin/master
	}
}
}
