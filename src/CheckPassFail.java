import java.sql.SQLOutput;
import java.util.Scanner;
public class CheckPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mark: ");
        int userInput = scanner.nextInt();

//        int mark = 49;
        System.out.println("The mark is: " + userInput);
//
        if(userInput >= 50){
            System.out.print("pass");
        }else{
            System.out.println("fail");
        }
    }
}
