package net.protoprint.RegularExpressions;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        String input = "", output = "";

        for (int number : numbers)
            input = input + number;

        output = "(" + input.substring(0, 3) + ") " + input.substring(3, 6) + "-" + input.substring(6);

        return output;
    }
}
/*
I know. It's not exactly a regular expressions. Just formating a string.
and the best practice in codewars is:
return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
 */