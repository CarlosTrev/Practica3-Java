package Alumnos;

public class Alumno {
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String telefono;
    private String correo;
    private String discapacidad;
    private String curp;
    private int edad;
    private String estadonacimiento;
    public Alumno(String nombre, String apaterno, String amaterno, String curp, String discapacidad, String correo, String telefono) {
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.curp = curp;
        this.discapacidad = discapacidad;
        this.correo = correo;
        this.telefono = telefono;
    }

}
