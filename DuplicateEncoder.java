package net.protoprint;

class DuplicateEncoder {
    static String encode(String word) {
        String result = "";
        word = word.toLowerCase();

        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            result = word.indexOf(chars[i]) != word.lastIndexOf(chars[i]) ? result + ")" : result + "(";
        }

        return result;
    }
}
