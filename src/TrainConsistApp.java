package src;

import java.util.*;

class Bogie {
    String type, cargo;
    Bogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        List<Bogie> list = Arrays.asList(
                new Bogie("Cylindrical", "Petroleum"),
                new Bogie("Open", "Coal"),
                new Bogie("Box", "Grain")
        );

        boolean safe = list.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        System.out.println(safe ? "Train is Safe" : "Train is Unsafe");
    }
}