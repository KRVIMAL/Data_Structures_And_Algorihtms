package HackerRank_Problems;
import java.util.*;

public class CircularArrayRotation {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int[] queries=new int[q];
        for(int i=0;i<q;i++){
            queries[i]= sc.nextInt();
        }

        int[] result=circularArrayRotation(a,k,queries,q);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);

        }
    }
    public static int[] circularArrayRotation(int[]a,int k,int[]queries,int q){
        int temp=0;
        System.out.println(k+"k");
        for(int i=0;i<k;i++){
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+ "0");
        }
        int[] result=new int[q];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<queries.length;j++){
                result[j]=a[j];
            }
        }
        return result;
    }
}

//public static int[] circularArrayRotation(int[] a, int k, int[] queries, int q) {
//    int n = a.length;
//    int[] rotatedArray = new int[n];
//
//    // Normalize k in case it's larger than n
//    k = k % n;
//
//    // Rotate the array
//    for (int i = 0; i < n; i++) {
//        rotatedArray[(i + k) % n] = a[i];
//    }
//
//    // Process queries
//    int[] result = new int[q];
//    for (int i = 0; i < q; i++) {
//        result[i] = rotatedArray[queries[i]];
//    }
//
//    return result;
//}
//
