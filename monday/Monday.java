package monday;
import java.time.LocalTime;
import java.util.Scanner;
public class Monday extends Weekdays {
    
    private static String Alarmtime;
    public static void setAlarm(String time){
        Alarmtime = time;
    }
    
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
    
        System.out.print("Enter time for alarm in this format (HH:MM): ");
      Alarmtime = scn.next();
        LocalTime alarm = LocalTime.parse(Alarmtime);
        LocalTime now = LocalTime.now();
       
       if(alarm.isAfter(now)){
           System.out.println("I'll wake you up later!!");
       }else if (alarm.isBefore(now)){
           System.out.println("I'll wake you up tommorow");
       }
       
        
       
      
       
    }
    
}
