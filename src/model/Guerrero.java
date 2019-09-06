package model;

import interfaces.IAtacar;
import interfaces.IDefender;
import interfaces.IMoverse;

public class Guerrero extends Personaje{

    public Guerrero(String nombre, IAtacar atacar, IDefender defender, IMoverse moverse) {
        super(nombre,atacar, defender, moverse);
    }

    @Override
    protected void entrenar() {
        System.out.println("Guerrero esta entrenando con hacha a dos manos");
    }
}
