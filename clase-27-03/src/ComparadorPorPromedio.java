import java.util.Comparator;

public class ComparadorPorPromedio implements Comparator<Estudiante> {


    @Override
    public int compare(Estudiante alumno1, Estudiante alumno2) {
        return (int) (alumno1.getPromedioGeneral() - alumno2.getPromedioGeneral());
    }
}
