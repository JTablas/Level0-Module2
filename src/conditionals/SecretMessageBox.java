//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
	String passCode=JOptionPane.showInputDialog("What is the passcode?");
	int pC=Integer.parseInt(passCode);
	System.out.println(pC);
	
	String mess = JOptionPane.showInputDialog("What is the secret message?");
	System.out.println(mess);
	
	String pc = JOptionPane.showInputDialog("What is the passcode?");
	int cp=Integer.parseInt(pc);
	if (cp == pC){
	JOptionPane.showMessageDialog(null, "" + mess);
		
	} else{
		JOptionPane.showMessageDialog(null, "Wrong");
	}
			
	// 1. Set the pass code in a String variable

	// 2. Using a pop-up, ask for a secret message and store it in a variable
	
	// 3. Ask your friend for the pass code and store it in a variable

	// 4. If the pass code matches, show the secret message

	// 5. If the pass code does not match, pop-up "INTRUDER!!"

	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.

}
}