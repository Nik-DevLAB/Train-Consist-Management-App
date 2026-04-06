package src;

public class TrainConsistApp {
    public static void main(String[] args) {

        String[] ids = {"BG101","BG205","BG309","BG412","BG550"};
        String key = "BG309";

        boolean found = false;

        for (String id : ids) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Bogie Found" : "Bogie Not Found");
    }
}