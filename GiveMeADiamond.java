package net.protoprint;

public class GiveMeADiamond {

    public static String print(int n) {

        if (n % 2 != 0 || n <= 0) {

            for (int i = 1; i <= n; i++) {

                if (i <= Math.ceil(n / 2)) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }

            return "нечетное число";
        } else {
            //System.out.println("Введено четное число");
            return null;
        }

    }

}
