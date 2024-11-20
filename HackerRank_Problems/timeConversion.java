package HackerRank_Problems;
import java.util.*;
public class timeConversion {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String time=sc.nextLine();
    String result=timeConversion(time);
    System.out.println(result);
    sc.close();
    }
    public static String timeConversion(String time){
        int hour=Integer.parseInt(time.substring(0,2));
        String min=time.substring(3,5);
        String seconds=time.substring(6,8);
        String amOrPm=time.substring(8);
        if(amOrPm.equals("PM")&& hour!=12){
            hour+=12;
        }else if(amOrPm.equals("AM")&&hour==12){
            hour=0;

        }
        return String.format("%02d:%s:%s",hour,min,seconds);
    }

}