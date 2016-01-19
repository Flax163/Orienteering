package ru.vago.orienteering.presenter;

import android.support.annotation.NonNull;

import javax.inject.Inject;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import ru.vago.orienteering.activity.LoginActivity;
import ru.vago.orienteering.dto.UserDto;
import ru.vago.orienteering.service.UserService;

public class LoginPresenter
{
    private LoginActivity activity;
    private UserService userService;

    @Inject
    public LoginPresenter(@NonNull UserService userService)
    {
        this.userService = userService;
    }

    public void setLoginActivity(@NonNull LoginActivity activity)
    {
        this.activity = activity;
    }

    public LoginPresenter(@NonNull String login, @NonNull String password)
    {
        userService.authorization(login, password).enqueue(new Callback<UserDto>()
        {
            @Override
            public void onResponse(Response<UserDto> response, Retrofit retrofit)
            {

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }

    public void loginUser()
    {

    }

}
