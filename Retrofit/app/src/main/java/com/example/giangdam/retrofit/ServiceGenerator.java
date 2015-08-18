package com.example.giangdam.retrofit;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by Giang.Dam on 8/18/2015.
 */
public class ServiceGenerator {

    ServiceGenerator(){

    }

    public static <S> S createService(Class<S> serviceClass , String baseUrl){
        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(baseUrl).setClient(new OkClient(new OkHttpClient()));
        RestAdapter adapter = builder.build();
        return adapter.create(serviceClass);
    }
}
