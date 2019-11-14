package net.protoprint;

// wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {

        int count = 0; //счетчик для ArrayList
        char[] chars = str.toLowerCase().toCharArray(); // переделали стринг в массив символов

        List<String> awave = new ArrayList<String>(); // обявили массив стрингов

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                awave.add(count, str.substring(0, i).toLowerCase() + str.substring(i, i + 1).toUpperCase() + str.substring(i + 1, str.length()).toLowerCase());
                count++;
            }
        }

        //String[] wave = awave.toArray(new String[0]);


        return awave.toArray(new String[0]);
    }
}
/*
solution from codewars:

import java.util.*;

public class MexicanWave {

    public static String[] wave(String str) {
      List<String> list = new ArrayList<>();
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == ' ') continue;
        list.add(str.substring(0,i) + Character.toUpperCase(ch) + str.substring(i+1));
      }
      return list.toArray(new String[0]);
    }

}
*/