package Pattern.kunal_kushwaha_patterns;
import java.util.Scanner;
public class pattern_03 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        int n=sc.nextInt();
        System.out.println("You have entered " + n);

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
