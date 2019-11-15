package net.protoprint;

public class GiveMeADiamond {

    public static String print(int n) {
        String[] str = new String[n];
        int count = 1;
        String temp = "";
        String asterisk = "*";

        if (n % 2 != 0 || n < 0) { //проверяем n на нечетность и отрицательность. Если n - положительное и нечетное то идем дальше
            int k = (int) Math.ceil(((double) n) / 2);                 //Находим половину от числа, округляем в большую сторону.

            //for (int i = 0; i < k; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < n; j++) {


                str[j] = stringBuilder.append(asterisk).toString();
                count += 2;
                System.out.println(str[j]);
                }

            //}


//            for (int i = n; i >= 1; i = i - 2) {                    // идем с шагом 2
//                StringBuilder stringBuilder = new StringBuilder();
//                for (int j = 0; j < i; j++) {                       //
//                    stringBuilder = stringBuilder.append(asterisk);
//                }
//
//                System.out.println(stringBuilder);
//
//            }

            return "нечетное число";
        } else
            return null;

    }

}
