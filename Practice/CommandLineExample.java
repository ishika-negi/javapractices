public class CommandLineExample {
    public static void main(String[] args) {
        // Check if arguments are passed
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            // Print the arguments passed
            System.out.println("Command-line arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
