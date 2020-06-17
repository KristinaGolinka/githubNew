package Home;

public class Methods extends MyException {
    public Methods(Throwable cause) {
        super(cause);
    }

    public static void divide(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("you can't divide by this number");

        }
        System.out.println(a / b);
    }

    public static void add(int a, int b) {
        if (a == 0 || b != 0) {
            throw new IllegalArgumentException("you can't add by this number");

        }
        System.out.println(a + b);

    }

    public static void minus(int a, int b) throws IllegalAccessException {
        if (a == 0 || b == 0) {
            throw new IllegalAccessException("you can't minus by this number");
        }
        System.out.println(a - b);
    }

    public static void multiply(int a, int b) {
        if (a == 0 || b != 0 || a != 0 || b == 0) {
            throw new ArithmeticException("you can't multiply by this number");
        }
        System.out.println(a + b);
    }
}
