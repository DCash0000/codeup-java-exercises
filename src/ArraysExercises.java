import util.PersonPractice;

import java.sql.SQLOutput;
import java.util.Arrays;
public class ArraysExercises {
    public String[] name;

    public static void main(String[] args) {
        //*********** Step 1 ************//
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];//Creating the array//
        Person newPerson = new Person("Cash");//Declaring the new Person with name//
        persons[0] = newPerson;
        newPerson = new Person("Jill");
        persons[1] = newPerson;
        newPerson = new Person("John");
        persons[2] = newPerson;


        //Looping through the array//
        for(Person person : persons){
            System.out.println(person);
        }

        //Looping through array and adding new name//
        newPerson = new Person("Mittly");
        Person[] people = addPerson(persons, newPerson);
        for(Person person : people){
            System.out.println(person);
        }
    }

    //Constructor adding the new person//
    public static Person[] addPerson(Person[] persons, Person newPerson){
        Person[] persons2 = Arrays.copyOf(persons, persons.length + 1);
        persons2[persons.length] = newPerson;
        return persons2;
    }









}
