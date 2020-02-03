package util;
import java.util.Scanner;
public class Input{
    private Scanner scanner;
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.yesNo());
//        System.out.println(input.getInt(5, 10));
//        System.out.println(input.getInt());
//        System.out.println(input.getDouble(5, 10));
        System.out.println(input.getDouble());

    }

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        String answer;
        System.out.println("Enter string: ");
        answer = this.scanner.nextLine();
        return answer;
    }

    public boolean yesNo(){
        String answer;
        System.out.println("[Yes/No]");
        answer = this.scanner.nextLine();
        return(answer.equalsIgnoreCase("Yes") || answer.startsWith("y") || answer.startsWith("Y"));
        }

   public int getInt(int min, int max){
        int answer;
       do{
           System.out.println("Enter a integer between: " + min + " and "  + max);
           answer = this.scanner.nextInt();
       } while(answer > max || answer < min);
       return(answer);

        }

   public int getInt(){
        int answer;
       System.out.println("Enter integer: ");
       answer = this.scanner.nextInt();
       return answer;
   }

   public double getDouble(double min, double max){
        double answer;
        do{
            System.out.println("Enter a double between: " + min + " and " + max);
            answer = this.scanner.nextDouble();
        }while(answer > max || answer < min);
        return (answer);
   }


   public double getDouble(){
        double answer;
       System.out.println("Enter a double: ");
       answer = this.scanner.nextDouble();
       return answer;
   }



}






























//public class Input {
//    private  Scanner scanner;
//
//    public static void main(String[] args) {
//        Input input = new Input();
//        input.getString();
//        input.yesNo();
//        input.getInt(5, 60);
//        input.getInt();
//        input.getDouble(5, 7);
//        input.getDouble();
//    }
//
//    public Input(){
//        this.scanner = new Scanner(System.in);
//    }
//
//
//
//
//    //************* Get String Method
//    public String getString(){
//        String answer;
//        System.out.println("Enter a string: ");
//        answer = this.scanner.next();
//        return answer;
//    }
//
//
//
//
//    //************* Yes No Method
//    public boolean yesNo(){
//        String answer;
//        System.out.println("What is your answer? [yes/no]");
//        answer = this.scanner.next();
//        return answer.toLowerCase().startsWith("y");
//    }
//
//
//
//
//
//    //************* Get Int Min and Max Method
//    public int getInt(int min, int max){
//        int answer;
//        do{
//            System.out.println("Enter an integer between " + min +" and " + max + ": ");
//            answer = this.scanner.nextInt();
//        }while(answer < min || answer > max);
//        return answer;
//    }
//
//
//
//
//    //************* Get Int Method
//    public int getInt(){
//        int answer;
//        System.out.println("Enter a number: ");
//        answer = this.scanner.nextInt();
//        return answer;
//    }
//
//
//
//
//    //************* Get Double Min and Max Method
//    public double getDouble(double min, double max){
//        double answer;
//        do{
//            System.out.println("Enter a double: ");
//            answer = this.scanner.nextDouble();
//        }while(answer < min || answer > max);
//        return answer;
//    }
//
//
//    public double getDouble() {
//
//        return getDouble("Enter a double:");
//    }
//
//
//
//    //************* Get Double Method
//    public double getDouble(String prompt){
//        double answer;
//        System.out.println(prompt);
//        answer = this.scanner.nextDouble();
//        return answer;
//    }
//}


















