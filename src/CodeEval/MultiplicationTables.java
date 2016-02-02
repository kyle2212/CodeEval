package CodeEval;

public class MultiplicationTables {
  public static void main(String[] args) {
    printMultiplicationTable(12, 12);
  }

  private static void printMultiplicationTable(int row, int column) {
    for (int r = 1; r <= row; r++) {
      for (int c = 1; c <= column; c++) {
        int number = r * c;
        String numberString = number;
        System.out.println(number);
      }

    }
  }

}
