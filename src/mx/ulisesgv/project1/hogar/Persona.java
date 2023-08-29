package mx.ulisesgv.project1.hogar;

public class Persona {
    private String nombre;
    private String apellido;
    private ColorPelo colorPelo;
    public static final String GENERO_MASCULINO = "Hombre";
    public static final String GENERO_FEMENINO = "Mujer";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String echarleUnPalo(){
        return "Echale un palito al perro ;)";
    }

    public static String saludar(){
        return "Que tranza banda que pedo carnal";
    }
}
