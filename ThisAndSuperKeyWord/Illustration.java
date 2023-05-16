package ThisAndSuperKeyWord;

// illustration class
public class Illustration {

    Illustration getIllustration() {
        // returing the instance of current class
        System.out.println("Hello !");
        return this;
    }

    void print() {
        System.out.println("Hello World!");
    }
}

  class Main {

    public static void main(String[] args) {
        new Illustration().getIllustration().print();
    }
}
