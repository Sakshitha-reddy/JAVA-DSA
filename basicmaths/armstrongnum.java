import java.util.Scanner;

public class armstrongnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int dup=n;
        int revNum=0;
        while(n>0){
          int ld=n%10;
          sum=sum+(ld*ld*ld);
          n=n/10;
        }
        
        if (dup == sum) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}