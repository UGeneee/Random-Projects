/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package publicfigure;

/**
 *
 * @author Acer
 */
public class PublicFigure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	String fullName = "Andres Bonifacio y de Castro";
	// String ageFigure = 33; < error
        byte ageFigure = 33;
	byte birthDay = 30;
        short birthYear = 1863;
	short deathYear = 1897;
        char katipunanInitial = 'K';
	// int nationalHero = true; < error
        boolean nationalHero = true;
	
	int lettersName = fullName.length();
        
	System.out.println("Information about my chosen Public Figure:");
	System.out.println("The name is " + fullName);
	System.out.println(ageFigure + " years old");
        System.out.println("first " + katipunanInitial + " in KKK stands for Katipunan");
	System.out.println("Born on November " + birthDay + "," + birthYear);
	System.out.println("Died on May 10, " + deathYear);
	System.out.println("Is Andres Bonifacio regarded as a National Hero? T/F");		
	System.out.println("Answer is: " + nationalHero + "\n");
	System.out.println("Fun fact: ");
	System.out.println("1. His full name consists of " + lettersName + " letters!");
	System.out.println("2. I share his surname!");
    }
    
}
