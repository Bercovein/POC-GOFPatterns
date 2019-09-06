package decorador;

import interfaces.IDefender;
import model.Personaje;

public class Invisibilidad extends PersonajeDecorador{

    public Invisibilidad(Personaje personaje) {
        super(personaje.getNombre(),personaje.getAtacar(),personaje.getDefensa(),personaje.getMoverse());
    }

    @Override
    public IDefender getDefensa() {
        return () -> super.getDefensa().defender() + "(INVISIBLE)";
    }

    @Override
    protected void entrenar() {

    }
}
