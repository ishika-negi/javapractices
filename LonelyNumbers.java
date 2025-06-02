import java.util.*;

public class LonelyNumbers {
    public static ArrayList<Integer> findlonely(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.size();

        if (n == 0) return result; 

        Collections.sort(nums); 

        for (int i = 0; i < n; i++) {
            if (i != 0 && (nums.get(i - 1) == nums.get(i) - 1 || nums.get(i - 1) == nums.get(i))) {
                continue;
            }
            if (i != n - 1 && (nums.get(i + 1) == nums.get(i) + 1 || nums.get(i + 1) == nums.get(i))) {
                continue;
            }
            result.add(nums.get(i));
        }

        return result; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(input.nextInt());
        }

        input.close(); 
        ArrayList<Integer> ans = findlonely(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}



