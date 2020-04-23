/**
 * 
 * @author ghost
 *
 */
public class Persona {
    private String nombreCompleto;
    private int edad;

    public Persona() {
    }
    /**
     * 
     * @param nombreCompleto
     * @param edad
     * son los parametros que se leeran de la clase Principal que haran que guarde el nombre y edad del alumno que ingresara sus calificaciones
     */
    public Persona(String nombreCompleto, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }
    //getters y setters

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}