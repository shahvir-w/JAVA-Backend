// OOP

public class Main { 
    public static void main(String[] args) {

        /* Interface */
        Truck ferrari = new Truck();
        ferrari.start();
        ferrari.stop();
        ferrari.displayInfo();

        /* abstraction */
        // Shape shape = new Shape(3);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);
        circle.calculateArea();
        rectangle.calculateArea();
        circle.displayInfo();
        rectangle.displayInfo();
        
        /* toString() method override */
        /* 
        Car car5 = new Car("Toyota", "Corolla", 2020, 58000.00);
        System.out.println(car5);
        */
        
        /* Method Overriding */
        /* 
        Animal animal = new Animal();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        animal.eat();
        dog1.eat();
        cat1.eat(); 

        /* Super keyword */
        Person person1 = new Person("John", 20);
        Hero hero1 = new Hero("Batman", 30, "Money");

        /* Inheritance */
        Dog dog = new Dog();
        // dog.bark();
        // dog.eat();
        // System.out.println(dog.isAlive);

        Cat cat = new Cat();
        // cat.meow();
        // cat.eat();
        // System.out.println(cat.isAlive);

        /* static keyword */
        Friend friend1 = new Friend("John");
        Friend friend2 = new Friend("Jane");
        // System.out.println(Friend.numberOfFriends);
        
        /* Basic OOP */
        Car car1 = new Car("Toyota", "Corolla", 2020, 58000.00);
        Car car2 = new Car("Ford", "Mustang", 2021, 75000.00);
        Car car3 = new Car();
        Car car4 = new Car("Honda", "Civic");

        Car[] cars = {car1, car2, car3, car4};
        for (Car car : cars) {
            // car.displayInfo();
        }

    }

}

/* Interface */
interface Thing {
    void displayInfo();
}

interface Vehicle {
    void start();
    void stop();
}   

public class Truck implements Vehicle, Thing {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a truck");
    }
}


/* Abstraction */
public abstract class Shape {
    abstract void calculateArea(); // abstract method

    double area;
    void displayInfo() { // concrete method
        System.out.println("This is a shape");
    }
}

public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of circle: " + Math.PI * radius * radius);
    }
}

public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of rectangle: " + width * height);
    }
}


// Super keyword
public class Hero extends Person {
    String power;

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }
}

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Inheritance
public class Animal {
    boolean isAlive;

    Animal() {
        isAlive = true;
    }

    void eat() {
        System.out.println("This animal is eating");
    }
}

public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("This dog is eating");
    }
}

public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("This cat is eating");
    }
}

// static keyword
public class Friend {
    String name;
    static int numberOfFriends;
    
    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }
    
}

// Basic OOP
public class Car {
    // properties
    String make;
    String model;
    int year;
    double price;
    boolean isRunning;

    // constructor
    Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isRunning = false;
    }
    
    // default constructor  
    Car() {
        this("Jeep", "Wrangler", 2016, 75000.00);
    }

    Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = 2025;
        this.price = 100000.00;
        this.isRunning = false;
    }

    // methods
    void start() {
        isRunning = true;
        System.out.println("Car started");
    }

    void stop() {
        isRunning = false;
        System.out.println("Car stopped");
    }

    @Override
    public String toString() {
        return make + " " + model + " " + year + " " + price;
    }

}
