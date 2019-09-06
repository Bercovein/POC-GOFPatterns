package model;

import interfaces.IAtacar;
import interfaces.IDefender;
import interfaces.IMoverse;


public abstract class Personaje {


    private String nombre;
    private IAtacar atacar;
    private IDefender defender;
    private IMoverse moverse;


    public Personaje(String nombre,IAtacar atacar, IDefender defender, IMoverse moverse) {
        this.nombre = nombre;
        this.atacar = atacar;
        this.defender = defender;
        this.moverse = moverse;
    }

    public void setAtacar(IAtacar atacar){
        this.atacar = atacar;
    }

    public void setDefender(IDefender defender){
        this.defender = defender;
    }

    public void setMoverse(IMoverse moverse){
        this.moverse = moverse;
    }

    public IAtacar getAtacar() {
        return atacar;
    }

    public IDefender getDefender() {
        return defender;
    }

    public IMoverse getMoverse() {
        return moverse;
    }

    public IDefender getDefensa(){
        return this.defender;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract protected void entrenar();
}
