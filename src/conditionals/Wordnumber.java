package conditionals;

import javax.swing.JOptionPane;

public class Wordnumber {
	
	public static void main(String[] args) {
	String word= JOptionPane.showInputDialog("Pick a random word.");
	String num = JOptionPane.showInputDialog("Pick a random number.");
	int numb=Integer.parseInt(num);
	for(int i=0;i<=numb;i++){
	System.out.println(word);
	
	
	}
	
	}
	


}
