package decorador;

import interfaces.IAtacar;
import interfaces.IDefender;
import interfaces.IMoverse;
import model.Personaje;

public abstract class PersonajeDecorador extends Personaje
{
    private Personaje personaje;

    public PersonajeDecorador(String nombre, IAtacar atacar, IDefender defender, IMoverse moverse) {
        super(nombre, atacar, defender, moverse);
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
}
