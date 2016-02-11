package CodeEval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetIntersection {
  public static void main(String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      List<String> lists = Arrays.asList(line.split("\\s*;\\s*"));
      List<String> firstList = Arrays.asList(lists.get(0).split("\\s*,\\s*"));
      List<String> secondList = Arrays.asList(lists.get(1).split("\\s*,\\s*"));
      List<String> finalList = new ArrayList<>();

      for (String i : firstList) {
        if (secondList.contains(i)) {
          finalList.add(i);
        }
      }
      String str = finalList.toString();
      str = str.substring(1, str.length() - 1);
      str = str.replaceAll(" ", "");
      System.out.println(str);
    }
  }
}