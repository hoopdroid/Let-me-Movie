package kode.kinopoisk.savin.letmemovie.activity;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.components.Constants;

/**
 * The base activity of application is used to set ButterKnife binding
 */
public class BaseActivity extends AppCompatActivity {

    protected String cityID = Constants.DEFAULT_CITY;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);

    }

}