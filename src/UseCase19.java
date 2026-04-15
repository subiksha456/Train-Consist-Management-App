import java.util.Arrays;

public class UseCase19 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String[] bogies = {"AC Chair", "First Class", "Sleeper"};
        Arrays.sort(bogies);

        String key = "Sleeper";
        int left = 0, right = bogies.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            int res = key.compareTo(bogies[mid]);

            if (res == 0) {
                found = true;
                break;
            } else if (res > 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        System.out.println("Binary Search Result: " + (found ? "Found" : "Not Found"));
    }
}
