package HackerRank_Problems;
import java.util.*;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>>arr=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<Integer>());
            for(int j=0;j<n;j++){
                int num=sc.nextInt();
                arr.get(i).add(num);
            }
        }


        int result=diagonalDifference(arr);
        System.out.println(result);
        sc.close();
    }
    public static int diagonalDifference(ArrayList<ArrayList<Integer>>arr){
        int primaryDiagonal=0;
        int secondaryDiagonal=0;
        for(int i=0;i<arr.size();i++ ){
            for(int j=0;j<arr.size();j++){
                if(i==j){
                    primaryDiagonal+=arr.get(i).get(j);
                }
            }
        }

        for(int i=0;i<arr.size();i++ ){
            for(int j=0;j<arr.size();j++){
                if(i==j){
                    secondaryDiagonal+=arr.get(i).get(arr.size()-i-1);
                }
            }
        }
        if(primaryDiagonal>secondaryDiagonal){
           return primaryDiagonal-secondaryDiagonal;
        }
        else {
            return secondaryDiagonal-primaryDiagonal;
//            System.out.println(klahsfd);
        }
    }
}
