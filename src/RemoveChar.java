import java.util.Scanner;

public class RemoveChar {
    public static String removeChar(String str){
        String res ="";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)!='a'){
                res = res+str.charAt(i);
            }
        }
        return res;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        System.out.println(removeChar(str));

    }

}
