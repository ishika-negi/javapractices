import java.util.*;
public class reverseastack {
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        s.push(top);
        
        
    }
    
}
