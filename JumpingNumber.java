package net.protoprint;

class JumpingNumber {
    static String jumpingNumber(int number) {
        String val = Integer.toString(number);

        for (int i = 0; i < val.length() - 1; i++) {

            Integer val1 = Integer.parseInt(val.substring(i, i + 1));
            Integer val2 = Integer.parseInt(val.substring(i + 1, i + 2));

            if (Math.abs(val1 - val2) != 1) {
                return "Not!!";
            }
        }

        return "Jumping!!";
    }
}
