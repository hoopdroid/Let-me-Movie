package kode.kinopoisk.savin.letmemovie.navigator;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.fragment.CinemaMapFragment;


/**
 * Fragment navigation.
 */
public class FragmentNavigator {

    public static void showStaffFragment(Activity activity, Fragment fragment) {

        FragmentManager manager = activity.getFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        ft.replace(R.id.fragment_staff, fragment);
        ft.commit();

    }


    public static void showInfoFragment(Activity activity, Fragment fragment) {

        FragmentManager manager = activity.getFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        ft.replace(R.id.fragment_info, fragment);
        ft.commit();

    }

    public static void showMapFragment(Activity activity,String cityID){

        FragmentManager manager = activity.getFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        ft.replace(R.id.mainFrame, CinemaMapFragment.newInstance(cityID));
        ft.commit();

    }


}
