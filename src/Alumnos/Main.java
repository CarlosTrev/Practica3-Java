package Alumnos;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frmAlumnos pantalla = new frmAlumnos();
                pantalla.setVisible(true);

                pantalla.setbotonguardarlistener(new BotonGuardarListener() {
                    @Override
                    public void guardando(Alumno persona) {
                        System.out.println(persona.getDatos());
                        String contenido= persona.getDatos();
                        Path path = Paths.get("alumnos.txt");

                        try (PrintWriter pw = new PrintWriter(new FileWriter(path.toFile(), true))) {
                            pw.println(contenido);
                            JOptionPane.showMessageDialog(null, "Lista de alumnos actualizada con exito");
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Error al guardar el alumno" + e.getMessage());
                        }
                    }
                });
            }
        });
    }
}
