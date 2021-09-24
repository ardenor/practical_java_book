public class InputOutputExample {
    public static void main(String[] args) {
        System.out.print("Enter something: ");
        String x = System.console().readLine();
        System.out.println("You entered: " + x);
    }
}
