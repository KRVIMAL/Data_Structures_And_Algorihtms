package Pattern.kunal_kushwaha_patterns;
import java.util.Scanner;
public class pattern_02 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter the number of rows");
        int n=sc.nextInt();
        System.out.println("You have entered " + n);

        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
