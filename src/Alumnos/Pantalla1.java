package Alumnos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla1 {
    private JTextField txtNombre;
    private JTextField txtAPaterno;
    private JTextField txtAMaterno;
    private JTextField txtCorreo;
    private JTextField txtTelefono;
    private JComboBox cbSexo;
    private JCheckBox chbDiscapacidad;
    private JButton Aceptarbutton;
    private JButton cancelarButton;
    private JPanel Ventana1;
    private JTextField txtCurp;

    public Pantalla1() {
        Aceptarbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrar();
            }
        });
    }
    private void Borrar()
    {
        txtNombre.setText("");
        txtAPaterno.setText("");
        txtAMaterno.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        cbSexo.setSelectedIndex(0);
        chbDiscapacidad.setSelected(false);
        txtCurp.setText("");
    }
    private void PoblarCombobox()
    {
        DefaultComboBoxModel <Genero> comboBoxModel = (DefaultComboBoxModel<Genero>)cbSexo.getModel();

        for (Genero genero : Genero.values()){
            comboBoxModel.addElement(genero);
            //prueba1
        }
    }
}
