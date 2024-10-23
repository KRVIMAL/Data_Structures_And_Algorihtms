package Hashing;

import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int numberOfQueries=sc.nextInt();
        ArrayList<Integer>queryList=new ArrayList<>();
        for(int i=0;i<numberOfQueries;i++){
            queryList.add(sc.nextInt());
        }
        for(int i=0;i<numberOfQueries;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(list.get(i)==queryList.get(i)){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
