package util;
import java.util.Scanner;
public class Input {
    private  Scanner scanner;

    public static void main(String[] args) {
        Input input = new Input();
//        input.getString();
//        input.yesNo();
//        input.getInt(5, 60);
//        input.getInt();
//        input.getDouble(5, 7);
        input.getDouble();
    }

    public Input(){
        this.scanner = new Scanner(System.in);
    }




    //************* Get String Method
    public String getString(){
        String answer;
        System.out.println("Enter a string: ");
        answer = this.scanner.next();
        return answer;
    }




    //************* Yes No Method
    public boolean yesNo(){
        String answer;
        System.out.println("What is your answer? [yes/no]");
        answer = this.scanner.next();
        return answer.toLowerCase().startsWith("y");
    }





    //************* Get Int Min and Max Method
    public int getInt(int min, int max){
        int answer;
        do{
            System.out.println("Enter an integer between " + min +" and " + max + ": ");
            answer = this.scanner.nextInt();
        }while(answer < min || answer > max);
        return answer;
    }




    //************* Get Int Method
    public int getInt(){
        int answer;
        System.out.println("Enter a number: ");
        answer = this.scanner.nextInt();
        return answer;
    }




    //************* Get Double Min and Max Method
    public double getDouble(double min, double max){
        double answer;
        do{
            System.out.println("Enter a double: ");
            answer = this.scanner.nextDouble();
        }while(answer < min || answer > max);
        return answer;
    }


    public double getDouble() {
        return getDouble("Enter a double:");
    }



    //************* Get Double Method
    public double getDouble(String prompt){
        double answer;
        System.out.println(prompt);
        answer = this.scanner.nextDouble();
        return answer;
    }
}


















