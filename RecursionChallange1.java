package zOther;

public class RecursionChallange1 {
    public static void main(String[] args) {


        countTo(1);

    }

    public static void countTo(int number) {

        if (number > 100) {
            return;
        }

        System.out.println(number);
        countTo(number + 1);

    }

}


