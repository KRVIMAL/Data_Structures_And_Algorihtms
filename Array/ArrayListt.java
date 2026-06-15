package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListt{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println();
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        list.set(2,9);
        System.out.println();
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        list.add(3,8);
        System.out.println();
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}