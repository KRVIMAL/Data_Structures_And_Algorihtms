package Pattern.kunal_kushwaha_patterns;
import java.util.Scanner;
public class pattern_07 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the row number");
        int n=sc.nextInt();
        System.out.println("The number you have entered is " + n);

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
