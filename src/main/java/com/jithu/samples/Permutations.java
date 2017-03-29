package com.jithu.samples;

/**
 * Created by Jithu on 29-Mar-17.
 */
public class Permutations {
    public static void main(String[] args) {
        new Permutations().permutations("abc");
    }

    public void permutations(String str) {
        permutation(str, "");
    }

    private void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; str.length() > i; i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }

    }
}