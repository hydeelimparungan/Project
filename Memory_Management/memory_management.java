package Memory_Management;

public class memory_management {

    
    static class Person {
        String name;
        int age;

        
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display object details
        public void display() {
            System.out.println("Person{name='" + name + "', age=" + age + "}");
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Limparungan", 21);
        Person person2 = new Person("Herondio", 30);

        person1.display();
        person2.display();
        
        person1 = null;  
        person2 = null;  

        System.gc();  

        
        System.out.println("End of the program. Objects are eligible for garbage collection.");
    }

    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("An object is being garbage collected!");
        super.finalize();
    }
}
