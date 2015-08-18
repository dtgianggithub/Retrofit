package com.example.giangdam.retrofit;

import com.example.giangdam.model.ProductBound;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Giang.Dam on 8/18/2015.
 */
public interface BuyDesireService {
    //@GET("/api/Tablet/Desires/GetDesires?request={\"DeviceID\":\"android_id\",\"ProductCatalogueID\":0,\"AppVersion\":\"4.6\",\"pageSize\":10,\"MobilePlatform\":1,\"UserID\":1661,\"DeviceType\":1,\"CreditCard\":0,\"DeviceAPID\":\"0ea4696f-9a3a-4214-9dab-bf3618f91561\",\"SortCriteria\":0,\"Filter\":0,\"CountryCode\":\"VN\",\"PageIndex\":0,\"CachedDataVersion\":-1}")      //here is the other url part.best way is to start using /

    @GET("/api/Tablet/Desires/GetDesires?request={\"DeviceID\":\"android_id\",\"ProductCatalogueID\":{ProductCatalogueID},\"AppVersion\":\"4.6\",\"pageSize\":{pageSize},\"MobilePlatform\":1,\"UserID\":{UserID},\"DeviceType\":1,\"CreditCard\":0,\"DeviceAPID\":\"0ea4696f-9a3a-4214-9dab-bf3618f91561\",\"SortCriteria\":0,\"Filter\":0,\"CountryCode\":\"{CountryCode}\",\"PageIndex\":{PageIndex},\"CachedDataVersion\":-1}")
    public void getFeed(@Path("ProductCatalogueID") int ProductCatalogueID, @Path("pageSize") int pageSize,@Path("UserID") int UserID,@Path("CountryCode") String CountryCode,@Path("PageIndex") int PageIndex, Callback<ProductBound> response);
}
