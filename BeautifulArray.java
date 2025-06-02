import java.util.*;

public class BeautifulArray {
    public static List<Integer> generateBeautifulArray(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1); // Base case

        while (result.size() < n) {
            List<Integer> temp = new ArrayList<>();

            // Generating odd numbers first (keeping the property)
            for (int num : result) {
                if (num * 2 - 1 <= n) {
                    temp.add(num * 2 - 1);
                }
            }

            // Generating even numbers (keeping the property)
            for (int num : result) {
                if (num * 2 <= n) {
                    temp.add(num * 2);
                }
            }

            result = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        input.close();

        List<Integer> beautifulArray = generateBeautifulArray(n);
        System.out.println("Beautiful Array: " + beautifulArray);
    }
}
