package kode.kinopoisk.savin.letmemovie.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.data.DataService;
import kode.kinopoisk.savin.letmemovie.data.models.cinemas.CinemaData;
import kode.kinopoisk.savin.letmemovie.data.models.cinemas.CinemaModel;
import kode.kinopoisk.savin.letmemovie.navigator.ActivityNavigator;

/**
 * Created by Илья on 03.10.2016.
 */

public class CinemaMapFragment extends Fragment implements OnMapReadyCallback,GoogleMap.OnMarkerClickListener,GoogleMap.OnInfoWindowClickListener{

    private MapView mMapView;

    private GoogleMap mGoogleMap;
    private ArrayList<Marker> markerArrayList = new ArrayList<>();
    private ArrayList<CinemaModel> cinemaModels = new ArrayList<>();

    private static String mCityID;

    public CinemaMapFragment() {
    }

    public static CinemaMapFragment newInstance(String cityID) {
        CinemaMapFragment cinemaMapFragment = new CinemaMapFragment();
        mCityID = cityID;
        return cinemaMapFragment;
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View v =  layoutInflater.inflate(R.layout.fragment_map, viewGroup, false);

        mMapView = (MapView)v.findViewById(R.id.map);
        mMapView.onCreate(bundle);
        mMapView.getMapAsync(this);
        return v;
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mGoogleMap = googleMap;
        mGoogleMap.getUiSettings().setZoomControlsEnabled(false);
        mGoogleMap.setOnMarkerClickListener(this);

        getCinemasMarkers();


    }

    private void showCinemasOnMap() {
        MarkerOptions options = new MarkerOptions();
        for(int i = 0; i< cinemaModels.size();i++) {
            if(cinemaModels.get(i).getLat()!=null&&cinemaModels.get(i).getLon()!=null){
            options = new MarkerOptions().position(
                    new LatLng(Float.parseFloat(cinemaModels.get(i).getLat()),
                            Float.parseFloat(cinemaModels.get(i).getLon())));
                    options.title(cinemaModels.get(i).getCinemaName());
                BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher);
                options.icon(icon);
                markerArrayList.add((mGoogleMap.addMarker(options)));}
        }
        mGoogleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(options.getPosition().latitude,options.getPosition().longitude),12));

    }

    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mMapView.onSaveInstanceState(outState);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }

    @Override
    public boolean onMarkerClick(Marker marker) {


        setMarkerElementOnClick(marker);

        return false;
    }

    private void setMarkerElementOnClick(Marker marker) {
        for(int i = 0 ; i< cinemaModels.size();i++) {
            if (marker.getTitle().equals(cinemaModels.get(i).getCinemaName())) {
                ActivityNavigator.startCinemaActivity(getActivity(),cinemaModels.get(i));
            }
        }
    }

    @Override
    public void onInfoWindowClick(Marker marker) {

        setMarkerElementOnClick(marker);

    }

    public void getCinemasMarkers(){
        DataService.init().getCinemas(new DataService.onRequestCinemasResult() {
            @Override
            public void onRequestCinemasResult(CinemaData cinemaDataList) {
                cinemaModels.addAll(cinemaDataList.getCinemaModels());
                showCinemasOnMap();
            }
        },Integer.parseInt(mCityID));
    }
}
