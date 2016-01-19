package ru.vago.orienteering.service;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import retrofit.http.Query;
import ru.vago.orienteering.dto.UserDto;

public interface UserService
{
    @FormUrlEncoded
    @POST("HuntersAndFoxes/users/authorization")
    Call<UserDto> authorization(@Query("login") String login, @Field("password") String password);
}
