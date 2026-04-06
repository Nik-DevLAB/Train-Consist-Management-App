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

    // Getters
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

        // Step 1: Create Bogie List (reuse from previous UCs)
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 70));

        // Step 2: Stream → map → reduce
        int totalSeats = bogieList.stream()
                .map(b -> b.getCapacity())     // extract capacity
                .reduce(0, Integer::sum);      // aggregate (sum)

        // Step 3: Display Total
        System.out.println("Total Seating Capacity of Train: " + totalSeats);

        // Step 4: Verify Original List Unchanged
        System.out.println("\nOriginal Bogie List (Unchanged):");
        bogieList.forEach(Bogie::display);
    }
}