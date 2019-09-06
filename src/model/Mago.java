package model;

import interfaces.IAtacar;
import interfaces.IDefender;
import interfaces.IMoverse;

public class Mago extends Personaje{

    public Mago(String nombre,IAtacar atacar, IDefender defender, IMoverse moverse) {
        super(nombre,atacar, defender, moverse);
    }

    @Override
    protected void entrenar() {
        System.out.println("Mago esta entrenando bolas de fuego");
    }
}
