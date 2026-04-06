package src;

public class TrainConsistApp {
    public static void main(String[] args) {

        String[] ids = {}; // empty dataset
        String key = "BG309";

        if (ids.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        int low = 0, high = ids.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = key.compareTo(ids[mid]);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(found ? "Bogie Found" : "Bogie Not Found");
    }
}