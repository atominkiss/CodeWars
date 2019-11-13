package net.protoprint;

// wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}

public class MexicanWave {

    public static String[] wave(String str) {

        String[] wave = new String[str.length()]; // обявили массив стрингов длиной в количество букв входного слова

        for (int i = 0; i < str.length(); i++) {
            wave[i] = str;
            String temp = wave[i].substring(i, i + 1).toUpperCase();   // выделяем букву и делаем ее заглавной
            String tempstart = wave[i].substring(0, i);             // вычленяем начало слова до заглавной буквы
            String tempend = wave[i].substring(i + 1, str.length());  // вычленяем остаток слова после заглавной буквы
            wave[i] = tempstart + temp + tempend;                       // а теперь контактинируем все вместе и кладем в массив
            System.out.println(wave[i]);
        }
        //System.out.println(wave.toString());
        //System.out.println(wave.toString());
        return new String[]{};
    }
}
