package Alumnos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frmAlumnos pantalla = new frmAlumnos();
                pantalla.setVisible(true);

                pantalla.setbotonguardarlistener(new BotonGuardarListener() {
                    @Override
                    public void guardando(Alumno persona) {
                        System.out.println("Nombre: " + persona.getNombre());
                        System.out.println("A. paterno: " + persona.getApaterno());
                        System.out.println("A. materno: " + persona.getAmaterno());
                        System.out.println("Curp: "+ persona.getCurp());
                        System.out.println("Sexo: " + persona.getSexo());
                        System.out.println("Correo: " + persona.getCorreo());
                        System.out.println("Telefono: " + persona.getTelefono());
                        System.out.println("Discapacidad: " + persona.discapacidad());
                        System.out.println("Edad: " + persona.getEdad());
                    }
                });
            }
        });
    }
}
