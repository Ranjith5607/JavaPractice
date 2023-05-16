package oops;

class parent {

    public void m1() {
        System.out.println("this is M1 method parent class ");

    }

   protected    void m2() {
        System.out.println("this is M2 method parent class ");

    }

}

public class Child extends parent {

    public void m1() {
        System.out.println("this is M1  child class");

    }

       public void m2() {
        System.out.println("this is M2 method child class ");

    }
    public static void main(String[] args) {
        parent parentClass1 = new Child();
        parentClass1.m1();
        Child child = new Child();
        child.m2();

    }

}
