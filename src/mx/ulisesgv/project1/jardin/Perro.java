package mx.ulisesgv.project1.jardin;

import mx.ulisesgv.project1.hogar.Persona;

public class Perro {
    protected String nombre; // con protected podemos acceder a esta variable desde el mismo paquete y tambien si la clase hereda de esta clase
    String raza; //con el default se puede acceder a esta variable solo si las clases estan detro del mismo paquete

    String jugar(Persona persona){
        return persona.echarleUnPalo();
    }
}
