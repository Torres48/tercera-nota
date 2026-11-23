package unidad3;

class BaseEmpleado {
    private String nombre;
    private double salario;

    public BaseEmpleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularPagoTotal() {
        return salario;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}

class Gerente extends BaseEmpleado {
    private double bonificacion;

    public Gerente(String nombre, double salario, double bonificacion) {
        super(nombre, salario);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularPagoTotal() {
        return getSalario() + bonificacion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bonificacion: $" + bonificacion);
        System.out.println("Salario Total: $" + calcularPagoTotal());
    }
}

class Desarrollador extends BaseEmpleado {
    private double bonoProyecto;

    public Desarrollador(String nombre, double salario, double bonoProyecto) {
        super(nombre, salario);
        this.bonoProyecto = bonoProyecto;
    }

    @Override
    public double calcularPagoTotal() {
        return getSalario() + bonoProyecto;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bono proyecto: $" + bonoProyecto);
        System.out.println("Salario Total: $" + calcularPagoTotal());
    }
}

public class Empleado {
    public static void main(String[] args) throws Exception {
        BaseEmpleado empleado1 = new BaseEmpleado("Carlos", 2000);
        BaseEmpleado gerente1 = new Gerente("Ana", 5000, 1500);
        BaseEmpleado dev1 = new Desarrollador("Luis", 3000, 800);

        System.out.println("Datos del Empleado:");
        empleado1.mostrarInfo();

        System.out.println("\nDatos del Gerente:");
        gerente1.mostrarInfo();

        System.out.println("\nDatos del Desarrollador:");
        dev1.mostrarInfo();
    }
}