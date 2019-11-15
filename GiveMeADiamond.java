package net.protoprint;

public class GiveMeADiamond {

    public static String print(int n) {
        String[] str = new String[n];
        int count = 1;
        String temp = "";
        String asterisk = "*";
        String diamond = "";

        if (n % 2 != 0 && n > 0) { //проверяем n на нечетность и отрицательность. Если n - положительное и нечетное то идем дальше
            int k = (int) Math.ceil(((double) n) / 2);                 //Находим половину от числа, округляем в большую сторону.
            for (int i = 0; i < n; i++) {                               //Количество выводимых строк всегда равно введеному значению n
                StringBuilder stringBuilder = new StringBuilder();
                //количество символов в строке должно определяться этим значение и всегда долнжо быть нечетным
                for (int j = 0; j < count; j++) {
                    str[i] = stringBuilder.append(asterisk).toString();
                }
                for (int m = 0; m < (n - str[i].length()) / 2; m++) { //заполняем пробелами с начала строки
                    temp = temp + " ";
                }
                str[i] = temp + str[i] + "\n"; //кладем итоговую строку
                if (count < n && i < k) count += 2;
                else count -= 2;
                temp = "";
                diamond = diamond + str[i];
            }
            return diamond;
        } else
            return null;

    }

}
