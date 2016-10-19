package kode.kinopoisk.savin.letmemovie.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Илья on 19.10.2016.
 */

public class DateUtil {

   public static String getTodayDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String currentDateandTime = sdf.format(new Date());
        return currentDateandTime;
    }

    public static String getSoonDate(){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("MM.yyyy");
        String currentDateandTime = sdf.format(cal.getTime());
        int a = 5;
        return currentDateandTime;
    }

}
