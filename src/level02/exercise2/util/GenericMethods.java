package level02.exercise2.util;

public class GenericMethods {
    public static <T> void printArgs(T... args) {
        for (T arg : args) {
            System.out.println(arg);
        }
    }
}
