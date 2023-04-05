package javahomwworkwk9;

import java.util.HashMap;
import java.util.Map;

public class P9_HashMap {

        public static void main(String[] args) {
            //Create HashMap object call people that will store String keys and Integer value
            Map<String, Integer> map = new HashMap<>();
            map.put("John", 1);
            map.put("Petter", 2);
            map.put("William", 3);
            map.put("Pole", 4);
            map.put("Edward", 5);
            //And use for each loop to iterate the value from Map.
            for (Map.Entry<String, Integer> people : map.entrySet()) {
                System.out.println(people.getValue() + " " + people.getKey());
            }

        }
    }

