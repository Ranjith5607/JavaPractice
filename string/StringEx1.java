package string;

public class StringEx1 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s3 = "abc";

        StringBuffer s2 = new StringBuffer(s1);
        System.out.println(s2 instanceof StringBuffer);
        System.out.println(s1.equals(s2));
    }
}

