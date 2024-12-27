public class conditionals {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if (x > y) {
            System.out.println("x is greater than y");
        } else {
            System.out.println("x is not greater than y");
        }

        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age < 18) {
            System.out.println("You are a minor.");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        int max = (x > y) ? x : y;
        System.out.println("The larger number is: " + max);
    }
}
