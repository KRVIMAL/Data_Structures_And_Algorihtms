package HackerRank_Problems;
import java.util.*;

public class ClosestNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        ClosestNumbers(list);
    }
    public static void ClosestNumbers(ArrayList<Integer> list){
        Collections.sort(list);
        HashMap<Integer,Integer>mp=new HashMap<>();
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            int diff=list.get(i+1)-list.get(i);
            mp.put(i,diff);
            min_diff=Math.min(min_diff,diff);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(Integer key:mp.keySet()){
            if(mp.get(key)==min_diff){
                ans.add(mp.get(key));
                ans.add(mp.get(key+1));
            }
        }
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+ " ");
        }
    }
}