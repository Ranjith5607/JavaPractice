package lambda;

interface MessageInterface {

    public abstract void msg();
}

public class LamdaEmptyParametor {
    public static void main(String[] args) {
        MessageInterface messageInterface = () -> System.out.print("hello");
        messageInterface.msg();

    }
}
