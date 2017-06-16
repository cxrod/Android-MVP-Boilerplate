package com.cxrod.boilerplate.data.network;

import com.cxrod.boilerplate.data.network.model.BaseResponse;
import com.cxrod.boilerplate.data.network.model.BlogResponse;
import com.cxrod.boilerplate.data.network.model.LoginRequest;
import com.cxrod.boilerplate.data.network.model.LoginResponse;
import com.cxrod.boilerplate.data.network.model.OpenSourceResponse;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

import static com.cxrod.boilerplate.BuildConfig.API_KEY;

/**
 * Created by crodriguez on 6/14/17.
 */

public interface ApiHelper {

    @POST("588d14f4100000a9072d2943")
    Observable<LoginResponse> doGoogleLoginApiCall(@Body LoginRequest.GoogleLoginRequest request);

    @POST("588d15d3100000ae072d2944")
    Observable<LoginResponse> doFacebookLoginApiCall(@Body LoginRequest.FacebookLoginRequest request);

    @POST("588d15f5100000a8072d2945")
    Observable<LoginResponse> doServerLoginApiCall(@Body LoginRequest.ServerLoginRequest request);

    @POST("588d161c100000a9072d2946")
    Observable<BaseResponse> doLogoutApiCall();

    @GET("5926ce9d11000096006ccb30")
    Observable<BlogResponse> getBlogApiCall();

    @GET("5926c34212000035026871cd")
    Observable<OpenSourceResponse> getOpenSourceApiCall();
}
