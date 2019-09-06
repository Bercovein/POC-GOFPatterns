import implementacion.atacar.ImpAtacarAcha;
import implementacion.defender.ImpDefenderEscudo;

import implementacion.moverse.ImpMoverseCaminar;
import decorador.Coraza;
import decorador.Invisibilidad;
import factoryMethod.FabricaMago;
import factoryMethod.FabricaPersonaje;
import model.Personaje;

public class main {

    public static void main(String[] args) {

        FabricaPersonaje fabMag = new FabricaMago();

        Personaje mago = fabMag.crearPersonaje("Roberto",new ImpAtacarAcha(),new ImpDefenderEscudo(),new ImpMoverseCaminar());
        System.out.println(mago.getDefensa().defender());

        mago = new Coraza(mago);
        System.out.println(mago.getDefensa().defender() );

        mago = new Invisibilidad(mago);
        System.out.println(mago.getDefensa().defender() );

    }
}
