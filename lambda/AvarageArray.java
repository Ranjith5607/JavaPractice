package lambda;

interface IAvarge {
    public abstract double avg(int array[]);
}

public class AvarageArray {

    public static void main(String[] args) {


        IAvarge iAvarge = (avg) -> {

            double sum = 0;
            int lengthOfArray = avg.length;

            for (int i = 0; i <= avg.length-1; i++) {
                sum = sum + avg[i];

            }
            return sum / lengthOfArray;
        };
        int array[] = {1, 2, 3, 4, 5, 6};
        System.out.println(iAvarge.avg(array));
    }
}
