package org.example;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        //initialize a hashset
        HashSet<Integer> set = new HashSet<>();
        //iterate through the given nums int array
        for (int num : nums) {
            //check if the hash set already has the digit
            //if not then add it to the hash set
            //if yes then return true
            if (!set.contains(num)) {
                set.add(num);
            } else {
                return true;
            }
        }
        //return false if the hash set does not contain duplicate
        return false;
    }
}
