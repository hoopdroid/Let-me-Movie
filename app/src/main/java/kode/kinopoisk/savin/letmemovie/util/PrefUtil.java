package kode.kinopoisk.savin.letmemovie.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Илья on 21.09.2016.
 */

public class PrefUtil {

    public static void setUserCity(Context activity,String cityID) {
        SharedPreferences.Editor prefs = PreferenceManager.getDefaultSharedPreferences(activity).edit();
        prefs.putString("cityID", cityID);
        prefs.putInt("isCity", 1);
        prefs.apply();
    }
}
