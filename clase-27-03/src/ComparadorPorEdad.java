import java.util.Comparator;

public class ComparadorPorPromedio implements Comparator<Estudiante> {


    @Override
    public float compare(Estudiante alumno1, Estudiante alumno2) {
        return alumno1.getPromedioGeneral() - alumno2.getPromedioGeneral();
    }
}
