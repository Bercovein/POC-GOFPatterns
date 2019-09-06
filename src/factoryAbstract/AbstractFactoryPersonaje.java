package factoryAbstract;


import model.Personaje;

public interface AbstractFactoryPersonaje {

    Personaje crearMago(String nombre);

    Personaje crearPicaro(String nombre);

    Personaje crearGuerrero(String nombre);
}