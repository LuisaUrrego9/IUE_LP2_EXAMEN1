import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class FrmExamen extends JFrame {

    private JComboBox cmbExamen;
    private JTable tblCajaregistradora;
    String[] encabezados = new String[] { "Cantidad", "Presentacion", "Denominacion" };

    public FrmExamen() {
        setSize(400, 300);
        setTitle("Caja registradora");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblDenominacion = new JLabel("Denominacion");
        lblDenominacion.setBounds(90, 10, 100, 25);
        getContentPane().add(lblDenominacion);

        cmbExamen = new JComboBox();
        cmbExamen.setBounds(180, 10, 110, 25);
        String[] opciones = new String[] { "100000", "50000", "20000", "10000", "5000", "2000", "1000", "500", "200",
                "100", "50" };
        DefaultComboBoxModel mdlOpciones = new DefaultComboBoxModel(opciones);
        cmbExamen.setModel(mdlOpciones);
        getContentPane().add(cmbExamen);

        JButton btnActualizarexistencia = new JButton("Actualizar existencia");
        btnActualizarexistencia.setBounds(20, 35, 150, 25);
        getContentPane().add(btnActualizarexistencia);

        JTextField txtActualizarexistencia = new JTextField();
        txtActualizarexistencia.setBounds(180, 40, 70, 20);
        getContentPane().add(txtActualizarexistencia);

        JLabel lblValoraDevolver = new JLabel("Valor a Devolver");
        lblValoraDevolver.setBounds(20, 90, 100, 25);
        getContentPane().add(lblValoraDevolver);

        JTextField txtValoraDevolver = new JTextField();
        txtValoraDevolver.setBounds(120, 95, 120, 20);
        getContentPane().add(txtValoraDevolver);

        JButton btnDevolver = new JButton("Devolver");
        btnDevolver.setBounds(250, 100, 90, 25);
        getContentPane().add(btnDevolver);

        tblCajaregistradora = new JTable();
        JScrollPane spCajaregistradora = new JScrollPane(tblCajaregistradora);
        spCajaregistradora.setBounds(10, 140, 330, 100);
        getContentPane().add(spCajaregistradora);

        String[][] strCajaregistradora = new String[opciones.length][];
        DefaultTableModel dtm = new DefaultTableModel(strCajaregistradora, encabezados);
        tblCajaregistradora.setModel(dtm);

    }

}