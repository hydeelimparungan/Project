public class datatypeandvariables {

    int instanceVariable = 10;
    static int staticVariable = 20;

    public static void main(String[] args) {
        byte byteVar = 100;
        short shortVar = 1000;
        int intVar = 10000;
        long longVar = 100000L;
        float floatVar = 3.14f;
        double doubleVar = 3.141592;
        boolean booleanVar = true;
        char charVar = 'A';

        String stringVar = "Hello, Java!";
        int[] arrayVar = {1, 2, 3, 4};

        System.out.println("Primitive Data Types:");
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("booleanVar: " + booleanVar);
        System.out.println("charVar: " + charVar);

        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("stringVar: " + stringVar);
        System.out.println("arrayVar: ");
        for (int num : arrayVar) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        datatypeandvariables obj = new datatypeandvariables();
        System.out.println("Instance Variable: " + obj.instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }
}
