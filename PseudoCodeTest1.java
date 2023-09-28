package zOther;

public class PseudoCodeTest1 {
    public static void main(String[] args) {


        int a = 7;
        int b = 5;
        int c = 0;

        do {
            if (a%2 == 1){
                c = b+c;
                b = b*2;
                a = a/2;
               // if (a == 1) {
                //    c = b+c;
               // }
            }
            else if (a%2 == 0){
                b = b*2;
                a = a/2;

            }
            System.out.println(a + " " + b + " "  + c);
        } while (a != 0);

        //c = c/2;

        System.out.println(c);



    }
}
