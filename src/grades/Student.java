package grades;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, int grades){
        this.name = name;
        this.grades = new ArrayList<>();
    }


}
