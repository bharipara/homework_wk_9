package javahomwworkwk9;

import java.util.ArrayList;

public class P7_TestIfArrayListIsEmptyOrNot {

        public static void main(String[] args) {
            // Declare ArrayList
            ArrayList<String> list = new ArrayList<String>();
            list.add("Red");
            list.add("Green");
            list.add("Black");
            list.add("White");
            //printing an arraylist
            System.out.println("Original array List :" + list);
            System.out.println("Checking the above array list is empty or not! :" + list.isEmpty());
            //remove all list ang checking is empty or not
            list.removeAll(list);
            System.out.println("Array list after remove all elements " + list);
            System.out.println("Checking the above array list is empty or not! : " +list.isEmpty());



        }
    }

