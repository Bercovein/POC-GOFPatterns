package factoryMethod;


import interfaces.IAtacar;
import interfaces.IDefender;
import interfaces.IMoverse;
import model.Mago;
import model.Personaje;

public class FabricaMago implements FabricaPersonaje{

    @Override
    public Personaje crearPersonaje(String nombre, IAtacar atacar, IDefender defender, IMoverse moverse) {
        return new Mago(nombre,atacar,defender, moverse);
    }
}
