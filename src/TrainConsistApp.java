package src;

import java.util.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // Display method
    public void display() {
        System.out.println("Bogie Type: " + name + " | Capacity: " + capacity);
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        // Step 1: Create List of Bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add Passenger Bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Step 3: Sort using Comparator (by capacity)
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Step 4: Display Sorted Bogies
        System.out.println("Bogies Sorted by Capacity (Ascending):");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Optional: Descending Order
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        System.out.println("\nBogies Sorted by Capacity (Descending):");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}