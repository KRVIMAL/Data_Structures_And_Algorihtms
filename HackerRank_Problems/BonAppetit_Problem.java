package HackerRank_Problems;
import java.util.*;

public class BonAppetit_Problem{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();//total number of items.
        int k=sc.nextInt();//item index that anna did not eat.
        ArrayList<Integer> bill=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            bill.add(sc.nextInt());
        }
        int b=sc.nextInt();// amount anna charged.
        bonAppetit(bill,k,b);
        sc.close();
    }

    public static void bonAppetit(ArrayList<Integer>bill,int k,int b){
        int total=0;
        int removedElement=0;
        int actual;
        for(int i=0;i<bill.size();i++){
            total+=bill.get(i);
           removedElement=bill.get(k);

        }
        actual=(total-removedElement)/2;
        if(actual==b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b-actual);
            System.out.println("b");
        }
    }
}