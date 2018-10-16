import java.util.Scanner;

public class Main {


  public static void main(String args[]) {

    Parser p = new Parser();    // Parser
    String t = "";
    p.parser(t);



    System.out.println(arrive());     // Task 4



  }
       public static boolean arrive() {                           //Task 4
      Scanner in = new Scanner(System.in);
      System.out.println("Input array size: ");
      int i = in.nextInt();
//        int arr[] = in.nextInt();
      int[] arr = new int[i];
      System.out.println("Enter array: ");
      for (int j = i; j > 0; j--) {
        arr[i-j] = in.nextInt();
      }

      if (arr.length > 0 && arr[0] == arr[arr.length - 1]) {
        return true;
      } else {
        return false;
      }                                              // Task 4

  }
}
