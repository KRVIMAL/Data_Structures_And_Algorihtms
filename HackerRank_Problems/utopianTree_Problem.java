package HackerRank_Problems;
import java.util.*;

public class utopianTree_Problem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>test=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            test.add(sc.nextInt());
        }
        for(int i=0;i<test.size();i++){
            int result=utopianTree(test.get(i));
            System.out.println(result);
        }
        sc.close();
    }

    public static int utopianTree(int t){
        boolean spring=true;
        int height=1;
        for(int i=0;i<t;i++){
            if(spring){
                height=height*2;
                spring=false;
            }else{
                height+=1;
                spring=true;
            }
        }
        return height;
    }
}