package level02.exercise1.util;

public class GenericMethods {
    public static <T, V> void printArgs(T arg1, String arg2, V arg3) {
        System.out.println("Arg1: " + arg1);
        System.out.println("Arg2: " + arg2);
        System.out.println("Arg3: " + arg3);
    }
}
