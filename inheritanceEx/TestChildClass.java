package inheritanceEx;

public class TestChildClass  extends  TestParentClass{
    TestChildClass(int a, int b){
        super(a);
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        TestChildClass  testChildClass = new TestChildClass(10,20);
    }
}
