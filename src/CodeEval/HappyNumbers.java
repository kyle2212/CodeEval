package CodeEval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HappyNumbers {
  public static void main(String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader buffer = new BufferedReader(new FileReader(file));
    String line;
    while ((line = buffer.readLine()) != null) {
      line = line.trim();
      boolean happyNumber = false;
      int sum = 0;
      int count = 0;
      char[] number = line.toCharArray();
      while (count < 100) {
        for (char n : number) {
          sum += Math.pow(Integer.parseInt(String.valueOf(n)), 2);
        }
        if (sum == 1) {
          System.out.println(1);
          happyNumber = true;
          break;
        } else {
          number = String.valueOf(sum).toCharArray();
          sum = 0;
          count++;
        }
      }
      if (!happyNumber) {
        System.out.println(0);
      }
    }
  }
}
