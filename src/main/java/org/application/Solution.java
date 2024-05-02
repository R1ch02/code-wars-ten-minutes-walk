package org.application;

// You live in the city of Cartesia where all roads are laid out in a perfect grid.
// You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk.
// The city provides its citizens with a Walk Generating App on their phones
// -- everytime you press the button it sends you an array of one-letter strings representing directions to walk
// (eg. ['n', 's', 'w', 'e']).
 You always walk only a single block for each letter (direction)
 and you know it takes you one minute to traverse one city block, so create a function that will return true
 if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will,
 of course, return you to your starting point. Return false otherwise.

import org.w3c.dom.ls.LSOutput;

public class Solution {

    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        int[] cords = {0,0};
        for (char c : walk) {
            switch (c) {
                case 'n': cords[1]++; break;
                case 's': cords[1]--; break;
                case 'w': cords[0]--; break;
                case 'e': cords[0]++; break;
                default: return false;
            }
        }

        return walk.length == 10 && cords[0] == 0 && cords[1] == 0;

    }
    public static void main(String[] args) {
        boolean b = isValid(new char[]{'n','n','n','n','n','s','s','s','s','s'});
        System.out.println(b);
    }
}