package net.protoprint;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        int count = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            String sbstrng = text.substring(i, i + 1);

            if ((text.indexOf(sbstrng) - text.lastIndexOf(sbstrng)) != 0) {
                text = text.replaceAll(sbstrng, "");
                count++;
                i--;
            }
        }
        return count;
    }
}
/* solution from codewars
public class CountingDuplicates {
  public static int duplicateCount(String text) {
    int ans = 0;
    text = text.toLowerCase();
    while (text.length() > 0) {
      String firstLetter = text.substring(0,1);
      text = text.substring(1);
      if (text.contains(firstLetter)) ans ++;
      text = text.replace(firstLetter, "");
    }
    return ans;
  }
}
 */