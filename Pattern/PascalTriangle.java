package Pattern;
import java.util.Scanner;
import java.util.ArrayList;
public class PascalTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> grid=new ArrayList<>();
        ArrayList<Integer> temp;
        for(int i=0;i<n;i++){
            temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    temp.add(1);

                }
                else{
                    temp.add(grid.get(i-1).get(j)+grid.get(i-1).get(j-1));
                }
            }
            grid.add(temp);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(grid.get(i).get(j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}