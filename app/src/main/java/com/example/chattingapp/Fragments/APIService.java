package com.example.chattingapp.Fragments;

import com.example.chattingapp.Notifications.MyResponse;
import com.example.chattingapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=\tAAAAYieOFNc:APA91bHsnvWYL3jZ3NhCdKwEtx51tkDQ8GFVFwQiBBG2f7cwndvwm1d7DnFiVir4M7iyCl64pr4IDuAeRJRo-sXLrzKCxmXra8WXxjz7XT9YB7DRUZAUGSEkKrYWF1GiF2okpzksKT6F"
                }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
