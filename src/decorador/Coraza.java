package decorador;

import interfaces.IDefender;
import model.Personaje;

public class Coraza extends PersonajeDecorador {

    public Coraza(Personaje personaje) {
        super(personaje.getNombre(),personaje.getAtacar(),personaje.getDefensa(),personaje.getMoverse());
    }


    @Override
    public IDefender getDefensa() {
        return ()-> super.getDefensa().defender() + "(Coraza Anti-daño)";
    }

    @Override
    protected void entrenar() {

    }
}
