package ru.vago.orienteering;

import ru.vago.orienteering.config.DaggerOrienteeringComponent;
import ru.vago.orienteering.config.OrienteeringComponent;

public class OrienteeringApplicationTest extends OrienteeringApplication
{
    private OrienteeringComponentTest component;

    @Override
    public void onCreate()
    {
        super.onCreate();
        /*DaggerOrienteeringComponentTest
                .builder()
                .orienteeringModuleTest(new OrienteeringModuleTest(this))
                .build();*/
    }

    public OrienteeringComponent getOrienteeringApplication()
    {
        return component;
    }
}
