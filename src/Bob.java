import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ask bob a something: ");
        String userInput = scanner.nextLine();
//        System.out.println(userInput);
        boolean Continue = true;
        if(userInput.endsWith("?")){
            System.out.println("sure");
        }else if(userInput.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else if(userInput.equals("")){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever");
        }


    }
}


//**********Ask tutor to help include a continue in this function!**********//