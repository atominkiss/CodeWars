package net.protoprint;

public class GiveMeADiamond {

    public static String print(int n) {

        int count = 1;
        String temp = "";
        String asterisk = "*";
        String diamond = "";

        if (n % 2 != 0 && n > 0) { //проверяем n на нечетность и отрицательность. Если n - положительное и нечетное то идем дальше
            String[] str = new String[n];
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

//TODO пересмотреть выше указанный код с учетом разбиения на классы как того требует ООП
/*
solutions from codewars

class Diamond {
  public static String print(int n) {
    if (n % 2 == 0 || n < 0) {
      return null;
    }
    StringBuilder diamond = new StringBuilder();
    for (int i = 1; i <= n; i+=2) {
      appendLine(diamond, i, n);
    }
    for (int i = n-2; i > 0; i-=2) {
      appendLine(diamond, i, n);
    }
    return diamond.toString();
  }

  private static void appendLine(StringBuilder diamond, int size, int totalSize) {
    int spaces = (totalSize-size)/2;
    for (int j = 0; j < spaces; j++) {
      diamond.append(" ");
    }
    for (int j = 0; j < size; j++) {
      diamond.append("*");
    }
    diamond.append("\n");
  }
}

 */
