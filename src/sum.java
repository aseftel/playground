import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Ariel
 * Date: 08/09/13
 * Time: 15:19
 * To change this template use File | Settings | File Templates.
 */
public class sum {
    public static void main (String[]args)
    {
    double a=0,b=0;
    System.out.println("Enter first num: ");
    Scanner scanner = new Scanner(System.in);
     a=  scanner.nextDouble();
    System.out.println("Enter second  num: ");
    b= scanner.nextDouble();
     System.out.println( a + b );
    }
}
