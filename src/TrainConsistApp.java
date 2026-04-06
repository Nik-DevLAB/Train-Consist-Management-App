package src;

import java.util.*;
import java.util.stream.*;

class Bogie {
    int capacity;
    Bogie(int capacity) {
        this.capacity = capacity;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++)
            list.add(new Bogie((int)(Math.random() * 100)));

        // Loop
        long start1 = System.nanoTime();
        List<Bogie> res1 = new ArrayList<>();
        for (Bogie b : list)
            if (b.capacity > 60)
                res1.add(b);
        long end1 = System.nanoTime();

        // Stream
        long start2 = System.nanoTime();
        List<Bogie> res2 = list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long end2 = System.nanoTime();

        System.out.println("Loop Time: " + (end1 - start1));
        System.out.println("Stream Time: " + (end2 - start2));
    }
}