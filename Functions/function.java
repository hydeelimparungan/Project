import java.util.function.Function;

public class function {

    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("Sum: " + result);

        greet("John");

        int result2 = multiply(4, 5);
        System.out.println("Product: " + result2);

        Function<Integer, Integer> lambdaFunction = x -> x + 1;
        System.out.println("Lambda result: " + lambdaFunction.apply(5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
