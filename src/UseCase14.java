import java.util.Arrays;
import java.util.List;

public class UseCase14 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = Arrays.asList("Sleeper", "", null, "AC Chair");

        for (String b : bogies) {
            if (b == null || b.isEmpty())
                System.out.println("Invalid Bogie Detected!");
            else
                System.out.println("Valid Bogie: " + b);
        }
    }
}
