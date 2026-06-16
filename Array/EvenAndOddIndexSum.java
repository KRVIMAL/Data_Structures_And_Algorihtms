package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class EvenAndOddIndexSum{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int even=0;
        int odd=0;
        for(int i=0;i<list.size();i++){
            if((i)%2==0){
                even+=list.get(i);
            }else {
                odd+=list.get(i);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
