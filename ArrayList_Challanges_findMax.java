package Woche5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Challanges_findMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        boolean con = true;

        do {

            System.out.println("please enter values, Q to quit:");
            String input = sc.next();

            if (input.equals("q")){
                con = false;
            }

            else {
                int inputNumber = Integer.parseInt(String.valueOf(input));
                arrayList.add(inputNumber);

                int max = 0;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) > max){
                        max = arrayList.get(i);
                    }
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) == max) {
                        System.out.println(max + " <- largest value");
                    }
                    else {
                        System.out.println(arrayList.get(i));
                    }
                }

            }

        } while (con);

    }
}
