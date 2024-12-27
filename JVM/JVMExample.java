public class JVMExample {

    public static void main(String[] args) {
        System.out.println("Java program is running on JVM.");

        int result = multiply(5, 10);
        System.out.println("Multiplication result: " + result);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
