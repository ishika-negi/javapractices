
import java.util.Scanner;

public class binarytodecimal {
public static void BinToDec(int var0){
    int var1=0;
    int var2=0;
    int var3;
    for(var3=var0;var0>0;var0/=10){
        int var4=var0%10;
        var2+=var4*(Math.pow(2.0,(double)var1));
        var1++;
    }
    System.out.println(var2);

}
public static void main(String[] args) {
    System.out.println("Enter a number : ");
    Scanner sc =new Scanner(System.in);
    int input=sc.nextInt();
    sc.close();
    
    BinToDec(input);
}
 }
 