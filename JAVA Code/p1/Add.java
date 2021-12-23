package p1;
import java.util.*;
public class Add {
    int s;
    public void sum() {
        System.out.print("Enter the first number: ");
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        System.out.print("Enter the second number: ");
        Scanner scan1=new Scanner(System.in);
        int y=scan1.nextInt();
        s=x+y;
        System.out.println("Sum of two numbers = "+s);
    }
}
// CODE BY: BHAVYA SEHGAL
