package mx.ulisesgv.project1.jardin;

import mx.ulisesgv.project1.hogar.ColorPelo;
import mx.ulisesgv.project1.hogar.Persona;

import static mx.ulisesgv.project1.hogar.Persona.saludar; //asi se puede importar un metodo estatico
import static mx.ulisesgv.project1.hogar.Persona.GENERO_MASCULINO; //Asi se importan las constantes estaticas
import static mx.ulisesgv.project1.hogar.Persona.GENERO_FEMENINO;
import static mx.ulisesgv.project1.hogar.ColorPelo.CAFE;

public class EjemploPaquetes {
    public static void main(String[] args) {
        //asi podemos crear un objeto o instanciar la clase persona que esta en otro paquete sin usar import
        /*mx.ulisesgv.project1.hogar.Persona p = new mx.ulisesgv.project1.hogar.Persona();
        p.nombre = "Ulises";

        System.out.println(p.nombre);

         */

        //usando import
        Persona p = new Persona();
        p.setNombre("Ulises");
        System.out.println(p.getNombre());


        Perro perro = new Perro(); //como la clase perro esta en el mismo paquete no es necesario importar
        perro.nombre = "Caramelo";
        perro.raza = "Pitbull";

        String jugando = perro.jugar(p);

        System.out.println("Jugando " + jugando);

        //String saludo = Persona.saludar(); //asi se llamaria al metodo normalmente
        String saludo  = saludar(); // lo podemos llamar asi porque immportamos el metodo estatico

        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;

        //usando enum
        p.setColorPelo(CAFE);

    }
}
