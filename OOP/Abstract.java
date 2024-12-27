
//values sa constructor sa Bonalos class
abstract class Herondio {
    String name;
    int age;

    Herondio(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract void makeSound();
}

// Concrete class extending Bonalos class
class Car extends Herondio {

    Car(String name, int age) {
        super(name, age);
    }

    // diri implementation sa Bonalos class
    @Override
    void makeSound() {
        System.out.println("Broom Broom");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car car = new Car("Civic", 3);
        car.makeSound(); // print diri Woof Woof
    }
}
