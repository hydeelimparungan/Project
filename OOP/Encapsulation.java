class Dog {
    
    private String breed;
    private String name;
    private int age;

    Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

   
    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Dog dog = new Dog("Starlord", 3, "Chiwawa");
        System.out.println("Dog breed: " + dog.getBreed());
    }
}
