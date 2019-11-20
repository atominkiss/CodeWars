package net.protoprint.RegularExpressions;

public class StringSubpatternRecognitionOne {

    public static boolean hasSubpattern(String str) {

        String ptrn;
        Boolean result;

        for (int i = 1; i < str.length(); i++) {
            ptrn = str.substring(0, i);

            if (str.length() % ptrn.length() == 0) {            //паттерн может укладываться только целое число раз.

                int f = Math.abs(str.length() / ptrn.length()); // сколько вхождений паттерна в слове
                result = str.matches(new StringBuilder().append("(").append(ptrn).append("){").append(f).append("}").toString());  // regexp имеет вид: (ab){f}
//                System.out.print("Паттерн " + ptrn + " укладывается " + f + " раз в заданное слово! " );
//                System.out.println(result);
                if (result) return true;
            }

        }

        return false;
    }

}


/*
решение с codewars

public class Kata {

    public static boolean hasSubpattern(String str) {
        return (str + str).indexOf(str, 1) != str.length(); // Черная магия какая-то!!!!
    }

}


 */