package javahomwworkwk9;

import java.util.HashSet;

public class P8_HashSet {

        public static void main(String[] args) {
            //Create a HashSet object called number
            HashSet<Integer> number = new HashSet<Integer>();
            //Add value to the set
            number.add(4);
            number.add(7);
            number.add(8);
            //Show which numbers between 1 to 10 are in the set
            for (int i = 1; i<=10 ;i++){
                if (number.contains(i)){
                    System.out.println(i  +  "was found in the set.");
                }else{
                    System.out.println(i +  "was not found in the set.");
                }

            }

        }
    }

