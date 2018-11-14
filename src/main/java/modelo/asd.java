
package modelo;

import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class asd {
    public static void main(String[] args) {
    Calendar c1 = Calendar.getInstance();
Calendar c2 = new GregorianCalendar();
int año = c2.get(Calendar.YEAR);
int year = ZonedDateTime.now(  ZoneId.of( "Africa/Casablanca" )  ).getYear() ;
 
        System.out.println(""+year);
    }
   
}
