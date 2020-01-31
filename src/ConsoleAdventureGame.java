import java.util.Scanner;
import java.util.Random;
public class ConsoleAdventureGame {
    public static void main(String[] args) {
        start();

    }
    //********** Start of the game method **********//
    static String playerName;
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you ready to play [Yes/No]");
        String continueYes = scanner.nextLine();
        if(continueYes.equalsIgnoreCase("Yes")){
            System.out.println("Enter your name: ");
            playerName = scanner.next();
            System.out.println("Hi " + " \"" + playerName +  "\" " + " my name is Pixie, the Sprite and I'll be your traveling companion!" + "\n"
            + "Lets go over your Equipment and Stats!");
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
            System.out.println("Now " + "\"" + playerName + "\"" + " lets continue on our Journey!");
            System.out.println("__________________________________________________");
            firstBattle();
            secondBattle();
        }
    }
    //********** Start of the game method end **********//

    //********** Defined Scope Variables **********//
    public static String enemyPlayer;

    //********** First Battle method **********//
    public static void firstBattle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey " + "\"" + playerName + "\"" + " be on the lookout for possible enemies!" + "\n" + "You turn a corner and out of nowhere something jumps out and startles you!" + "\n" + "Yikes you've encountered your first enemy!");
        System.out.println("Enemy: hp 10");
        System.out.println("What will you do [Fight/Run]?");
        String fightYes = scanner.next();
        int enemyHp;
        enemyHp = 10;
        if(fightYes.equalsIgnoreCase("Fight")){
            System.out.println("___________________________________________________");
            System.out.println("\"" + playerName + "\"" + " Attacks the enemy!!!");
            System.out.println("Great Job " + "\"" + playerName +"\"" + " Enemy hp now: " + (enemyHp - 4));
            System.out.println("Oh no the enemy is trying to escape!");
            System.out.println("Will you defeat the enemy or spare them [Defeat/Spare]?");
            String defeatEnemy = scanner.next();
            if(defeatEnemy.equalsIgnoreCase("Defeat")){
                System.out.println("\"" + playerName + "\"" + " delivers the finishing blow! " + "Enemy hp: " + (enemyHp - 10) );
            }else{System.out.println("You are of kind heart " + playerName + " you have spared your enemy!");}

        }
    }
    //********** First Battle method end **********//


    //********** Second Battle method **********//
    public static void secondBattle(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("you continue on your journey");
        System.out.println("___________________________________________________");


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