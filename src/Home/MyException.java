package Home;

public class MyException extends Exception {

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message) {
        super(message);
    }



    public static void divide(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("you can't divide by this number");

        }
        System.out.println(a / b);
    }

    public static void add(int a, int b) {
        if (a == 0 || b != 0) {
            throw new ArithmeticException("you can't add by this number");
        }
        System.out.println(a + b);
    }
    public static void minus(int a, int b) throws MyException, IllegalAccessException {
         {
            throw new MyException ("");
        }

    }

}
