package model;

import interfaces.IAtacar;
import interfaces.IDefender;
import interfaces.IMoverse;

public class Picaro extends Personaje{

    public Picaro(String nombre,IAtacar atacar, IDefender defender, IMoverse moverse) {
        super(nombre,atacar, defender, moverse);
    }

    @Override
    protected void entrenar() {
        System.out.println("Picaro esta entrenando sigilo");
    }
}
