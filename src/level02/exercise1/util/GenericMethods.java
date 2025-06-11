package level02.exercise1.util;

public class GenericMethods {
    public static <T, V> void printArgs(T arg1, String arg2, V arg3) {
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}
