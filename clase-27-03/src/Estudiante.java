public class Estudiante implements Comparable<Estudiante>{

    //atributos
    private String nombre;
    private String apellido;
    private int anioIngreso;
    private float promedioGeneral;

    //cosntructor por defecto
    public Estudiante() {
        this.nombre = "sin-nombre";
        this.apellido = "sin-nombre";
        this.anioIngreso = 0;
        this.promedioGeneral = 0;
    }

    //constructor por parametros
    public Estudiante(String nombre, String apellido, int anioIngreso, float promedioGeneral) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
        this.promedioGeneral = promedioGeneral;
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public double getPromedioGeneral() {
        return promedioGeneral;
    }

    @Override
    public int compareTo(Estudiante otroAlumno) {
        return this.nombre.compareTo(otroAlumno.nombre);
    }


