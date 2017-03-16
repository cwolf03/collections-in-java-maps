package com.theironyard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * For this exercise you will be making a class with one static method that is a
 * variation on the classic FizzBuzz exercises. Follow the instructions below.
 */
public class FizzBuzz {

    /**
     * Create a static method named asMap(). This method implements a variation
     * on the classic FizzBuzz exercise. The method should accept an int
     * argument named `max`. The method will iterate from 1 to max (inclusive)
     * and create a HashMap that is keyed by Strings and contains values that
     * are Arrays of Integers.
     *
     * The HashMap returned will have three keys:
     *
     * fizz - This is an Array of integers in the range 1 to `max` inclusive
     *      that are divisible by 3 (but not 5). EG: 3, 6, 9, etc.
     *
     * buzz - This is an Array of integers in the range 1 to `max` inclusive
     *      that are divisible by 5 (but not 3). EG: 5, 10, 20, etc.
     *
     * fizzbuzz - This is an Array of integers in the range 1 to `max` inclusive
     *      that are divisible by both 3 and 5. EG: 15, 30, 45, etc.
     *
     * All other numbers are disregarded.
     *
     * So, if the `max` argument provided is 45, this method will return a
     * HashMap that looks like this:
     *
     * {
     *  fizz -> [3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42],
     *  buzz -> [5, 10, 20, 25, 35, 40],
     *  fizzbuzz -> [15, 30, 45]
     * }
     *
     * @param max The maximum number to iterate to when generating the HashMap
     * @return A HashMap of Strings mapped to an Array of Integers containing keys and values for fizz, buzz, and fizzbuzz
     */
        public static HashMap<String, ArrayList<Integer>> asMap(int max) {
            HashMap<String, ArrayList<Integer>> newFizz = new HashMap<>();

            ArrayList<Integer> fizz = new ArrayList<>();
            ArrayList<Integer> buzz = new ArrayList<>();
            ArrayList<Integer> fizzBuzz = new ArrayList<>();


            for (int x = 1; x <= max; x++) {
                if (x % 3 == 0 && x % 5 == 0) {
                    fizzBuzz.add(x);
                }else if (x % 3 == 0) {
                    fizz.add(x);
                }else if (x % 5 == 0) {
                    buzz.add(x);
                }

                newFizz.put("fizz", fizz);
                newFizz.put("buzz", buzz);
                newFizz.put("fizzbuzz", fizzBuzz);

            }
            return newFizz;
        }

}
