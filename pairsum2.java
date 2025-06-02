import java.util.*;

public class pairsum2 {
    public static String pairsum(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        
        // Finding the pivot point
        for (int i = 0; i < list.size() - 1; i++) {  // Fixed the bounds here
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // Setting the pointers
        int lp = (bp + 1) % n;  // Left pointer, starts after the pivot
        int rp = bp;            // Right pointer, starts at the pivot
        
        // Searching for the pair with the target sum
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            
            if (sum == target) {
                return "Pair found at indices (" + lp + ", " + rp + ") with values (" + list.get(lp) + ", " + list.get(rp) + ")";
            }
            
            // Move the pointers
            if (sum < target) {
                lp = (lp + 1) % n;  // Move left pointer forward
            } else {
                rp = (n + rp - 1) % n;  // Move right pointer backward
            }
        }
        
        return "No pair found";
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        
        System.out.println(pairsum(list, target));  // Output the indices and values of the pair
    }
}
