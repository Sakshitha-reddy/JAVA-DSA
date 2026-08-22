import java.util.*;
public class sb2 {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        //delete char
        //starts from (start,end) starts from start index and goes till end index 
        //but does not include end index
        sb.delete(2,3);
        System.out.println(sb);
         sb.delete(2,4);
        System.out.println(sb);
    }
}
