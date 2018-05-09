package user_interface_layer.windows_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ModificarTarea extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtLatitud;
	private JTextField txtLongitud;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificarTarea frame = new ModificarTarea();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ModificarTarea() {
		setTitle("MODIFICAR TAREA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 243, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(10, 47, 46, 14);
		contentPane.add(lblEquipo);
		
		JLabel lblProductoAUsar = new JLabel("Producto a usar");
		lblProductoAUsar.setBounds(10, 78, 97, 14);
		contentPane.add(lblProductoAUsar);
		
		JLabel lblLocalizacin = new JLabel("Localizaci\u00F3n");
		lblLocalizacin.setBounds(10, 112, 79, 14);
		contentPane.add(lblLocalizacin);
		
		JLabel lblEmpleado = new JLabel("Empleado");
		lblEmpleado.setBounds(10, 180, 79, 14);
		contentPane.add(lblEmpleado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(111, 177, 86, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(111, 44, 86, 20);
		contentPane.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(111, 75, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtLatitud = new JTextField();
		txtLatitud.setText("LATITUD");
		txtLatitud.setBounds(111, 109, 86, 20);
		contentPane.add(txtLatitud);
		txtLatitud.setColumns(10);
		
		txtLongitud = new JTextField();
		txtLongitud.setText("LONGITUD");
		txtLongitud.setBounds(111, 135, 86, 20);
		contentPane.add(txtLongitud);
		txtLongitud.setColumns(10);
		
		JLabel lblModificarTarea = new JLabel("MODIFICAR TAREA");
		lblModificarTarea.setBounds(10, 11, 129, 14);
		contentPane.add(lblModificarTarea);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(108, 227, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 227, 89, 23);
		contentPane.add(btnCancelar);
	}

}
