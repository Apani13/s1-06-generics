package level01;

public class NoGenericMethods {
    private Object arg1;
    private Object arg2;
    private Object arg3;

    public NoGenericMethods(Object arg1, Object arg2, Object arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
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

    public void setArg1(Object arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(Object arg2) {
        this.arg2 = arg2;
    }

    public void setArg3(Object arg3) {
        this.arg3 = arg3;
    }
}
