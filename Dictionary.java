package Woche5;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {

    static HashMap<String, String> dictGerman = new HashMap<>();
    static HashMap<String, String> dictEnglish = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean contAll = true;

        do {

            System.out.println("1. add \n2. search\n3. view\n4. delete\n0. exit");
            System.out.print(">");
            int input = sc.nextInt();

            if (input == 0) {
                System.out.println("Tschüss.");
                contAll = false;
            }

            if (input == 1) {
                System.out.print("Input DE: ");
                String a = sc.next();
                System.out.print("Input EN: ");
                String b = sc.next();

                addWords(a, b);
                System.out.println("...words added to dictionary");
            }

            if (input == 2) {
                System.out.print("search word:");
                String c = sc.next();
                searchWords(c);
            }

            if (input == 3) {
                System.out.println("German " + dictGerman);
                System.out.println("Englisch " + dictEnglish);
            }

            if (input == 4) {
                System.out.print("remove word:");
                String d = sc.next();
                removeWords(d);
            }

        } while (contAll);

    }

    public static void addWords(String a, String b) {

        dictGerman.put(a, b);
        dictEnglish.put(b, a);

    }

    public static void searchWords(String c) {

        if (dictGerman.containsKey(c)) {
            System.out.println(dictGerman.get(c));
        } else {
            System.out.println(dictEnglish.get(c));
        }

    }

    public static void removeWords (String d) {

        if (dictGerman.containsKey(d)) {
            dictEnglish.remove(dictGerman.remove(d));
            //dictGerman.remove(d);
        } else {
            dictGerman.remove(dictEnglish.remove(d));
            //dictEnglish.remove(d);
        }
    }




}
