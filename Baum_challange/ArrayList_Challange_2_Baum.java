package Woche5.Baum_challange;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList_Challange_2_Baum {
    public static void main(String[] args) {


        ArrayList<Tree> baumis = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            Tree t = new Tree(i, r.nextInt(0,100000));  //<- konstruktor

            //t.id= i;
            t.leaves = r.nextInt(0,100000);     //<- zuweisung ohne konstruktor
            baumis.add(t);
        }
            int max = 0;
            int min = Integer.MAX_VALUE;
            int idMin = 0;
            int tId = 0;
            int tLeaves = 0;
            int leavesAll = 0;



        for (int i = 0; i < baumis.size(); i++) {
            //tId = baumis.get(i).id;
            tLeaves = baumis.get(i).leaves;
            leavesAll += tLeaves;

            if (tLeaves > max) {
                max = tLeaves;
                tId = baumis.get(i).id;
            }
            else if (tLeaves < min) {
                min = tLeaves;
                idMin = baumis.get(i).id;
            }
            //System.out.println("id " + tId);
            //System.out.println("leaves" + tLeaves);
        }

        for (int i = 0; i < baumis.size(); i++) {
            if (baumis.get(i).leaves == max) {
                System.out.println("der befüllteste Baum mit id " + tId + " hat " + tLeaves + " Blätter!!!!" );
                System.out.println("der nackteste Baum mit id " + idMin + " hat " + min + " Blätter!!!!" );
                System.out.println("alle blätter: " + leavesAll);
            }
        }

    }

}