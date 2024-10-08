package HackerRank_Problems;
import java.util.Arrays;
import java.util.Scanner;
public  class Electronics_Shop_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] inputArray=input.split(" ");
        int[] array=new int[inputArray.length];
        System.out.println(array);
        for(int i=0;i<inputArray.length;i++){
            array[i]=Integer.parseInt(inputArray[i]);
        }
        Arrays.sort(array);
        int min=0;
//        for(int i=0;i<array.size();i++){
//            int[] newArray=array[i]-min;
//            return newArray;
//        }
//        System.out.println("new array " + newArray);
        System.out.println("Elements of the minimum array are " + Arrays.toString(array));
    }
}