package vn.luongvo.circleci.sample.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import vn.luongvo.circleci.sample.ui.MainPresenter;

/**
 * Copyright © 2017 buddify.io
 * <p/>
 * Created by luongvo on 1/5/18.
 */

@Module
public class PresenterModule {

    @Provides
    @Singleton
    static MainPresenter provides() {
        return new MainPresenter();
    }
}
