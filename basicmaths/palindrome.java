import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n < 0) {
            System.out.print("false");
        }
        
        int dup = n;
        int revNum = 0;
        
        while (n > 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        
        if (dup == revNum) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}