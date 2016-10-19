package kode.kinopoisk.savin.letmemovie.fragment;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.adapters.other.SelectCityRVAdapter;
import kode.kinopoisk.savin.letmemovie.data.DataService;
import kode.kinopoisk.savin.letmemovie.data.models.city.CitiesData;
import kode.kinopoisk.savin.letmemovie.data.models.city.CityModel;

public class SelectCityDialogFragment extends DialogFragment implements View.OnClickListener,SearchView.OnQueryTextListener {

  @Bind(R.id.citiesList)
  RecyclerView citiesRV;
  @Bind(R.id.search_view)
  SearchView mSearchView;
  private CitiesData mCitiesData;


  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {

    getDialog().setTitle("Выбор города");
    View v = inflater.inflate(R.layout.dialog_fragment, null);
    ButterKnife.bind(this, v);

    LinearLayoutManager layoutManager
            = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

    citiesRV.setLayoutManager(layoutManager);
    mSearchView.setIconified(false);
    mSearchView.onActionViewCollapsed();
    mSearchView.setOnQueryTextListener(this);

    getCities();

    return v;
  }
 
  public void onClick(View v) {

    dismiss();
  }
 
  public void onDismiss(DialogInterface dialog) {
    super.onDismiss(dialog);

  }
 
  public void onCancel(DialogInterface dialog) {
    super.onCancel(dialog);

  }


  public void getCities(){
    DataService.init().getCitiesList(new DataService.onRequestCitiesResult() {
      @Override
      public void onRequestCitiesResult(CitiesData citiesData) {
        mCitiesData = citiesData;
        SelectCityRVAdapter adapter = new SelectCityRVAdapter(getActivity(),mCitiesData.getCityData());
        citiesRV.setAdapter(adapter);
      }
    },2);
  }

  private void searchCity(String newText) {
    ArrayList<CityModel> tempSearchList = new ArrayList<>();
    for (int i = 0; i < mCitiesData.getCityData().size(); i++) {
      if (mCitiesData.getCityData().get(i).getCityName().matches("(?i)(" + newText + ").*")) {
        tempSearchList.add(mCitiesData.getCityData().get(i));
      }

      SelectCityRVAdapter adapter = new SelectCityRVAdapter(getActivity(),tempSearchList);

      citiesRV.setAdapter(adapter);

    }

}

  @Override
  public boolean onQueryTextSubmit(String query) {
    searchCity(query);
    return false;
  }

  @Override
  public boolean onQueryTextChange(String newText) {
    searchCity(newText);

    return false;
  }
}