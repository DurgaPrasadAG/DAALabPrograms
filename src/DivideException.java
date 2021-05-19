import java.util.Scanner;

public class DivideException {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
        System.out.print("Please enter first number(numerator) : ");
        int a = s.nextInt();
        System.out.print("Please enter second number(denominator) : ");
        int b = s.nextInt();
        System.out.println("hello");
        try {
            if (b != 0) {
                int res = a / b;
                System.out.println("result = " + res);
            } else {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero Error");
        }
    }
}