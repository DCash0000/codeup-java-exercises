package util;
import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Input{
    private Scanner scanner;
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.yesNo());
//        System.out.println(input.getInt(5, 10));
//        System.out.println(input.getInt());
//        System.out.println(input.getDouble(5, 10));
//        System.out.println(input.getDouble());
//        System.out.println(getInt());
//        System.out.println(input.getAnInteger());
        System.out.println(input.getADouble());
    }

    public Input(){
        this.scanner = new Scanner(System.in);


    }

    public  int getAnInteger() {
        int userInput = 0;
        boolean error = true;
        do{
            try {
                System.out.println("\n" + "Enter an integer: ");
                userInput = Integer.valueOf(this.scanner.next());
                error = false;
                System.out.println("You entered: " + userInput);
            } catch (NumberFormatException e) {
                System.out.print("That's not integer.");
            }
        }while(error);
        return userInput;
    }


    public double getADouble(){
        double userInput = 0;
        boolean error = true;
        do{
            try{
                System.out.println("\n" + "Enter a double: ");
                userInput = Double.valueOf(this.scanner.next());
                error = false;
                System.out.println("You entered: " + userInput);
            }catch(NumberFormatException e){
                System.out.println("That's not a double.");
            }
        }while(error);
        return (double) userInput;
    }


//    public double getDouble(){
//        double answer;
//        System.out.println("Enter a double: ");
//        answer = this.scanner.nextDouble();
//        return answer;
//    }


//    public int getInt(){
//        int answer;
//        System.out.println("Enter integer: ");
//        answer = this.scanner.nextInt();
//        return answer;
//    }
//
//    public double getDouble(){
//        double answer;
//        System.out.println("Enter a double: ");
//        answer = this.scanner.nextDouble();
//        return answer;
//    }

//    public String getString(){
//        String answer;
//        System.out.println("Enter string: ");
//        answer = this.scanner.nextLine();
//        return answer;
//    }

//    public boolean yesNo(){
//        String answer;
//        System.out.println("[Yes/No]");
//        answer = this.scanner.nextLine();
//        return(answer.equalsIgnoreCase("Yes") || answer.startsWith("y") || answer.startsWith("Y"));
//        }

//   public int getInt(int min, int max){
//        int answer;
//       do{
//           System.out.println("Enter a integer between: " + min + " and "  + max);
//           answer = this.scanner.nextInt();
//       } while(answer > max || answer < min);
//       return(answer);
//
//        }



//   public double getDouble(double min, double max){
//        double answer;
//        do{
//            System.out.println("Enter a double between: " + min + " and " + max);
//            answer = this.scanner.nextDouble();
//        }while(answer > max || answer < min);
//        return (answer);
//   }









}
















































