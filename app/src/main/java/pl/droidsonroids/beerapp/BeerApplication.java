package pl.droidsonroids.beerapp;

import android.app.Application;

public class BeerApplication extends Application {

    private static BeerApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static BeerApplication getInstance() {
        return sInstance;
    }
}
