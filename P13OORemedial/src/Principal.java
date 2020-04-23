import java.util.Scanner;
/**
 * 
 * @author ghost
 *
 */
public class Principal {
    public static void main(String[] args) {
    	/**
    	 * se mando a llamar la clase de alumno para poder guardar todo lo que se lello por teclado en el metodo de alumno una vez ingresado el nombre edad y las calificaciones
    	 * esto se repetira con el alumno dos
    	 * una vez finalizado el proceso de lectura solamente se mandara a llamar el metodo de promedio he imprimirlo
    	 */
    	//DE
        Alumno alumnos[] = new Alumno[2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta el nombre completo del alumno 1");
        String nombre1 = sc.nextLine();

        System.out.println("Inserta edad para el alumno 1");
        int edad1 = sc.nextInt();

        System.out.println("Inserta calificacion 1 para el alumno 1");
        int cal1 = sc.nextInt();
        System.out.println("Inserta calificacion 2 para el alumno 1");
        int cal2 = sc.nextInt();
        System.out.println("Inserta calificacion 3 para el alumno 1");
        int cal3 = sc.nextInt();
        System.out.println("Inserta calificacion 4 para el alumno 1");
        int cal4 = sc.nextInt();
        System.out.println("Inserta calificacion 5 para el alumno 1");
        int cal5 = sc.nextInt();

        Alumno alumno1 = new Alumno(nombre1, edad1, cal1, cal2, cal3, cal4, cal5);
        //DE
        alumnos[0] = alumno1;

        System.out.println("Inserta el nombre completo del alumno 2");
        String Nombre2 = sc.nextLine();
        Nombre2 = sc.nextLine();

        System.out.println("Inserta edad para el alumno 2");
        int edad2 = sc.nextInt();

        System.out.println("Inserta calificacion 1 para el alumno 2");
        int calf02 = sc.nextInt();
        System.out.println("Inserta calificacion 2 para el alumno 2");
        int calf12 = sc.nextInt();
        System.out.println("Inserta calificacion 3 para el alumno 2");
        int calf22 = sc.nextInt();
        System.out.println("Inserta calificacion 4 para el alumno 2");
        int calf32 = sc.nextInt();
        System.out.println("Inserta calificacion 5 para el alumno 2");
        int calf42 = sc.nextInt();

        Alumno alumno2 = new Alumno(Nombre2, edad2, calf02, calf12, calf22, calf32, calf42);
        //DE
        alumnos[1] = alumno2;

        System.out.println("Promedio del alumno 1: " + alumno1.promedio());
        System.out.println("Promedio del alumno 2: " + alumno2.promedio());
        System.out.println();
        System.out.println();
        /*
         * se medio explico en la clase alumno
         */
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("información del alumno " + (i + 1));
            System.out.println(Alumno.informacion(alumnos[i]));
            System.out.println("Promedio del alumno " + (i + 1));
            System.out.println(alumnos[i].promedio());
        }

    }
}