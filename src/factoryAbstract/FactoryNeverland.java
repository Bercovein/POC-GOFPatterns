package factoryAbstract;

import implementacion.atacar.ImpAtacarAcha;
import implementacion.atacar.ImpAtacarArco;
import implementacion.atacar.ImpAtacarEspada;
import implementacion.defender.ImpDefenderEscudo;
import implementacion.defender.ImpDefenderNo;
import implementacion.moverse.ImpMoverseCaminar;
import implementacion.moverse.ImpMoverseCorrer;
import implementacion.moverse.ImpMoverseVolar;
import model.Guerrero;
import model.Mago;
import model.Personaje;
import model.Picaro;

public class FactoryNeverland implements AbstractFactoryPersonaje {

    public Personaje crearMago(String nombre){
        return new Mago(nombre,new ImpAtacarEspada(),new ImpDefenderEscudo(), new ImpMoverseVolar());
    }
    public Personaje crearPicaro(String nombre)
    {
        return new Picaro(nombre, new ImpAtacarEspada(),new ImpDefenderNo(), new ImpMoverseCorrer());
    }
    public Personaje crearGuerrero(String nombre){
        return new Guerrero(nombre, new ImpAtacarAcha(), new ImpDefenderEscudo(), new ImpMoverseCaminar());
    }



}
