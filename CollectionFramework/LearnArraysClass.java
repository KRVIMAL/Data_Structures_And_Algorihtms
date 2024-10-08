package CollectionFramework;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6,7,8,0,10};
        int index= Arrays.binarySearch(numbers,4);
        Arrays.sort(numbers);
        Arrays.fill(numbers,88);
        for(int i:numbers){
            System.out.println(i + " ");
        }
        System.out.println(index);
    }
}
