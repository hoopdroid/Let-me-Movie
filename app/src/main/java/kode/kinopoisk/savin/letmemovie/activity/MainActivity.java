package kode.kinopoisk.savin.letmemovie.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.github.florent37.materialviewpager.header.HeaderDesign;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import butterknife.Bind;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.components.Constants;
import kode.kinopoisk.savin.letmemovie.fragment.NewsFragment;
import kode.kinopoisk.savin.letmemovie.fragment.SoonMoviesFragment;
import kode.kinopoisk.savin.letmemovie.fragment.TodayMoviesFragment;
import kode.kinopoisk.savin.letmemovie.navigator.ActivityNavigator;
import kode.kinopoisk.savin.letmemovie.navigator.FragmentNavigator;
import kode.kinopoisk.savin.letmemovie.util.DateUtil;

public class MainActivity extends BaseActivity{

    @Bind(R.id.materialViewPager)
    MaterialViewPager mViewPager;
    @Bind(R.id.mainFrame)
    FrameLayout mFrame;
    @Bind(R.id.appbar)
    AppBarLayout mAppBar;
    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);

        if (settings.getInt("isCity",0)==1) {

            cityID = settings.getString(Constants.CITY_ID, Constants.DEFAULT_CITY);
            setContentView(R.layout.activity_main);
            initViewElements();

        }

        else {

            ActivityNavigator.startSelectyCityActivity(this);

        }

    }



    private void initViewElements() {
        mToolbar= mViewPager.getToolbar();
        initDrawer(mToolbar,this);

        mToolbar.setTitle("Хочу в Кино");


        mViewPager.getViewPager().setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {

            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                switch (position % 3) {
                    case 0:
                        return "Сегодня в кино";
                    case 1:
                        return "Скоро в прокате";
                    case 2:
                        return "Новости";

                }
                return "";
            }

            @Override
            public Fragment getItem(int position) {
                switch (position % 3) {
                    case 0:
                        return TodayMoviesFragment.newInstance(MainActivity.this, DateUtil.getTodayDate(),cityID);
                    case 1:
                        return SoonMoviesFragment.newInstance(MainActivity.this,DateUtil.getSoonDate(),cityID);
                    case 2:
                        return NewsFragment.newInstance(MainActivity.this);
                    default:
                        return TodayMoviesFragment.newInstance(MainActivity.this,DateUtil.getTodayDate(),cityID);
                }
            }
        });

        mViewPager.setMaterialViewPagerListener(new MaterialViewPager.Listener() {
            @Override
            public HeaderDesign getHeaderDesign(int page) {
                switch (page) {
                    case 0:
                        return HeaderDesign.fromColorResAndUrl(
                                R.color.primary,
                                "http://genpro.ru/sites/default/files/styles/watermark/public/landing/7_52.jpg?itok=b6q98mP6");
                    case 1:
                        return HeaderDesign.fromColorResAndUrl(
                                R.color.primary_dark,
                                "https://6.oliveoiltimes.com/wp-content/uploads/2014/05/popcorn.jpg");
                    case 2:
                        return HeaderDesign.fromColorResAndUrl(
                                R.color.md_red_500,
                                "https://images.indiegogo.com/file_attachments/1381832/files/20150414054316-cat-cinema_good.jpg");

                }

                return null;
            }
        });

        mViewPager.getViewPager().setOffscreenPageLimit(mViewPager.getViewPager().getAdapter().getCount());
        mViewPager.getPagerTitleStrip().setViewPager(mViewPager.getViewPager());



    }


    public void initDrawer(android.support.v7.widget.Toolbar toolbar, final Activity activity) {

        PrimaryDrawerItem itemMain = new PrimaryDrawerItem().withName("Фильмы").withIcon(R.drawable.ic_movie_blue_grey_600_24dp);
        PrimaryDrawerItem itemMap = new PrimaryDrawerItem().withName("Карта кинотеатров").withIcon(R.drawable.ic_map_blue_grey_600_24dp);
        PrimaryDrawerItem itemSettings = new PrimaryDrawerItem().withName("Сменить город");

        AccountHeader headerResult;
        SharedPreferences sharedPreferences = getSharedPreferences("Default", MODE_PRIVATE);

        headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.color.primary)
                .build();

        Drawer result = new DrawerBuilder()
                .withActivity(activity)
                .withToolbar(toolbar)
                .withDisplayBelowStatusBar(false)
                .withTranslucentStatusBar(false)
                .withAccountHeader(headerResult)
                .addDrawerItems(
                        itemMain,
                        itemMap,
                        new DividerDrawerItem(),
                        itemSettings
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        switch (position) {
                            case 1:
                                mViewPager.setVisibility(View.VISIBLE);
                                mAppBar.setVisibility(View.GONE);
                                mToolbar = mViewPager.getToolbar();
                                mToolbar.setTitle("Хочу в кино");
                                mFrame.setVisibility(View.GONE);

                                break;
                            case 2:
                                mAppBar.setVisibility(View.VISIBLE);
                                mToolbar = (Toolbar) findViewById(R.id.toolbar);
                                mToolbar.setTitle("Карта кинотеатров");
                                setSupportActionBar(mToolbar);
                                mToolbar.setNavigationIcon(R.drawable.ic_menu_white_24dp);
                                mFrame.setVisibility(View.VISIBLE);
                                mViewPager.setVisibility(View.GONE);
                                FragmentNavigator.showMapFragment(MainActivity.this,cityID);
                                break;
                            case 4:
                                ActivityNavigator.startSelectyCityActivity(MainActivity.this);
                                break;

                        }
                        return false;
                    }
                })
                .build();

    }

}
