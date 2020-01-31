public class Person {
    public static void main(String[] args){
        Person a = new Person("Elmo" + "\n");
        a.sayHello();
        //*********** Step 2 Start ***********//
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println("\n" + person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


        //*********** Step 2 End ***********//

    }


    //******* Step 1 Start *******//
    private String name;

    public Person(String name){
//        this.name = name;
        this.setName(name);
    }

    //return the persons name
    public String getName(){
        return this.name;
    }


    //changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }



    //prints a message to the console using the persons name
    public void sayHello(){
        System.out.printf("Hello, my name is %s", this.name);
    }
    //********** Step 1 End ***********//



    //********** Step 3 Start *********//





}
