package staticEx;

public class Main {
    static  void print1(){
        System.out.println(" this is static method1");

    }

    static  void print(){
        print1();
         System.out.println(" this is static method");

     }
    public static void main(String args[]){

        Main.print();
    }


}
