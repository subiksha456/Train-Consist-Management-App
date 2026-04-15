import java.util.Arrays;
import java.util.List;

public class UseCase18 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = Arrays.asList("Sleeper", "AC Chair", "First Class");

        String search = "AC Chair";
        boolean found = false;

        for (String b : bogies) {
            if (b.equals(search)) {
                found = true;
                break;
            }
        }

        System.out.println("Search Result: " + (found ? "Found" : "Not Found"));
    }
}
