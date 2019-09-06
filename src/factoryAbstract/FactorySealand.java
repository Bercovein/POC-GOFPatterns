package factoryAbstract;

import implementacion.atacar.ImpAtacarAcha;
import implementacion.atacar.ImpAtacarArco;
import implementacion.atacar.ImpAtacarEspada;
import implementacion.defender.ImpDefenderEspada;
import implementacion.defender.ImpDefenderNo;
import implementacion.moverse.ImpMoverseNadar;
import model.Guerrero;
import model.Mago;
import model.Personaje;
import model.Picaro;

public class FactorySealand implements AbstractFactoryPersonaje {

    public Personaje crearMago(String nombre){
        return new Mago(nombre,new ImpAtacarArco(),new ImpDefenderNo(), new ImpMoverseNadar());
    }
    public Personaje crearPicaro(String nombre)
    {
        return new Picaro(nombre, new ImpAtacarEspada(),new ImpDefenderEspada(), new ImpMoverseNadar());
    }
    public Personaje crearGuerrero(String nombre){
        return new Guerrero(nombre, new ImpAtacarAcha(), new ImpDefenderEspada(), new ImpMoverseNadar());
    }

}
