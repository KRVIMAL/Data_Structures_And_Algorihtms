package HackerRank_Problems;
import java.util.*;
public class Grading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>grades=new ArrayList<>();
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            grades.add(value);
        }
        ArrayList<Integer>result=gradingStudents(grades);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));

        }
        sc.close();
    }
    public static ArrayList<Integer> gradingStudents(ArrayList<Integer> grades){
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<grades.size();i++){
            if(grades.get(i)>37){
                int remainder=grades.get(i)%5;

                if(remainder>=3){

                    res.add(grades.get(i)+(5-remainder));
                }else{
                    res.add(grades.get(i));
                }
            }else {
                res.add(grades.get(i));
            }
        }
        return  res;

    }
}
