package Woche5;

import java.util.HashMap;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {


        Set<Integer> A = new java.util.HashSet<>();
        A.add(1);
        A.add(3);
        A.add(5);

        Set<Integer> B = new java.util.HashSet<>();
        B.add(3);
        B.add(5);
        B.add(7);

        Set<Integer> C = new java.util.HashSet<>();
        C.add(5);
        C.add(7);
        C.add(9);


        System.out.println("Vereinigungs Menge A B C: " + getUnion(A, getUnion(B,C)));

        System.out.println("Schnitt Menge A B: " + getIntersection(A,B));

        System.out.println("Schnitt Menge B C: " + getIntersection(B,C));

        System.out.println("Schnitt Menge A B C: " + getIntersection(A, getIntersection(B, C)));

        System.out.println("Differenz Menge A B: " + getDifference(A,B));

        System.out.println("Differenz Menge B C: " + getDifference(B,C));

        System.out.println("Differenz Menge A B C: " + getDifference(A, getDifference(B, C)));

    }

    private static java.util.HashSet<Integer> getIntersection(Set<Integer> a, Set<Integer> b) {
        java.util.HashSet<Integer> result = new java.util.HashSet<>();
        result.addAll(a);
        result.retainAll(b);
        return result;
    }


    private static java.util.HashSet<Integer> getUnion(Set<Integer> a, Set<Integer> b) {
        java.util.HashSet<Integer> unified = new java.util.HashSet<>();
        unified.addAll(a);
        unified.addAll(b);

        return unified;
    }

    public static java.util.HashSet<Integer> getDifference(Set<Integer> a, Set<Integer> b){
        java.util.HashSet<Integer> result = new java.util.HashSet<>();
        result.addAll(a);
        result.removeAll(b);
        return result;
    }



    }


