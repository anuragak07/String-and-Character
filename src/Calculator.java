import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public static void  main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a value");
      int a =sc.nextInt();
      int b =sc.nextInt();
      int c =sc.nextInt();
      int add =Add(a,b,c);
      int Subtract = Subtract(a,b,c);
      int multiply = Multiply(a,b,c);
      int Divide = Divide(a,b);
        System.out.println("Addition = "+add);
        System.out.println("Subtraction = "+Subtract);
        System.out.println("Multiplication = "+multiply);
        System.out.println("Divide of first two No.= "+Divide);

    }
    public static int Add(int a,int b,int c){
        int addition =a+b+c;
        return addition;
    }
    public static int Subtract(int a,int b,int c){
        int sub =a-b-c;
        return sub;
    }
    public static int Multiply(int a,int b,int c) {
        int mul = a * b * c;
        return mul;
    }
    public static int Divide(int a,int b) {
        int div = a / b;
        return div;
    }

}
