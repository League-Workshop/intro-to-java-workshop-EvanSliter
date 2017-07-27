package day3;

import javax.swing.JOptionPane;

public class QuizGame {
public static void main(String[] args) {
	int score = 0;
	String Nintendo = JOptionPane.showInputDialog("What is the first zelda game in the timeline");
		if(Nintendo.equals("Skyward Sword")){
			JOptionPane.showInputDialog("Yeah so you got the first one right");
			score++;
		} else{
			JOptionPane.showInputDialog("OOOOHHHHHHH you are so wrong");
		}
		 Nintendo = JOptionPane.showInputDialog("In whhich mario game did Mario us the FLUDD");
				if(Nintendo.equals("Super Mario Sunshine")){
				JOptionPane.showInputDialog("Just wait for the next one");
				score++;
		} else{
			JOptionPane.showInputDialog("OOOOOOOOOHHHHHHHHHHH you can't get any right");
		}

		String Pokemon = JOptionPane.showInputDialog("What was the first pokemon created");
		if(Pokemon.equals("Rydon")){
			JOptionPane.showInputDialog("Fine you win");
			score++;
		}else{
				JOptionPane.showInputDialog("OOOOOOOOOOOOOHHHHHH FAIL");
				
		}

}}
