package  HackerRank_Problems;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MigratoryBirds{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer>hash=new HashMap<>();
        int result=migratoryBirds(arr,hash);
        System.out.println(result);
        sc.close();
    }
    public static int migratoryBirds(int[] arr,Map<Integer,Integer>hash){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(hash.containsKey(num)==true){
                hash.put(num,hash.get(num)+1);
            }else{
                hash.put(num,1);
            }
        }
        int max=0;
        int result=0;
        for(Integer key:hash.keySet()){
            int value=hash.get(key);
            if(value>max){
                max=value;
                result=key;
            }
        }

        return result;
    }
}
