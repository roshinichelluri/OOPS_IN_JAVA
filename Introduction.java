// Core OOP Concepts
// This program demonstrates Object-Oriented Programming principles in Java.

class Car { // Definition of a class as a blueprint for Car objects.
    
    // Properties of Object: state
    String brand; // Instance variable for car brand
    String model; // Instance variable for car model
    int year; // Instance variable for car's manufacture year

    // Default Constructor (Java provides a default if none is defined)
    public Car() {
        this.brand = "Unknown"; // Setting default values
        this.model = "Unknown";
        this.year = 2000;
    }

    // Custom Constructor (Creating Constructors)
    public Car(String brand, String model, int year) {
        this.brand = brand; // Using `this` to reference the current object
        this.model = model;
        this.year = year;
    }

    // Method to access instance variables (Accessing Instance Variables)
    public void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacture Year: " + year);
    }

    // Method to manipulate object properties (Manipulating Objects)
    public void setYear(int year) {
        this.year = year; // Modifying the year property
    }

    // Example of Constructor Overloading (Defining multiple constructors with different parameters)
    public Car(String brand, String model) {
        this(brand, model, 2000); // Calling another constructor (Constructor Chaining)
    }
    
    // final Keyword: Preventing modification by marking the variable as final
    public final String getBrand() {
        return brand; // Brand cannot be altered once set
    }
}

// Main class to demonstrate Object Interaction and Memory
public class Introduction {
    
    public static void main(String[] args) {
        // Creating Objects (Syntax for instantiating objects)
        Car myCar = new Car("Toyota", "Corolla", 2022); // Dynamic Memory Allocation

        // Accessing instance variables using methods 
        myCar.displayInfo(); // Calls the method to display car information

        // Manipulating the car's year
        myCar.setYear(2023); // Modifying an object's property
        System.out.println("Updated Year: " + myCar.getBrand() + " - " + myCar.year); // Directly accessing the object's year (for illustration)

        // Primitive Data Types vs Objects demonstration
        int speed = 60; // Primitive data type
        Integer wrappedSpeed = Integer.valueOf(speed); // Wrapper Class

        System.out.println("Speed as primitive: " + speed);
        System.out.println("Wrapped Speed: " + wrappedSpeed);
        
        // (Garbage Collection is handled automatically by Java and doesn't require explicit code here)
    }
}