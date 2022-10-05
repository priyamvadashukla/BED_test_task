package bed_hour_to_String;

import java.util.Scanner;

import bed_hour_to_String.Controller.HourtoStringController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        String time=sc.next();
        String result[]=time.split(":");
        String hour=result[0];
        String min=result[1];
        HourtoStringController.printhourandmin(hour, min);
        
        
        
       
    }
}
