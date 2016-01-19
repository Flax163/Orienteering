package ru.vago.orienteering.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import ru.vago.orienteering.OrienteeringApplication;
import ru.vago.orienteering.service.UserService;
import ru.vago.orienteering.dto.UserDto;
import ru.vago.spotorientir.R;

public class LoginActivity extends Activity
{
    @Bind(R.id.login_edit_text)
    EditText loginView;
    @Bind(R.id.password_edit_text)
    EditText passwordView;

    @Inject
    UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ((OrienteeringApplication)getApplication()).getOrienteeringApplication().inject(this);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.sign_in)
    public void signInClick()
    {
        userService.authorization("vago", "123456").enqueue(new Callback<UserDto>()
        {
            @Override
            public void onResponse(Response<UserDto> response, Retrofit retrofit)
            {

            }

            @Override
            public void onFailure(Throwable t)
            {

            }
        });
    }
}

