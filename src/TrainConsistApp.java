package src;

class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String msg) {
        super(msg);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0)
            throw new InvalidCapacityException("Capacity must be greater than zero");
        this.type = type;
        this.capacity = capacity;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC", -10); // invalid
            System.out.println("Bogie Created");
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}