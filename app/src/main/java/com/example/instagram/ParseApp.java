package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        final Parse.Configuration configuration = new Parse.Configuration.Builder(this)
                .applicationId("albertolm9115")
                .clientKey("c942gD7a_")
                .server("http://albertolm-fbu-instagram.herokuapp.com/parse")
                .build();
        Parse.initialize(configuration);
    }
}
