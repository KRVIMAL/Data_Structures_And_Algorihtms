package HackerRank_Problems;
import java.util.*;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr, Collections.reverseOrder());
        int result=birthdayCakeCandles (arr);
        System.out.println(result);

    }
    public static int birthdayCakeCandles (ArrayList<Integer>arr){
        int max=arr.getFirst();
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==max){
                count++;
            }
        }
        return count;
    }
}
