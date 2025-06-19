package level02.exercise2.util;


public class GenericMethods {

    @SafeVarargs
    public static <T> void printArgs(T... args) {
        if (args == null || args.length == 0) {
            System.out.println("No arguments supplied");
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg" + (i + 1) + ": " + args[i]);
        }
    }
}
