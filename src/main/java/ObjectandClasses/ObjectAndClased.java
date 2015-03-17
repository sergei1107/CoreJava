package ObjectandClasses;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Сергей on 12.03.2015.
 */
public class ObjectAndClased {
  static  Date date;

    public static void main(String[] args) {
     date = new Date();
        GregorianCalendar gCalendar = new GregorianCalendar();

        date = gCalendar.getTime();

    }



}
