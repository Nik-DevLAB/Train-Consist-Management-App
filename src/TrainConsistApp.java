package src;

class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String msg) {
        super(msg);
    }
}

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    void assignCargo(String cargo) {
        try {
            if (type.equals("Rectangular") && cargo.equals("Petroleum"))
                throw new CargoSafetyException("Unsafe cargo assignment");
            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo);
        } catch (CargoSafetyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed");
        }
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");   // safe
        b2.assignCargo("Petroleum");   // unsafe

        System.out.println("Program continues...");
    }
}