package edu.northeastern.cs5500project.ChatAndNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface WebAPI {
    @Headers(
            {       "Content-Type:application/json",
                    "Authorization:key=AAAAl-cRNCs:APA91bGFi2KXO_IM7_ZCcqwmisIl7CF8scvCQDrDFyWdtWSre8V621uLrUBCGxg18m9ls-Mfd-eHK-7WO-EIb4VD9VAZmv9dH9zWsnHoJNmV0C3o-G5QbyGiDG_wJQ9yL-fva2vdIjts"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendAndNotify(@Body Send body);
}