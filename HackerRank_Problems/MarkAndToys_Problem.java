package HackerRank_Problems;
import java.util.*;


public class  MarkAndToys_Problem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        ArrayList<Integer>prices=new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            prices.add(sc.nextInt());
        }
        int result=maximumToys(prices,k);
        System.out.println(result);
    }

    public static int maximumToys(ArrayList<Integer> prices, int k){
        int sum=0;
        int count=0;
        Collections.sort(prices);
        for(int i=0;i<prices.size();i++) {
            sum += prices.get(i);
            if (sum <= k) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}


 