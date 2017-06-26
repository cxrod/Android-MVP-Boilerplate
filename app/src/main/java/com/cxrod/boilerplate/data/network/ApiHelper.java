package com.cxrod.boilerplate.data.network;

import com.cxrod.boilerplate.BuildConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

/**
 * Created by crodriguez on 6/23/17.
 */

public class ApiHelper {
    /******** Helper class that sets up a new services *******/

    public static ApiService newApiService(final String accessToken) {

        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {
            @Override
            public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {

                Request originalRequest = chain.request();
                Request.Builder builder = originalRequest.newBuilder();

                if (accessToken != null){
                    builder.header("Authorization", "Baerer "+accessToken);
                }

                Request newRequest = builder.build();
                return chain.proceed(newRequest);
            }
        }).build();

        /*Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(MyGsonTypeAdapterFactory.create())
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                .create();
        */
        Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(BuildConfig.BASE_URL)
                //.addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(ApiService.class);
    }
}
