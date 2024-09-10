package Alumnos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmAlumnos extends JFrame{
    private JTextField txtNombre;
    private JTextField txtAPaterno;
    private JTextField txtAMaterno;
    private JTextField txtCorreo;
    private JTextField txtTelefono;
    private JComboBox cbSexo;
    private JCheckBox chbDiscapacidad;
    private JButton Aceptarbutton;
    private JButton cancelarButton;
    private JPanel pnlPrincipal;
    private JTextField txtCurp;
    private BotonGuardarListener botonGuardarListener;

    public frmAlumnos() {
        setTitle("Alumnos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlPrincipal);
        setLocationRelativeTo(null);
        pack();
        PoblarCombobox();
        Aceptarbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviardatos();
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrar();
            }
        });
    }
    private void enviardatos(){
        String nombre = txtNombre.getText();
        String apaterno = txtAPaterno.getText();
        String amaterno = txtAMaterno.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String sexo = cbSexo.getSelectedItem().toString();
        String curp = txtCurp.getText();
        boolean discapacidad = chbDiscapacidad.isSelected();

        Alumno dato = new Alumno(nombre, apaterno, amaterno, curp, discapacidad, correo, telefono, sexo);

        if (botonGuardarListener != null) {
            botonGuardarListener.guardando(dato);
        }
        Borrar();
    }
    public void setbotonguardarlistener(BotonGuardarListener Listener) {
        this.botonGuardarListener = Listener;
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
        }
    }
}
