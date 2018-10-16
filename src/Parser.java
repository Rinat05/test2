import java.util.Scanner;

public class Parser {

  public String[] parser(final String strInput) {

    Scanner s = new Scanner(System.in);

    String text = s.nextLine();
    String space = " ";
    String[] transfer = text.split(space);
    for (String words : transfer) {
      System.out.println(words);
    }
    return transfer;
  }

}
