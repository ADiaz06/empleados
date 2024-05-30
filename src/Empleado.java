abstract class Empleado {
    private String nombre;
    private String numeroIdentificacion;
    public Empleado(String nombre, String numeroIdentificación) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificación;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNumeroIdentificación() {
        return numeroIdentificacion;
    }
    //Método abstracto
    public abstract double calcularSalario();
}
