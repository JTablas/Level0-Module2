//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String ban = JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if(ban.equals("No")){
		JOptionPane.showMessageDialog(null, "...");
		JOptionPane.showMessageDialog(null, "Y-You are crazy...");
		}
			
			
		
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		else if(ban.equals("Yes")){
		String hob = JOptionPane.showInputDialog("What is your favorite hobby?");
		JOptionPane.showMessageDialog(null, hob + " is much better with bananas!");
		
		}else{JOptionPane.showMessageDialog(null, "You are BANANAS!");
		}//4. OPTIONAL: if they say something other than  or 
		//	show a pop up that says “You are bananas!
	
	}
}

