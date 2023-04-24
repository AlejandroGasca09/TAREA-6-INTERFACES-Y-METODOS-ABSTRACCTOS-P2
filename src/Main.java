public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Juan");
        ada.setArte("pintura");
        ada.setDeporte("basket ball");
        System.out.println(ada);
        ada.ensayar("Oleo");
        ada.entrenar();
        ada.presentarCompetencia("Esta compitiendo en la Fes ");
    }
}
