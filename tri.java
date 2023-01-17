
public class tri {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            a[5] = 5 / 1;
        } catch (ArithmeticException e) {
            System.out.println("invalid divisor");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Goes out of array");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Loading....");
    }
}
