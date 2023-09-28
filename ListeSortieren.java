package Woche5;

import java.util.ArrayList;
import java.util.Comparator;

public class ListeSortieren {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(7);
        numbers.add(6);
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        numbers.add(8);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 1; j < numbers.size() - i; j++) {
                if (numbers.get(j - 1) > numbers.get(j)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j - 1));
                    numbers.set(j - 1, temp);
                }
            }
        }


        System.out.println(numbers);

    }
}
