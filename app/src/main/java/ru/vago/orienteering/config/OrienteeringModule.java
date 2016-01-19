package ru.vago.orienteering.config;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.JacksonConverterFactory;
import retrofit.Retrofit;
import ru.vago.orienteering.OrienteeringApplication;
import ru.vago.orienteering.service.UserService;
import static ru.vago.orienteering.Constants.SERVICE_REST_URL;

@Module
public class OrienteeringModule
{
    private final OrienteeringApplication application;

    public OrienteeringModule(@NonNull final OrienteeringApplication application)
    {
        this.application = application;
    }

    @Provides
    @Singleton
    @NonNull
    public UserService getUserService()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(SERVICE_REST_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return retrofit.create(UserService.class);
    }

}
