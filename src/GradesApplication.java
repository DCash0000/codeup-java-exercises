import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import grades.Student;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;

import org.w3c.dom.ls.LSOutput;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;


        Student student1 = new Student("Cash", "2017-10-02", "Present");
        student1.addGrade(60);
        student1.addGrade(75);
        student1.addGrade(95);
//        System.out.println(student1.getName() + "\'s" + " grades: " + student1.getGrade());
//        System.out.println(student1.getName() + "\'s" + " average: " + student1.getGradeAverage());
//        System.out.println(student1.getDate() + " " + student1.getName() + ": " + student1.getValue());
//
        Student student2 = new Student("John", "2017-10-02", "Absent");
        student2.addGrade(75);
        student2.addGrade(90);
        student2.addGrade(80);
//        System.out.println(student2.getName() + "\'s" + " grades: " + student2.getGrade());
//        System.out.println(student2.getName() + "\'s" + " average: " + student2.getGradeAverage());
//        System.out.println(student2.getDate() + " " + student2.getName() + ": " + student2.getValue());


        Student student3 = new Student("Jill", "2017-10-02", "Absent");
        student3.addGrade(75);
        student3.addGrade(90);
        student3.addGrade(80);
//        System.out.println(student3.getName() + "\'s" + " grades: " + student3.getGrade());
//        System.out.println(student3.getName() + "\'s" + " average: " + student3.getGradeAverage());
//        System.out.println(student3.getDate() + " " + student3.getName() + ": " + student3.getValue());


        Student student4 = new Student("Jack", "2017-10-02", "Present");
        student4.addGrade(75);
        student4.addGrade(90);
        student4.addGrade(80);
//        System.out.println(student4.getName() + "\'s" + " grades: " + student4.getGrade());
//        System.out.println(student4.getName() + "\'s" + " average: " + student4.getGradeAverage());
//        System.out.println(student4.getDate() + " " + student4.getName() + ": " + student4.getValue());


        HashMap<String, String> students = new HashMap<>();
        students.put(student1.getName(), "Aquafina123");
        students.put(student2.getName(), "Codeup123");
        students.put(student3.getName(), "PSvita123");
        students.put(student4.getName(), "Xbox123");
//        System.out.println(students);

        double classAverage;
        classAverage = (student1.getGradeAverage() + student2.getGradeAverage() + student3.getGradeAverage() + student4.getGradeAverage()) / 4;
//        System.out.println("The overall class average is: " + classAverage);


        System.out.println("Welcome!");
        System.out.println("Here are the GitHub user-names of our students: " + "\n" + " | " + students.get("Cash") + " | " + students.get("John") + " | " + students.get("Jill") + " | " + students.get("Jack"));
//        System.out.println("Which Student would you like to see?");
//        userInput = scanner.nextLine();

//        if (userInput.equals(students.get("Cash")) || userInput.equals(students.get("Jack")) || userInput.equals(students.get("Jill")) || userInput.equals(students.get("John"))) {
//            System.out.println("Here they are!");
//        } else {
//            System.out.println("Sorry, no student found with the GitHub username of" + "\"" + userInput + "\"");
//        }
//        System.out.println("Would you like to see another student [Yes/No]?");
//
//        userInput = scanner.nextLine();
        do {
//            if (userInput.equalsIgnoreCase("Yes")) {
                System.out.println("Which Student would you like more information on?");
                userInput = scanner.nextLine();
                if (userInput.equals(students.get("Cash"))) {
                    System.out.println("Name: " + student1.getName() + " - " + "GitHub Username: " + students.get("Cash") + "\n" + "Current average is: " + student1.getGradeAverage() + "\n" + "Current grades: " + student1.getGrade());
                } else if (userInput.equals(students.get("John"))) {
                    System.out.println("Name: " + student2.getName() + " - " + "GitHub Username: " + students.get("John") + "\n" + "Current average is: " + student2.getGradeAverage() + "\n" + "Current grades: " + student2.getGrade());
                } else if (userInput.equals(students.get("Jill"))) {
                    System.out.println("Name: " + student3.getName() + " - " + "GitHub Username: " + students.get("Jill") + "\n" + "Current average is: " + student3.getGradeAverage() + "\n" + "Current grades: " + student3.getGrade());
                } else if (userInput.equals(students.get("Jack"))) {
                    System.out.println("Name: " + student4.getName() + " - " + "GitHub Username: " + students.get("Jack") + "\n" + "Current average is: " + student4.getGradeAverage() + "\n" + "Current grades: " + student4.getGrade());
                } else {
                    System.out.println("Sorry no student found with the GitHub username of " + userInput);
                }
                System.out.print("Would you like to see the CSV report of all Students [Yes/No]?" + "\n");
                userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("Yes")) {
                    System.out.println("name, github_username, average" + "\n" + student1.getName() + ", " + students.get("Cash") + ", " + student1.getGradeAverage() + "\n" + student2.getName() + ", " + students.get("John") + ", " + student2.getGradeAverage() + "\n" + student3.getName() + ", " + students.get("Jill") + ", " + student3.getGradeAverage() + "\n" + student4.getName() + ", " + students.get("Jack") + ", " + student4.getGradeAverage());
                }




            System.out.println("Would you like to see another student [Yes/No]?");
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("No")) {
                System.out.println("Goodbye, and have a wonderful day!");
            }

        } while (userInput.equalsIgnoreCase("Yes"));

    }


}







