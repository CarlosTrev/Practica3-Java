package Alumnos;
import java.time.LocalDate;
import java.time.Period;


public class Alumno {
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String telefono;
    private String correo;
    private boolean discapacidad;
    private String curp;
    private int edad;
    private String estadonacimiento;
    private String sexo;

    public Alumno(String nombre, String apaterno, String amaterno, String curp, boolean discapacidad, String correo, String telefono, String sexo) {
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.curp = curp;
        this.discapacidad = discapacidad;
        this.correo = correo;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApaterno() {
        return apaterno;
    }
    public String getAmaterno() {
        return amaterno;
    }
    public String getCurp() {
        return curp;
    }
    public boolean getDiscapacidad() {
        return discapacidad;
    }
    public String getCorreo() {
        return correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getSexo() {
        return sexo;
    }
    public String discapacidad() {
        if (discapacidad) {
            return "Si";
        }
        else {
            return "No";
        }

    }
    public int getEdad() {
        return calcularEdadDesdeCurp(this.curp);
    }

    private int calcularEdadDesdeCurp(String curp) {
        int anio = Integer.parseInt(curp.substring(4, 6));
        int mes = Integer.parseInt(curp.substring(6, 8));
        int dia = Integer.parseInt(curp.substring(8, 10));
        if (anio <= LocalDate.now().getYear() % 100) {
            anio += 2000;
        } else {
            anio += 1900;
        }

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
}
