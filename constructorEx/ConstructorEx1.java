package constructorEx;

public class ConstructorEx1 {

    ConstructorEx1(int a){

    }
    ConstructorEx1(ConstructorEx1 constructorEx1){

    }
    public static void main(String[] args) {
        ConstructorEx1 constructorEx1= new ConstructorEx1(10);
        ConstructorEx1 constructorEx2 = new ConstructorEx1(constructorEx1);
    }
}
