import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCase16 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = new ArrayList<>();
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        Collections.sort(bogies);
        System.out.println("Sorted Passenger Bogies: " + bogies);
    }
}
