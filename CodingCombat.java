import java.util.Scanner;
import java.util.Random;

//You will need to import two files here
//One you already know and one you will have to figure out hehehehehe
public class CodingCombat {
    public static void main(String[] args) {
        // Welcome message

        System.out.println("Welcome to Naomi's Bada$$ Game!");
        // Scanner for user input

        Scanner userInput = new Scanner(System.in);
        // Prompt user for Fighter One

        System.out.println("Choose your Bada$$ fighter, Like NOW,");
        String fighterNameOne = userInput.nextLine();

        // Prompt user for Fighter Two
        System.out.println("Now pick your Bada$$ 2nd fighter!");
        String fighterNameTwo = userInput.nextLine();

        // Generate random values for Fighter One and Fighter Two
        int firstFighter = new Random().nextInt(10)+1;
        int secondFighter = new Random().nextInt(10)+1;

        // Print values for the fighters
        System.out.println(fighterNameOne + " has a value " + firstFighter);
        System.out.println(fighterNameTwo + " has a value " + secondFighter);

        // Implement the game logic here
        if (firstFighter > secondFighter){
            System.out.println(fighterNameOne + " beat " + fighterNameTwo);
        }else if (secondFighter > firstFighter){
            System.out.println(fighterNameTwo + " beat " + fighterNameOne);
        }else{
            System.out.println(fighterNameOne + " is tied with " + fighterNameTwo);
        }

        // Close the scanner
        userInput.close();
    }
}


























