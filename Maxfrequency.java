import java.util.*;

public class Maxfrequency{
    public static int mostfrequent(ArrayList<Integer>nums,int key){
        int count[]=new int[1001];
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==key){
                count[nums.get(i+1)]++;
            }
        }
        int maxvalue=0;
        int target=-1;
        for(int i=0;i<count.length;i++){
            if(count[i]>maxvalue){
                target=i;
                maxvalue=count[i];
            }
        }
        return target;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        int n=input.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=input.nextInt();
            arr.add(num);
        }
        input.close();
        int ans=mostfrequent(arr, k);
        System.out.println(ans);
    }

}

