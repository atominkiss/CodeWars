package net.protoprint.RegularExpressions;

public class ConvertStringToCamelCase {

    public static String toCamelCase(String s) {

        String[] d = s.split("(-|_)");
        String temp = d[0];

        for (int i = 1; i < d.length; i++) {
            d[i] = String.valueOf(new StringBuilder(d[i].substring(0, 1).toUpperCase()).append(d[i].substring(1)));
            temp = String.valueOf(new StringBuilder(temp).append(d[i]));
        }

        System.out.println(temp);

        return temp;
    }
}

/*
solution frome codewars

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.StringBuilder;

class Solution{

  static String toCamelCase(String s){
    Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
    StringBuffer sb = new StringBuffer();
    while (m.find()) {
        m.appendReplacement(sb, m.group(1).toUpperCase());
    }
    return m.appendTail(sb).toString();
  }
}

 */