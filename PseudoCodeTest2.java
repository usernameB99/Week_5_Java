package zOther;

public class PseudoCodeTest2 {
    public static void main(String[] args) {


        int a [] = {2,4,6,8,7,3};

        int j = a.length-1;

        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }



      /*  for (int i = 0; i < a.length; i++) {
            for (int j = a.length; j <a.length ; j--) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = a[temp];
                System.out.print(a[i]);
            }

        }

        for (int i = 0; i < a.length/2; i++) {
            int j = a.length;
            int temp = a[i];
            a[i] = a[j];
            a[j] = a[temp];

        }

*/


    }
}
