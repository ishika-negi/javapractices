public class Binarytodecimal{
    public static void BinToDec(int binnum){
        int pow=0;
        int decnum=0;
        int mynum=binnum;
        while(binnum>0){
            int lastdigit=binnum%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.print("decimal of "+mynum+" = "+decnum);

    }
    public static void main(String[] args) {
        BinToDec(111);
    }
} 