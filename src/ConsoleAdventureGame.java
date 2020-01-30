import java.util.Scanner;
import java.util.Random;
public class ConsoleAdventureGame {
    public static void main(String[] args) {
        start();

    }

    static String playerName;
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you ready to play [Yes/No]");
        String continueYes = scanner.nextLine();
        if(continueYes.equalsIgnoreCase("Yes")){
            System.out.println("Enter your name: ");
            playerName = scanner.next();
            System.out.println("Hi " + playerName);
            String myWeapon;
            String myArmor;
            String myPouch;
            myArmor = "Chain Mail Suit";
            myWeapon = "Axe";
            myPouch = "Potion";

            System.out.println("Your current weapon: " + myWeapon + "\n" + "And your current armor: " + myArmor);
            int yourHP;
            yourHP = 10;
            System.out.println("Your current hp is: " + yourHP);
            firstBattle();
        }
    }
    public static String enemyPlayer;

    public static void firstBattle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You encounter an enemy");
        System.out.println("What will you do [Fight/Run]?");
        String fightYes = scanner.next();
        int enemyHp;
        enemyHp = 10;
        if(fightYes.equalsIgnoreCase("Fight")){
            System.out.println(playerName + " Attacks the enemy!!!");
            System.out.println("Great Job " + playerName + " Enemy hp now: " + (enemyHp - 4));
            System.out.println("Oh no the enemy is trying to escape!");
            System.out.println("Will you defeat the enemy or spare them [Defeat/Spare]?");
            String defeatEnemy = scanner.next();
            if(defeatEnemy.equalsIgnoreCase("Defeat")){
                System.out.println(playerName + " delivers the finishing blow! " + "Enemy hp: " + (enemyHp - 10) );
            }

        }
//        System.out.println("First battle");
    }


}




//        String playerName;
//        System.out.println("Enter your name: ");
//        playerName = scanner.nextLine();



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Are you ready to play [Yes/No]");
//        String ContinueYes = scanner.next();
//        if (ContinueYes.equalsIgnoreCase("Yes")) {
//           //****Store name as Variable****//
//            System.out.println("Enter your Name: ");
//            Scanner scannerName = new Scanner(System.in);
//            String name = scannerName.next();
//            System.out.print("Hi " + name);
//
//
//
//
//        }