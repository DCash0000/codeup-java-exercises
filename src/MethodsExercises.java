import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(2, 1));
//        System.out.println(multiplication(2, 1));
//        System.out.println(division(6, 2));
//        System.out.println(mod(24, 5));
//        System.out.println(multiAddition(5, 2));
//        System.out.println(multiAdditionRecursive(7, 2));
//        System.out.println(getInteger(1, 1));
//        System.out.println(factorials(1, 1));
        System.out.println(rollDice());

    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return (num1 / num2);
    }

    public static int mod(int num1, int num2) {
        return num1 % num2;
    }

    public static int multiAddition(int base, int multiplier) {
        int total = 0;
        for (int i = 0; i < multiplier; i++) {
            total += base;
        }
        return total;
    }

    public static long multiAdditionRecursive(int base, int multiplier) {
        if (multiplier == 0) {
            return 0;
        }
        return base + multiAdditionRecursive(base, multiplier - 1);
    }

    //********** Step 2 **********//
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int input = scanner.nextInt();
        if(input > 0 && input < 5 ){
            System.out.println("In range!" );
        }else{
            System.out.println("Out of range!");
        }
        return input;
    }
    //**********Ask tutor how to make this continue until input is in range**********//


    //*********** Step 3 **********//
    public static int factorials(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number 1-10: ");
        int input = scanner.nextInt();
        int i,fact = 1;
        for(i = 1; i <= input; i++){
            fact = fact * i;
        }

        return fact;
    }

    //********** Step 4 **********//
    public static int rollDice(){
        Scanner scanner = new Scanner(System.in);
        int sides;
        int ready;
        int die1;
        int die2;
        int reRoll;
        do {
            System.out.println("Roll dice");
            System.out.println("Enter the number of sides of die: ");
            sides = scanner.nextInt();
            System.out.println("Ready to Roll? 1 for YES and 0 for exit");
            ready = scanner.nextInt();
            die1 = (int) (Math.random() * sides) + 1;
            die2 = (int) (Math.random() * sides) + 2;
            System.out.println("First die: " + die1);
            System.out.println("Second die: " + die2);
            System.out.println("Total: " + (die1 + die2));
            System.out.println("Would you like to roll again? Enter 1 for YES and 0 to exit");
            reRoll = scanner.nextInt();


            } while (reRoll == 1) ;
            return reRoll;
        }





    //********** Step 5 **********//









    //********** Step 6 **********//







}

