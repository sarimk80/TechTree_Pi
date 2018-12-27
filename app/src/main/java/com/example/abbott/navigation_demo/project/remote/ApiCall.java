package com.example.abbott.navigation_demo.project.remote;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiCall {

    @GET("/macros/echo?user_content_key=ln-UHY9FfDPbRFTVrKat3qyY7Hjsr0GO-4E4AueOsw9IR84Xzyr5XeLCM0FfwuhvfEYQact4I2sVPl9X0Ew8Vk41ODe3g41rm5_BxDlH2jW0nuo2oDemN9CCS2h10ox_1xSncGQajx_ryfhECjZEnEvv0NuU4fnWMwos8OeCclCtOcjpagL8omPShBxVgozXBprjfYq2x5uqh-NrHuZ9ov3G9YKhFlrw&lib=MJ3U7ZcToRb8RwKP78SI0y7ZGgXJoIyjV")
    Call<ProjectList> getProjectList();
}
