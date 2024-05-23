package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        //BE ABLE TO DECLARE AND INSTANTIATE A MAP  Map<Key, VALUE>
        Map<String, Integer> homes = new HashMap<>();
        Map<String, String> stringMap = new HashMap<>();
        Map<Integer, String> numsAsString = new HashMap<>();

        //BE ABLE TO PUT THINGS IN A MAP
        homes.put("43012", 17);
        homes.put("43019", 4);
        homes.put("54321", 17);

        //BE ABLE TO GET THINGS OUT OF A MAP
        int homesFOrSaleIn43012 = homes.get("43012");
        System.out.println(homesFOrSaleIn43012);

        System.out.println(homes);

        //WATCH OUT FOR NULL VALUES WHEN NOT FOUND
        Integer homesForSaleIn43888 = homes.get("43088");


        if (homesForSaleIn43888 != null) {
            System.out.println(homesForSaleIn43888);
        }
        else {
            System.out.println("Home not found");
        }

        //SEE IF A MAP CONTAINS A KEY
        if (homes.containsKey("43019")) {
            System.out.println("We found 43019");
        }

        //CHECK IF A MAP IS EMPTY OR NOT
        if (homes.isEmpty()) {
            //we have an empty map
        }
        else {
            //we have values
        }

        //THIS LINE HAS NOTHING TO DO WITH MAPS...
        Set<String> mySet = new HashSet<>();   // create a random set object (not used below)

        //BE ABLE TO LOOP THROUGH A MAP USING A SET
        Set<String> keys = homes.keySet();    //returns a set of keys

        for (String key : keys) {

            System.out.println("Key is: " + key + " has a value of: " + homes.get(key));
        }

        for (Map.Entry<String, Integer>  entry : homes.entrySet()) {
            System.out.println("Key is: " + entry.getKey() + " has a value of: " + entry.getValue());
        }












    }



}
