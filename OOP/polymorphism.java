
class Animals {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animals {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animals {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        
        Animals myDog = new Dog();
        Animals myCat = new Cat();

       
        myDog.makeSound(); 
        myCat.makeSound(); 

    
    }
}
