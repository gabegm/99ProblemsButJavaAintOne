/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */

package Arrays;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char _s[] = s.toCharArray();
        Arrays.sort(_s);

        char _t[] = t.toCharArray();
        Arrays.sort(_t);

        return new String(_s).equals(new String(_t));
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();

        System.out.println(va.isAnagram("anagram", "nagaram"));

        System.out.println(va.isAnagram("rat", "car"));
    }
}
