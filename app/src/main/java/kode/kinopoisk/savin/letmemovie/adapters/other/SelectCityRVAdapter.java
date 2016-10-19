package kode.kinopoisk.savin.letmemovie.adapters.other;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.data.models.city.CityModel;
import kode.kinopoisk.savin.letmemovie.navigator.ActivityNavigator;
import kode.kinopoisk.savin.letmemovie.util.PrefUtil;

/**
 * An adapter for the list of MovieModels
 */
public class SelectCityRVAdapter extends RecyclerView.Adapter<SelectCityRVAdapter.ViewHolder> {

    private List<CityModel> cityModelList;
    private final Context context;
    private int lastPosition = -1;
    private boolean isMovieModelLikedByUser;
    private String userIdString;

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }

    public SelectCityRVAdapter(Context context, List<CityModel> cityModelList) {
        this.context = context;
        this.cityModelList = cityModelList;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cities, viewGroup, false);

        return new ViewHolder(view, viewGroup.getContext());
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {

        viewHolder.cityName.setText(cityModelList.get(i).getCityName());

    }


    @Override
    public int getItemCount() {
        return cityModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        @Bind(R.id.cityItemText)
        TextView cityName;

        protected Context context;

        public ViewHolder(View view, final Context context) {
            super(view);

            ButterKnife.bind(this, view);
            cityName.setOnClickListener(this);

            this.context=context;

        }



        @Override
        public void onClick(View v) {

            if(v== cityName)
            {
                PrefUtil.setUserCity(context,cityModelList.get(getPosition()).getCityID());
                ActivityNavigator.startMainActivity(context);

            }


            }
        }

}