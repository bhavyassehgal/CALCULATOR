package p5;                 //importing pre-defined package
import java.util.*;         //importing user-defined package
import p1.Add;
import p2.Sub;
import p3.Mult;
import p4.Div;
public class Calculator {
    public static void main(String args[]) {
        System.out.println("<-----WELCOME TO MY CALCULATOR----->");
        System.out.println("Please enter you choice:");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.print("Enter your choice: ");
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        switch(t) {
            case 1:
                Add a=new Add();
                a.sum();
                break;
            case 2:
                Sub s=new Sub();
                s.diff();
                break;
            case 3:
                Mult m=new Mult();
                m.pro();
                break;
            case 4:
                Div d=new Div();
                d.divd();
                break;
        }
    }
}
// Code by: BHAVYA SEHGAL
