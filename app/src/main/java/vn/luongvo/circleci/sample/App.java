package vn.luongvo.circleci.sample;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import vn.luongvo.circleci.sample.modules.PresenterModule;
import vn.luongvo.circleci.sample.ui.MainActivity;

/**
 * Copyright © 2017 buddify.io
 * <p/>
 * Created by luongvo on 1/5/18.
 */

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApp_ApplicationComponent.builder().build();
    }

    @Singleton
    @Component(modules = {PresenterModule.class})
    public interface ApplicationComponent {

        void inject(MainActivity activity);
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
