package CodeEval;

public class oddNumbers {
  public static void main(String[] args) {
    final int LOWER_LIMIT = 1;
    final int UPPER_LIMIT = 99;
    for (int i = LOWER_LIMIT; i <= UPPER_LIMIT; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
}