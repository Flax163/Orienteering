package ru.vago.orienteering.config;

import javax.inject.Singleton;

import dagger.Component;
import ru.vago.orienteering.activity.LoginActivity;
import ru.vago.orienteering.service.UserService;

@Singleton
@Component(modules = {OrienteeringModule.class})
public interface OrienteeringComponent
{
    void inject(LoginActivity loginActivity);

    UserService getUserService();
}
