package net.protoprint;
//You are given an array (which will have a length of at least 3, but could be very large) containing integers.
//        The array is either entirely comprised of odd integers or entirely comprised of even integers except for
//        a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

public class FindTheParityOutlier {

    static int find(int[] integers) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                even++;
            } else if (integers[i] % 2 != 0) {
                odd++;
            }
        }

        if (even > odd) {
            for (int integer : integers) {
                if (integer % 2 != 0) {
                    return integer;
                }
            }
        } else if (even < odd) {
            for (int integer : integers) {
                if (integer % 2 == 0) {
                    return integer;
                }
            }
        }
        return 0;
    }
}

//Solutions from codewars
//public static int find(int[] integers) {
//    // Since we are warned the array may be very large, we should avoid counting values any more than we need to.
//
//    // We only need the first 3 integers to determine whether we are chasing odds or evens.
//    // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
//    // It will be 0 for even numbers and 1 for odd numbers.
//    // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
//    int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
//    int mod = (sum == 0 || sum == 1) ? 1 : 0;
//
//    return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
//            .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
//}