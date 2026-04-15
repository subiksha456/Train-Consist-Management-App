import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseCase17 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = Arrays.asList("Pantry", "Sleeper", "AC Chair");

        Collections.sort(bogies);
        System.out.println("Sorted Names: " + bogies);
    }
}
