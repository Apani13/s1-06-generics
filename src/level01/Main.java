package level01;

public class Main {
public static void main(String[] args) {
    NoGenericMethods noGenericMethods = new NoGenericMethods("first", "second", "third");

    System.out.println("NoGenericMethods args:");
    System.out.println(noGenericMethods.getArg1());
    System.out.println(noGenericMethods.getArg2());
    System.out.println(noGenericMethods.getArg3());

    Person person = new Person("Alma", "Calandraca", 80);
    String text = "Hello world!";
    int number = 5545;

    System.out.println("\nGenericMethods printArgs with different types: ");
    GenericMethods.printArgs(person, text, number);


}
}
