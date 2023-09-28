package zOther;

public class RecursionChallange2 {
    public static void main(String[] args) {


        System.out.println(addition(5));

    }


    public static int addition(int sum) {

        int result = 0;
        int a = 0;
        if (a <= sum){
            for (a = 1; a <= sum; a++) {
                result = result + a;
            }
        }
        return result;
    }

}
