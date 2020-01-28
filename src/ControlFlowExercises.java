import java.awt.*;
import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        //****************** While **********************//
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        //******************* Do While ******************//


        //************ Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line. **************//
//        int num = 100;
////        System.out.print("Even Numbers from 0 to "+ num +" are: ");
//        for (int i = 0; i <= 100 ; i++) {
//            //if number%2 == 0 it means its an even number
//            if (i % 2 == 0) {
//                System.out.print("\n" + i + " ");
//            }
//        }


        //or

//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//
//        }while(i <= 100);


        //************ Alter your loop to count backwards by 5's from 100 to -10. **************//
//        int num = 100;
////        System.out.print("Even Numbers from 0 to "+ num +" are: ");
//        for (int i = 100; i > 0 ; i-=5) {
//            //if number%2 == 0 it means its an even number
//            if (i % 5 == 0) {
//                System.out.print("\n" + i + " ");
//            }
//        }

        //or


//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while(i >= 0);



        //*************** Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal: *********//
//        long i = 2;
//        do{
//            System.out.println("i is " + i);
//            i *= i;
//        }while( i < 1000000);



        //Fizz Buzz//
//        for (int i = 1; i <= 100; i++){
//            if(i % 15 == 0){
//                System.out.println(i + " = " +"FizzBuzz" );
//            }else if( i % 5 == 0){
//                System.out.println(i + "= " + "Buzz");
//            }else if( i % 3 == 0){
//                System.out.println(i + "= " + "Fizz");
//            }
//        }
//        int num = 100;
//        for(int i = 0; i <= num; i++){
//            if(i % 3 == 0){
//                System.out.print("fizz" + "\n" + i);
//            }
//            else if(i % 5 == 0 ){
//                System.out.print("buzz" + "\n" + i);
//            }
//            else if(i % 15 == 0){
//                System.out.print("fizzbuzz" + "\n" + i);
//            }
//        }

        //**************** Display a table of powers. **************//
        Scanner scanner = new Scanner(System.in);
//        int i = 0;
//        while(i != -1){
//            System.out.print("enter an interger: ");
//            i = scanner.nextInt();
//            System.out.println("\nThe number is " + i + ".\n");
//        }

//        Scanner input = new Scanner(System.in);
//        //this goes into loop
//        System.out.print("Enter an integer: ");
//        int number = input.nextInt();
//        System.out.println("You entered " + number);


//        int startValue = 5;
//        for(int row = 0; row < 5; row++){
//            int y = 1;
//            for(int col = number; col < number + 3; col++){
//                y = y * number;
//                System.out.print(y + " ");
//            }
//            System.out.println();
//            number++;
//            //this exits outside of loop
//            System.out.print("Do you want to Continue?");
//            String response = input.nextLine();
//        }

//        int product = 1, count = 0;
//        System.out.println("This program will generate a table of powers of a number.");
//        System.out.println("You just have to tell me what number: \n\n");
//        System.out.print("Enter an integer please: ");
//        int MyNum = Fred.nextInt();
//        while (count < 15)
//        product = product * MyNum;
//        System.out.print(product);
//        System.out.println("Bye for now...");

//
        int i;
        String userInput;
        int baseInt;
        int maxInt;
        do{
            System.out.println("Enter an integer: ");
            baseInt = scanner.nextInt();
            System.out.println("What number would you like to go up to?");
            maxInt = scanner.nextInt();
            System.out.print("number | squared | cubed\n" + "------ | ------ | ------\n");
            for(i = baseInt; i <=maxInt; i++){
                System.out.print(i + " |" + (i * i) +" |" +(i*i*i) + "\n");
            }
            System.out.println("\nWould you like to continue? [yes/no]");
            userInput = scanner.next();
            i++;
        }while(userInput.equals("yes"));




    }
}