import java.util.Scanner;

import javax.swing.JOptionPane;


public class MilesToFeetInteractive {

	public static void main(String[] args) {
		
		//Declare and initialize named constant FEET_PER_MILE
		final int FEET_PER_MILE = 5280;
		
		//Declare and initialize variables
		float uncleMiles, uncleFeet;
		Scanner sc = new Scanner(System.in);
		
		//Display Input
		System.out.print("Please enter the distance in miles to your uncles house: ");
		uncleMiles = sc.nextFloat();
		
		//Calculating 
		uncleFeet = uncleMiles * FEET_PER_MILE;
		
		//Display output
		JOptionPane.showMessageDialog(null,"The distance to my uncles house is " + uncleMiles + " miles. That's "  + uncleFeet + " feet!");
		
	}

}

