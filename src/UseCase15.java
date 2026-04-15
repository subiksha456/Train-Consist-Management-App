import java.util.HashMap;
import java.util.Map;

public class UseCase15 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Map<String, String> cargo = new HashMap<>();
        cargo.put("BG1", "Coal");
        cargo.put("BG2", "Chemicals");

        if (cargo.get("BG2").equals("Chemicals"))
            System.out.println("Safety Check Required for BG2");

        System.out.println("Cargo Assigned: " + cargo);
    }
}
