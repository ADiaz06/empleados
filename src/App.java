public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Empleado[] empleados = new Empleado[4];
        empleados[0] = new EmpleadoTiempoCompleto("Juan Pérez", "123", 48000.0);
        empleados[1] = new EmpleadoMedioTiempo("María López", "456", 15.0, 20);
        empleados[2] = new EmpleadoTiempoCompleto("Roberto Huembes", "789", 50000.0);
        empleados[3] = new EmpleadoMedioTiempo("José Reyes", "482", 20.0, 30);
        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre() + ", salario mensual: $" + empleado.calcularSalario());
        }
    }
}
