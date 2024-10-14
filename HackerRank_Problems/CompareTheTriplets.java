package HackerRank_Problems;

import java.util.ArrayList;
import java.util.Scanner;
public class CompareTheTriplets {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=3;
        ArrayList<Integer>AliceRating=new ArrayList<>(n);
        ArrayList<Integer>BobRating=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            AliceRating.add(sc.nextInt());

        }
        for(int i=0;i<n;i++){
            BobRating.add(sc.nextInt());

        }
        ArrayList<Integer> result= compareTriplets(AliceRating,BobRating);
        System.out.println(result.get(0) + " " + result.get(1));
        sc.close();
    }
    public static ArrayList<Integer> compareTriplets(ArrayList<Integer>a,ArrayList<Integer>b){
        ArrayList<Integer>finalResult=new ArrayList<>();
        int aliceCount=0;
        int bobCount=0;
        for(int i=0;i<3;i++){
            if(a.get(i)>b.get(i)){
                aliceCount++;
            } else if (a.get(i)<b.get(i)) {
                bobCount++;
            }

        }
        finalResult.add(aliceCount);
        finalResult.add(bobCount);
        return finalResult;
    }

}
