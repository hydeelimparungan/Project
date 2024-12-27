package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Person implements Serializable {
    private static final long serialVersionUID = 1L;  
    
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Serialization {

    
    public static void serializeObject(Person person) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(person);  
            System.out.println("Serialization successful: Person object saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person deserializeObject() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person person = (Person) in.readObject();
            System.out.println("Deserialization successful: Person object restored.");
            return person;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
       
        Person person1 = new Person("John Doe", 30);
        
        
        serializeObject(person1);

       
        Person deserializedPerson = deserializeObject();
        
        if (deserializedPerson != null) {
            deserializedPerson.display();
        }
    }
}
