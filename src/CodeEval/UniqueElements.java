package CodeEval;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueElements {
  public static void main(String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      String output = "";
      List<String> items = Arrays.asList(line.split("\\s*,\\s*"));
      List<Integer> integers = new ArrayList<>();
      for (String i : items) {
        if (!integers.contains(Integer.parseInt(i))) {
          integers.add(Integer.parseInt(i));
        }
      }
      Collections.sort(integers);
      for (int i : integers) {
        output += i + ",";
      }
      output = output.substring(0, output.length() - 1);
      System.out.println(output);
    }
  }
}