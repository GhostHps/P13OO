/**
 * @author ghost
 *
 */
public class Alumno extends Persona {
    private int calificaciones[] = new int[5];

    public Alumno() {
    }
    /**
     * 
     * @param full_name
     * @param age
     * @param cal1
     * @param cal2
     * @param cal3
     * @param cal4
     * @param cal5
     * se lee todo eso para guardar todo en los get conforme cada calificacion ingresada en la principal
     */
    public Alumno(String full_name, int age, int cal1, int cal2, int cal3, int cal4, int cal5) {
        super(full_name, age);
        this.calificaciones[0] = cal1;
        this.calificaciones[1] = cal2;
        this.calificaciones[2] = cal3;
        this.calificaciones[3] = cal4;
        this.calificaciones[4] = cal5;
    }
    /**
     * getters y setters
     */
    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }
    /**
     * se saca el promedio del alumno, de sus 5 calificaciones
     * entra al ciclo para que valla guardando cada calificacion en el objeto
     * una vez que sale del ciclo se hace la operacion asignada para sacar el promedio
     * @return retornamos la variable del promedio
     */
    public float promedio() {
        int suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma + calificaciones[i];
        }
        float promedio = (float) suma / (float) calificaciones.length;

        return promedio;
    }
    //DE
    /**
     * 
     * @param a es lo que se le de la clase principal para mostrar la informacion completa del alumno
     * 
     * @return regresas la vaiable donde guardaste toda la informacion
     */
    public static String informacion(Alumno a) {
        String informacion = "\n---Información del alumno---" +
                "\nNombre: " + a.getNombreCompleto() +
                "\nEdad: " + a.getEdad();

        for (int i = 0; i < a.getCalificaciones().length; i++) {
            informacion = informacion + "\nCalificacion " + (i + 1) + ": " + a.getCalificaciones()[i];
        }

        return informacion;
    }
}
