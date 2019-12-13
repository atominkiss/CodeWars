package net.protoprint;
//You are given an array (which will have a length of at least 3, but could be very large) containing integers.
//        The array is either entirely comprised of odd integers or entirely comprised of even integers except for
//        a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

import java.util.Arrays;

public class FindTheParityOutlier {

    static int find(int[] integers) {

        boolean oddOrNot;

        int N = Arrays.stream(integers).sum();
        return N;
    }


}
