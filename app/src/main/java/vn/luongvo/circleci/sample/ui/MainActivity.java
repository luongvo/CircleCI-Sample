package vn.luongvo.circleci.sample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import vn.luongvo.circleci.sample.App;
import vn.luongvo.circleci.sample.R;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App) getApplication()).getComponent().inject(this);

        presenter.log();
    }
}
