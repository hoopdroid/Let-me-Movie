package kode.kinopoisk.savin.letmemovie.activity;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import kode.kinopoisk.savin.letmemovie.R;
import kode.kinopoisk.savin.letmemovie.components.Constants;
import kode.kinopoisk.savin.letmemovie.fragment.SelectCityDialogFragment;

public class FirstStartActivity extends BaseActivity implements View.OnClickListener {

    @Bind(R.id.btnCitySelect)
    Button mCitySelectBtn;

    private DialogFragment mDialogFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_start);

        initViewElements();

    }

    private void initViewElements() {
        mCitySelectBtn.setOnClickListener(this);
        mDialogFragment = new SelectCityDialogFragment();
    }

    @Override
    public void onClick(View v) {

        if(v==mCitySelectBtn)
            mDialogFragment.show(getFragmentManager(), Constants.SELECT_CITY_DIALOG);
    }
}
