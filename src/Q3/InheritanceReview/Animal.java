package Q3.InheritanceReview;

public class Animal {
    private int myAge;
    private String myName;

    public Animal() {
        myAge = 0;
        myName = "";
    }
    //two possible ways to call constructor--with nothing or with age and name.
    //basically makes it so that if you put no constructors it
    //doesnt throw out an error


    public Animal(int age, String name){
        myAge = age;
        myName = name;
    }

    public void eat(){
        System.out.println("I can eat");
    }

    public void speak() {
        System.out.println("Hello there!");
    }

    public int getAge() {return myAge;}
    public String getName() {return myName;}


}
