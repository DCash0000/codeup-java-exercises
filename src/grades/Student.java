package grades;
import java.util.Date;


import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private String date;
    private String value;
    private ArrayList<Integer> grades;
//    HashMap<String, String> attendance = new HashMap<>();


    public Student(String name, String date, String value){
        this.name = name;
        this.date = date;
        this.value = value;
        this.grades = new ArrayList<>();
    }



    public String getDate(){
        return this.date;
    }

    public String getValue(){
        return this.value;
    }
    //Attendane method
    public String recordAttendance(String date, String value){
        return date + " " + value;


    }


    //Returns the students name
    public String getName(){
        return this.name;
    }

    public ArrayList<Integer> getGrade(){
        return this.grades;
    }



    //Adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

//    public double getAttendanceAverage(){
//        double total = 0;
//        attendance.forEach((key, value) ->
//                if (value.equalsIgnoreCase("Absent"))
//                    total++;);
////            total += values;
//        return (attendance.size() - total) / attendance.size();
//    }


    //Returns average of Students grade
    public double getGradeAverage() {
        double total = 0;
        for (double grade : grades)
        total += grade;
        return total / grades.size();
    }





}
