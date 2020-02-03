package util;
public class PersonPractice {
    private String name;
    public String toString(){
        String output = "";
        output += name;
        return output;
    }

    public static void main(String[] args) {
        PersonPractice person = new PersonPractice("Cash");
//        person.sayHello();
//        System.out.println(person.getName());

//        PersonPractice person1 = new PersonPractice("John");
//        PersonPractice person2 = new PersonPractice("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        PersonPractice person1 = new PersonPractice("John");
//        PersonPractice person2 = person1;
//        System.out.println(person1 == person2);
//
//        PersonPractice person1 = new PersonPractice("John");
//        PersonPractice person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
    public PersonPractice(String name){

        this.name = name ;
    }

    public String getName(){

        return this.name;
    }

    public void setName(String name){

        this.name = name;
    }

    public void sayHello(){

        System.out.println("Hello " + this.name);
    }
}
