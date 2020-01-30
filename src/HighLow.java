import java.util.Scanner;
import java.util.Random;
public class HighLow {
public static void main(String[] args) {
    System.out.println(highLow());
    }

public static int highLow() {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int number = random.nextInt(100);
    int guess = -1;
    while(guess != number){
        System.out.println("Enter your guess: ");
        guess = scanner.nextInt();
        if(guess < number){
            System.out.println("Too low, try again!");
        }else if(guess > number){
            System.out.println("Too high, try again!");
        }else{
            System.out.println("Correct, the number was " + number);
        }
    }


    return number;
    }
    }
    //********** Ask tutor to help prompt user if they want to continue **********//
