package ru.vago.orienteering;

import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.vago.orienteering.service.UserService;

@Module
public class OrienteeringModuleTest
{
    private final OrienteeringApplicationTest applicationTest;

    public OrienteeringModuleTest(@NonNull OrienteeringApplicationTest applicationTest)
    {
        this.applicationTest = applicationTest;
    }

    @Provides
    @Singleton
    @NonNull
    public UserService getUserService()
    {
        return null;
    }
}