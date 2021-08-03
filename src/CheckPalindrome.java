import java.util.Scanner;

public class CheckPalindrome {
    public static boolean checkPalindrome(String str,int n){
        String rev="";
        for(int i =n-1;i>=0;i--) {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)) {
            return true;
        }
        else{
            return  false;
        }
    }

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        String str =sc.next();
        boolean checkPalindrome = checkPalindrome(str,n);
        if(checkPalindrome==true){
            System.out.println("yes");

        }
        else{
            System.out.println("No");
        }
    }
}
