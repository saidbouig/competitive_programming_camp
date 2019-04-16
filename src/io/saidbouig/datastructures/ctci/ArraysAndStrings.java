package io.saidbouig.datastructures.ctci;

import java.util.HashSet;
import java.util.Set;

public class ArraysAndStrings {
    public static void main(String[] args) {
        System.out.println(isUnique("abc"));
        System.out.println(isUnique("aabcac"));

    }

    private static boolean isUnique(String word) {
        Set<Character> characters = new HashSet<>();
        char[] c = word.toCharArray();
        for (int i = 0; i < c.length; i++) {
            characters.add(new Character(c[i]));
            if (characters.size() != word.substring(0, i + 1).toCharArray().length)
                return false;
        }
        return true;

    }
}
