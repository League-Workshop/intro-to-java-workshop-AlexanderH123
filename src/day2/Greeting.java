package day3;

import javax.swing.JOptionPane;

public class Greeting {
<<<<<<< HEAD

public static void main(String[] args) {
	String  name = JOptionPane.showInputDialog("What is your Name?");
	JOptionPane.showMessageDialog(null, "Welcome " + name);
}
=======
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Name:");
		JOptionPane.showMessageDialog(null, "Welcome, Comrade " + name + "!");
	}
>>>>>>> origin/master
}
