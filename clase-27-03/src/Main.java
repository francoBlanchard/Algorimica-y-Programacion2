import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        // -----------------------------
        // Creo listas de estudiantes
        // -----------------------------

        // Creo un arreglo para guardar estudiantes y ordenarlos luego por nombre
        Estudiante[] estudiantesPorNombre = new Estudiante[4];

        // Creo un arreglo para guardar los mismos estudiantes pero los voy a ordenar por promedio
        Estudiante[] estudiantesPorPromedio = new Estudiante[4];

        //----------------------------------------------------------------------------------------

        // ---------------------------------------------------
        // Creo estudiantes y los agrego al arreglo por nombre
        // ---------------------------------------------------

        //creo estudiantes y los agrego al arreglo de nombres
        estudiantesPorNombre[0]  = new Estudiante("franco", "blanchard",2020, 5.5f);
        estudiantesPorNombre[1] = new Estudiante("carlos", "blanchard",2023, 4.2f);
        estudiantesPorNombre[2]  = new Estudiante("juen", "chavarria",2018, 8.6f);
        estudiantesPorNombre[3]  = new Estudiante("david", "lencina",2000,8.6f);

        //creo estudiantes y los agrego al arreglo de promedio
        estudiantesPorPromedio[0]  = new Estudiante("franco", "blanchard",2020, 5.5f);
        estudiantesPorPromedio[1] = new Estudiante("carlos", "blanchard",2023, 4.2f);
        estudiantesPorPromedio[2]  = new Estudiante("juen", "chavarria",2018, 8.6f);
        estudiantesPorPromedio[3]  = new Estudiante("david", "lencina",2000,8.6f);

        //----------------------------------------------------------------------------------------

        // ----------------------------
        // Creo comparador personalizado
        // ----------------------------
        // En Java, para ordenar objetos con un criterio propio (en este caso, por promedio), se implementa
        // la interfaz Comparator. El objeto "comparador" define cómo comparar dos estudiantes según su promedio.
        ComparadorPorPromedio comparador = new ComparadorPorPromedio();

        // ---------------------------------------------------------------------------------------
        // Ordeno arreglo por promedio (usando el comparador personalizado)
        // -------------------------------------------------------------

        // Aquí se utiliza el comparador creado antes, que define una comparación por promedioGeneral.
        // Este es un ejemplo típico de ordenamiento por un "criterio secundario" diferente al natural.
        //creo compador segun criterio
        Arrays.sort(estudiantesPorNombre);
        Arrays.sort(estudiantesPorPromedio, comparador);

        // ---------------------------------------
        // Recorro el arreglo ordenado por nombre
        // ---------------------------------------
        // Este recorrido muestra cómo quedaron ordenados los estudiantes al aplicar compareTo() por nombre.
        //recorro el arreglo ordenado por nombre y muestro

        for(Estudiante estudiantes : estudiantesPorNombre){
            System.out.println("nombre: " + estudiantes.getNombre());
        }

        System.out.println(" ");

        //recorro el arreglo ordenado por nombre y muestro
        for(Estudiante estudiantes : estudiantesPorPromedio){
            System.out.println("promedio: " + estudiantes.getPromedioGeneral());
        }

    }
}