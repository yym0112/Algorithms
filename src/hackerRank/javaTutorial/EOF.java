package hackerRank.javaTutorial;

        import java.util.Scanner;

public class EOF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    while (sc.hasNext()){
      System.out.println(i+ " " + sc.nextLine());
      i++;
    }
  }
}


