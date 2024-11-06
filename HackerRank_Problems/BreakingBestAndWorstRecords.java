package HackerRank_Problems;
import java.util.ArrayList;
import java.util.Scanner;
public class BreakingBestAndWorstRecords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>scores=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            scores.add(sc.nextInt());
        }
        ArrayList<Integer> result=  breakingRecords(scores);
        System.out.println(result.get(0) + " " + result.get(1));

    }
    public static ArrayList<Integer> breakingRecords(ArrayList<Integer>scores){

        int highestCount=0;
        int lowestCount=0;

        ArrayList<Integer> result=new ArrayList<>();
        int highest= scores.getFirst();
        int lowest= scores.getFirst();

        for (Integer score : scores) {
            if (score > highest) {
                highest = score;
                highestCount++;
            }
            if (score < lowest) {
                lowest = score;
                lowestCount++;
            }

        }
        result.add(highestCount);
        result.add(lowestCount);
        return result;
    }
}
