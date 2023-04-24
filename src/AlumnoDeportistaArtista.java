public class AlumnoDeportistaArtista extends Alumno implements Deportista,Artista{
    private int IdActividad;
    private String deporte;
    private String arte;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(String nombre, int edad, int numerCuenta, String carrera, double promedio, int idActividad, String deporte, String arte) {
        super(nombre, edad, numerCuenta, carrera, promedio);
        IdActividad = idActividad;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdActividad() {
        return IdActividad;
    }

    public void setIdActividad(int idActividad) {
        IdActividad = idActividad;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AlumnoDeportistaArtista{" +
                "IdActividad=" + IdActividad +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int ensayar(String disiplina) {
        System.out.println("El alumno esta ensayando " + this.arte);
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre() + "esta presentado su obra...");
        return false;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + " esta entrenado... " + deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre() + " esta en compentecia del deporte " + deporte);
        return false;
    }
}


