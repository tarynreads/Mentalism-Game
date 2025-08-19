import java.util.Random;  // Needed for random number generation
import java.util.Scanner; // Needed for reading user input 
public class Mentalism {
    
  public static void main(String[] args) {

    Random randomGenerator = new Random();
    final int maxValue = 5;
    final int minValue = 1;
    int numberToGuess = randomGenerator.nextInt(maxValue) + minValue;
    int numberToAdd = numberToGuess * 2;


    System.out.print("Hello. What is your name? ");
    Scanner keyboardInput = new Scanner(System.in);
    String name = keyboardInput.nextLine();
    // System.out.println() adds new line (\n) at end of output
    System.out.println("Welcome, " + name + ", we'll perform some mind reading.");
    
    System.out.println("Enter a number between 1 and 10:");
    int enteredNumber = keyboardInput.nextInt();
 
    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();
 
    System.out.println("Multiply the number by 2.");
    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();
 
    System.out.println("Now add " + numberToAdd);
    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();
 
    System.out.println("Now, divide the number by 2.");
    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();
 
    System.out.println("Now, subtract the original number that you thought of.");
    System.out.print("Hit Enter/Return when ready for the last step.");
    keyboardInput.nextLine();
   
    System.out.print("Well, " + name + " let me read your mind... ");
    System.out.println("The number that you have now is " + numberToGuess + ".");
  } 
}
