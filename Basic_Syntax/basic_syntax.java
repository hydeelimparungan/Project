import java.util.Scanner; 

public class basic_syntax {

   
    public static void main(String[] args) {
       
        System.out.println("Welcome to Java Programming!");

        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

       
        System.out.println("Hello, " + name + "! You are " + age + " years old.");


        scanner.close();
    }
}
