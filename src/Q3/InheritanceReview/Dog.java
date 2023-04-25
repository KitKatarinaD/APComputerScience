package Q3.InheritanceReview;

public class Dog extends Animal{
    private String myColor;

    public Dog(int age, String name, String color){
        super(age, name);
        myColor = color;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I eat dog food");
    }
    //overriding changes the implementation


    //overload:
    public void speak(String word){
        System.out.println(word);
    }
    public void bark() {
        System.out.println("Bark!");
    }

    public String toString() {
        return "Age: " + super.getAge() +
                "\nName: " + super.getName() +
                "\nColor: " + myColor;
    }

}
