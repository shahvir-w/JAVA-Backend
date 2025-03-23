// More OOP
import java.util.ArrayList;

public class OOP2 {
    public static void main(String[] args) {
        /* ArrayLists */ // dynamic arrays
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        System.out.println(fruits);

        //fruits.remove(0);
        System.out.println(fruits);

        fruits.set(0, "orange");
        System.out.println(fruits);
        
        
        /* Getters and Setters */
        /* 
        Truck truck = new Truck();
        truck.setName("Bob");
        System.out.println(truck.getName());
        */
        /* Polymorphism */
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new Motorcycle();
    }
    


    /* Getters and Setters */
    public static class Truck {
        private String name;
    
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    

    /* Polymorphism */
    public static class Vehicle {
        void start() {
            System.out.println("Vehicle started");
        }
    }

    public static class Car extends Vehicle { 
        @Override
        void start() {
            System.out.println("Car started");
        }
    }  

    public static class Motorcycle extends Vehicle {
        @Override
        void start() {
            System.out.println("Motorcycle started");
        }
    }
   
}




