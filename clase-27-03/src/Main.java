import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        //creo lista
        Estudiante[] estudiantes = new Estudiante[4];

        //creo estudiantes
        estudiantes[0]  = new Estudiante("franco", "blanchard",2020, 5.5f);
        estudiantes[1] = new Estudiante("carlos", "blanchard",2023, 4.2f);
        estudiantes[2]  = new Estudiante("juen", "chavarria",2018, 8.6f);
        estudiantes[3]  = new Estudiante("david", "lencina",2000,8.6f);

        //creo compador segun criterio

        Arrays.sort(estudiantes);


    }
}