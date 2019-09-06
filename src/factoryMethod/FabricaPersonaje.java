package factoryMethod;

import interfaces.IAtacar;
import interfaces.IDefender;
import interfaces.IMoverse;
import model.Personaje;

public interface FabricaPersonaje {

    Personaje crearPersonaje(String nombre,IAtacar atacar, IDefender defender, IMoverse moverse);
}
