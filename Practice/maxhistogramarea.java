
import java.util.*;
public class maxhistogramarea {
  public static void maxarea(){
       int arr[]={2,1,5,6,2,3};
       int nsl[]=new int[arr.length];
       int nsr[]=new int[arr.length];
      Stack<Integer>s=new Stack<>();
    //nsl
    for(int i=0;i<arr.length;i++){
        while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nsl[i]=-1;
        }
        else{
            nsl[i]=s.peek();
        }
        s.push(i);


    }
    s.clear();
    
    //nsr
    for(int j=arr.length-1;j>=0;j--){
        while(!s.isEmpty()&&arr[s.peek()]>=arr[j]){
            s.pop();

        }
        if(s.isEmpty()){
            nsr[j]=-1;


        }
        else{
            nsr[j]=s.peek();
        }
        s.push(j);
    }
    int maxarea=0;
    for(int i=0;i<arr.length-1;i++){
        int height=arr[i];
        int width=nsr[i]-nsl[i]-1;
        int currarea=height*width;
        maxarea=Math.max(maxarea, currarea);

    }
    System.out.println("MAx AREA OF A HISTOGRAM IS : "+maxarea );
  }
   
    public static void main(String[] args) {
        maxarea();
     

    }
    
}
