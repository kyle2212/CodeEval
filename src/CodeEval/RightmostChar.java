package CodeEval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class RightmostChar {
  public static void main(String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      List<String> lists = Arrays.asList(line.split("\\s*,\\s*"));
      String word = lists.get(0);
      String character = lists.get(1);

      char[] wordArray = word.toCharArray();
      char c = character.charAt(0);

      boolean isMatched = false;
      for (int i = 0; i < wordArray.length; i++) {
        if (wordArray[i] == c) {
          isMatched = true;
          System.out.println(i);
          break;
        }
      }
      if (!isMatched) {
        System.out.println(-1);
      }
    }
  }
}
