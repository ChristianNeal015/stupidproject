package ShoesGoingAround;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int shoesNum = 99;
        String word = "shoes";

        while (shoesNum > 0) {

            if (shoesNum == 1) {


        }
                System.out.println(shoesNum + " " + word + " of shoes on the wall");
                System.out.println(shoesNum + " " + word + " of shoes.");
                System.out.println("Take them down.");
                System.out.println("Pass them around.");
                shoesNum = shoesNum - 1;

                if (shoesNum > 0) {
                    System.out.println(shoesNum + " " + word + " of shoes on the wall");
                } else {
                    System.out.println("No more shoes on the wall");
                } // end else
            } // end while loop
        } // end main method
    } // end class