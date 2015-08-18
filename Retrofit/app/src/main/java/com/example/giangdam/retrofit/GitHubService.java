package com.example.giangdam.retrofit;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Giang.Dam on 8/18/2015.
 */
public interface GitHubService {
    @GET("/users/{user}")      //here is the other url part.best way is to start using /
    public void getFeed(@Path("user") String user, Callback<MyRepo> response);
}
