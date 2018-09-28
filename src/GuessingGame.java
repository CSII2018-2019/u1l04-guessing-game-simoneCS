import javax.swing.JOptionPane;

//Guessing Game 9/27
//Simone

public class GuessingGame {

	public static void main(String[] args) {
		int computerNum = (int)(Math.random()*100); 
		String input; 
		int guess;
		int tries = 0; 
		String play; 
		
		do {
			 input = JOptionPane.showInputDialog(null, 
					" Enter a # between 1 and 100 ");
			guess = Integer.parseInt(input); } 
		while (guess > 100 || guess <0); {

		while ( guess != computerNum) {
			if (guess > computerNum) {
				JOptionPane.showMessageDialog(null, 
						" That number's too large. Try again or enter -1 to exit ");}
			if (guess < computerNum) {
				JOptionPane.showMessageDialog(null, 
						" That number is too small. Try again or enter -1 to exit");}
			if (guess == -1) {
				JOptionPane.showMessageDialog(null, " You quit the game... hopefully you'll get it next time ");
				break; }
			
			tries ++; 
			input = JOptionPane.showInputDialog( 
					" Pick a # between 1 and 100 ");
			guess = Integer.parseInt(input);
		}
		if ( guess == computerNum ); {
			JOptionPane.showMessageDialog(null," yay you got it! It took you " + tries + " attempts ");
		}
	}
	}
}
