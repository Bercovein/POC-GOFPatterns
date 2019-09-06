package factoryMethod;

import interfaces.IAtacar;
import interfaces.IDefender;
import interfaces.IMoverse;
import model.Guerrero;
import model.Personaje;

public class FabricaGuerrero implements FabricaPersonaje{

    @Override
    public Personaje crearPersonaje(String nombre,IAtacar atacar, IDefender defender, IMoverse moverse) {
        return new Guerrero(nombre,atacar,defender,moverse);
    }
}
