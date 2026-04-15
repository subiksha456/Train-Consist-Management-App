public class UseCase20 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: Division by zero");
        } finally {
            System.out.println("Execution Completed Safely");
        }
    }
}
