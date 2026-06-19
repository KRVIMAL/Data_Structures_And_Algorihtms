package Array;
import java.util.Scanner;
import java.util.ArrayList;

public class PrimeNoBetweenRange{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list =new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            list.add(i);
        }
        ArrayList<Integer>primeNumbers=new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(list.get(i)%j==0){
                    count++;
                }
            }
            if(count==2){
                primeNumbers.add(i);
            }
        }
        for(int i=0;i<primeNumbers.size();i++){
            System.out.print(primeNumbers.get(i) + " ");
        }
    }
}