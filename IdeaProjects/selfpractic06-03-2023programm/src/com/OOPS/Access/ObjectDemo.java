package com.OOPS.Access;
public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {

        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {

        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
     ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj1 = new ObjectDemo(45);

        System.out.println(obj.hashCode());
    }
}
