import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Date;
public class Student{
    public static void main(String[] args){
        Student Cash = new Student("Cash");
        Cash.cohort = "Europa";
        Cash.startDate = new Date("11/04/2019");
        Cash.program = "Web Dev";
        Cash.location = "San Antonio";
        Cash.drinksCoffee = true;


        Cash.report();


    }

    static int numberOfStudents = 0;
    public  String name;
    String cohort;
    private Date startDate;
    String program;
    String location;
    public boolean drinksCoffee;


    public Student(String name) {
        numberOfStudents++;
        this.name = name;
        this.drinksCoffee = true;
        this.startDate = new Date();
    }

    public void report() {
        String output = "";
        output += "My name is " + this.name +". " + "\n";
        output += "I started learning "+ "\n" + this.program + " with " + this.cohort + " on " + this.startDate + ". ";
        if (this.drinksCoffee)
            output += "I drink coffee in " + this.location + ".";
        else
            output += "I don't drink coffee in " + this.location + ".";
        System.out.println( output);
    }


}
