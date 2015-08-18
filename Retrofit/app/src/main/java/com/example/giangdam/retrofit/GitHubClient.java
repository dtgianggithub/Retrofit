package com.example.giangdam.retrofit;

import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Giang.Dam on 8/18/2015.
 */
public interface GitHubClient {
    @GET("/repos/{owner}/{repo}/name")
    String name(
            @Path("owner") String owner,
            @Path("repo") String repo
    );
}
