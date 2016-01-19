package ru.vago.orienteering;

import javax.inject.Singleton;

import dagger.Component;
import ru.vago.orienteering.config.OrienteeringComponent;

@Singleton
@Component(modules = {OrienteeringComponentTest.class})
public interface OrienteeringComponentTest extends OrienteeringComponent
{

}
