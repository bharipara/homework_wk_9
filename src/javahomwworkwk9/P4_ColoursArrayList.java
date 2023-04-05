package javahomwworkwk9;

import java.util.ArrayList;
import java.util.List;

public class P4_ColoursArrayList {

        public static void main(String[] args) {


            //Create a list and add some colour to the list
            List<String> colourlist = new ArrayList<String>();
            colourlist.add("Red");
            colourlist.add("Green");
            colourlist.add("Black");
            colourlist.add("Orange");
            colourlist.add("Blue");
            //Print the list
            for(String element : colourlist){
                System.out.println(element);
            }

        }

    }

