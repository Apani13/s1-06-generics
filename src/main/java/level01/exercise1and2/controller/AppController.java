package level01.exercise1and2.controller;

import level01.exercise1and2.model.Person;
import level01.exercise1and2.util.GenericMethods;
import level01.exercise1and2.util.NoGenericMethods;

public class AppController {
    public void run() {
        NoGenericMethods noGenericMethods = new NoGenericMethods("first", 34, 'f');

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
