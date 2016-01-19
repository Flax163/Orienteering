package ru.vago.orienteering;

import android.app.Application;

import ru.vago.orienteering.config.DaggerOrienteeringComponent;
import ru.vago.orienteering.config.OrienteeringComponent;
import ru.vago.orienteering.config.OrienteeringModule;

public class OrienteeringApplication extends Application
{
    private OrienteeringComponent component;

    @Override
    public void onCreate()
    {
        super.onCreate();

        component = DaggerOrienteeringComponent
                .builder()
                .orienteeringModule(new OrienteeringModule(this))
                .build();
    }

    public OrienteeringComponent getOrienteeringApplication()
    {
        return component;
    }
}
