public class stringcharAt {
    public static void main(String[] args){
        String firstName="Sakshi";
        String lastName="Reddy";
        String fullName=firstName+" "+lastName;
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));//printing each character of the string
        }
    }
}
