import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int userInput = scanner.nextInt();
        System.out.println("The number entered is: " + userInput);

        if(userInput % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
