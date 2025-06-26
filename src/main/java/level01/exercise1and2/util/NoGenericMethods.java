package level01.exercise1and2.util;

import java.util.Objects;

public class NoGenericMethods {
    private String arg1;
    private int arg2;
    private char arg3;

    public NoGenericMethods(String arg1, int arg2, char arg3) {
        this.arg1 = Objects.requireNonNull(arg1, "arg1 must not be null");
        this.arg2 = Objects.requireNonNull(arg2, "arg2 must not be null");
        this.arg3 = Objects.requireNonNull(arg3, "arg3 must not be null");
    }

    public Object getArg1() {
        return this.arg1;
    }

    public Object getArg2() {
        return this.arg2;
    }

    public Object getArg3() {
        return this.arg3;
    }

    public void setArg1(String arg1) {
        this.arg1 = Objects.requireNonNull(arg1, "arg1 must not be null");
    }
    public void setArg2(int arg2) {
        this.arg2 = Objects.requireNonNull(arg2, "arg2 must not be null");
    }
    public void setArg3(char arg3) {
        this.arg3 = Objects.requireNonNull(arg3, "arg3 must not be null");
    }
}

