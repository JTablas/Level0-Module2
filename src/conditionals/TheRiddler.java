//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0; 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String rid=JOptionPane.showInputDialog("Here's a riddle, I have 6 legs, 4 noses, 3 ears, and 9 eyes, what am I?");
		System.out.println(rid);
		if(rid.equals("Ugly")){
		JOptionPane.showMessageDialog(null, "Nice job, on to the next one.");
		score++;
		JOptionPane.showMessageDialog(null, "Score " + score);
		} else {
		JOptionPane.showMessageDialog(null, "Wrong, Try again.");
		} 
		String dle=JOptionPane.showInputDialog("Here's a riddle, What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die??");
		System.out.println(dle);
		if(dle.equals("Nothing")){
		JOptionPane.showMessageDialog(null, "Nice job, on to the next one.");
		score++;
		JOptionPane.showMessageDialog(null, "Score " + score);
		} else {
		JOptionPane.showMessageDialog(null, "Wrong, Try again.");
		} 
		String eld=JOptionPane.showInputDialog("Here's a riddle, What gets wetter and wetter the more it dries??");
		System.out.println(eld);
		if(eld.equals("Towel")){
		JOptionPane.showMessageDialog(null, "Nice job, on to the next one.");
		score++;
		JOptionPane.showMessageDialog(null, "Score " + score);
		} else {
		JOptionPane.showMessageDialog(null, "Wrong, Try again.");
		}
		
		JOptionPane.showMessageDialog(null, "I'm too lazy to do more questions, you win.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
	
	}
}

