package HackerRank_Problems;
import java.util.*;

public class DesignPdfViewer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[26];
        for(int i=0;i<26;i++){
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
        String word=sc.nextLine();
        int result=designerPdfViewer(arr,word);
        System.out.println(result);
    }
    public static int designerPdfViewer(int[] arr,String word){
        int mx=0;
        for(int i=0;i<word.length();i++){
            if(arr[word.charAt(i)-97]>mx){
                mx=arr[word.charAt(i)-97];
            }
        }
        return mx*word.length();
    }
}