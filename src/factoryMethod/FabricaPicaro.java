package factoryMethod;

import interfaces.IAtacar;
import interfaces.IDefender;
import interfaces.IMoverse;
import model.Picaro;
import model.Personaje;

public class FabricaPicaro implements FabricaPersonaje{

    @Override
    public Personaje crearPersonaje(String nombre,IAtacar atacar, IDefender defender, IMoverse moverse) {
        return new Picaro(nombre,atacar,defender, moverse);
    }

}
