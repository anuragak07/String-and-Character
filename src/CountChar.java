import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        HashMap<Character,Integer> hp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hp.containsKey(str.charAt(i))){
                hp.put(str.charAt(i),hp.get(str.charAt(i))+1);

            }
            else{
                hp.put(str.charAt(i),1);
            }

        }
        for(Map.Entry<Character,Integer> map:hp.entrySet()){
            System.out.println(map.getKey()+"-"+map.getValue());
        }

    }
}
