import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter an integer: ");
    int i = in.nextInt();

    System.out.println(String.format("The integer multiplied by itself is %d", i*i));
  }
}
