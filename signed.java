
import java.util.*;

class InvalidMismatchException extends Exception {
    public InvalidMismatchException(String str) {
        super(str);
    }
}

public class signed {
    static void is32BitSignedInteger(int num) throws InvalidMismatchException {
        if ((num <= 2147483647) && (num >= -2147483648)) {
            System.out.println("Signed");
        } else {
            throw new InvalidMismatchException("Invalid");
        }
    }

    public static void main(String a[]) {
        Scanner ob = new Scanner(System.in);
        try {
            int x = ob.nextInt();
            int y = ob.nextInt();
            is32BitSignedInteger(x);
            is32BitSignedInteger(y);
            int c = x / y;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InvalidMismatchException e) {
            System.out.println(e);
        }
    }

}
