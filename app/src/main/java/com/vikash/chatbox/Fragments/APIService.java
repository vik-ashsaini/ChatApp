package com.vikash.chatbox.Fragments;

import com.vikash.chatbox.Notifications.MyResponse;
import com.vikash.chatbox.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers (
            {
                "Content-Type:application/json",
                "Authorization:key=AAAA1gGg95A:APA91bFv-dvSrdr-_v1CbteQbVVRc0f_KmrTnb-TKpjjdJ1T21By_nI_jwx_Gt530lpbCHUHV_bBrEAJVp7AdAl4PI-iLR46JC5MkSYmwEHwvrwjLfLvbWi-lXkpPZiXlK1MwSywPffq"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}
