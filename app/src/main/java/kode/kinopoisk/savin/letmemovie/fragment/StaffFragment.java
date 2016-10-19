package kode.kinopoisk.savin.letmemovie.fragment;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.adapters.staff.DirectorRVAdapter;
import kode.kinopoisk.savin.letmemovie.adapters.staff.StaffRVAdapter;
import kode.kinopoisk.savin.letmemovie.data.DataService;
import kode.kinopoisk.savin.letmemovie.data.models.staff.StaffMovieData;

/**
 * A simple {@link Fragment} subclass.
 */
public class StaffFragment extends Fragment {

    @Bind(R.id.directorRV)
    RecyclerView mDirectorRV;
    @Bind(R.id.actorsRV)
    RecyclerView mActorsRV;

    private static String filmID = "";

    public static StaffFragment newInstance(Activity activity,String filmID) {

        StaffFragment staffFragment = new StaffFragment();

        Bundle args = new Bundle();
        args.putString("movieID", filmID);
        staffFragment.setArguments(args);

        StaffFragment.filmID = filmID;

        return staffFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_staff, container, false);
        ButterKnife.bind(this, view);

        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager directorLayoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mDirectorRV.setLayoutManager(directorLayoutManager);
        mActorsRV.setLayoutManager(horizontalLayoutManagaer);


        getActorsStaff();

        return view;
    }

    private void getActorsStaff(){
        DataService.init().getStaffMovie(new DataService.onRequestStaffMovieResult() {
            @Override
            public void onRequestStaffMoveResult(StaffMovieData staffMovieData) {

                StaffRVAdapter staffRVAdapter = new StaffRVAdapter(getActivity(),staffMovieData.getCreators().get(1));
                DirectorRVAdapter directorRVAdapter = new DirectorRVAdapter(getActivity(),staffMovieData.getCreators().get(0));
                mDirectorRV.setAdapter(directorRVAdapter);
                mActorsRV.setAdapter(staffRVAdapter);

            }
        },filmID);
    }

}
