package net.protoprint.RegularExpressions;

public class StringSubpatternRecognitionOne {

    public static boolean hasSubpattern(String str) {

        String ptrn;

        for (int i = 1; i < str.length(); i++) {
            ptrn = "[" + str.substring(0, i) + "]";

            if (str.length() % ptrn.length() == 0) {

                //String ptrn2 = "\\w";
                int f = Math.abs(str.length() / ptrn.length());
                String ptrn2 = ptrn + "{" + f + "}";
                System.out.println(ptrn.matches(ptrn2));
                System.out.println("Паттерн " + ptrn + " укладывается " + f + " раз в заданное слово! " + i);
            }

        }

        return false;
    }

}
