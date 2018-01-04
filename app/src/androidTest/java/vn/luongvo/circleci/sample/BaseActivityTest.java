package vn.luongvo.circleci.sample;

import android.support.test.espresso.intent.Intents;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

/**
 * Copyright © 2017 buddify.io
 * <p/>
 * Created by luongvo on 1/3/18.
 */

@RunWith(AndroidJUnit4.class)
public abstract class BaseActivityTest {

    private final String TAG = this.getClass().getSimpleName();

    @Before
    public void setUp() throws Exception {
        Intents.init();
    }

    @After
    public void tearDown() throws Exception {
        try {
            Intents.release();
        } catch (IllegalStateException e) {
            e.printStackTrace();
            Log.d(TAG, "tearDown: activity was closed!");
        }
    }
}
