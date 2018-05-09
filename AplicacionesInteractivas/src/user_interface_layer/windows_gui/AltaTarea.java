package user_interface_layer.windows_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AltaTarea extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtLatitud;
	private JTextField txtLongitud;
	private JTextField txtDdmmaaaa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaTarea frame = new AltaTarea();
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
	public AltaTarea() {
		setTitle("AGREGAR TAREA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 273, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Equipo");
		lblNewLabel.setBounds(10, 32, 47, 17);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(150, 30, 86, 20);
		contentPane.add(comboBox);
		
		JLabel lblAgregarTarea = new JLabel("NUEVA TAREA");
		lblAgregarTarea.setBounds(10, 7, 103, 14);
		contentPane.add(lblAgregarTarea);
		
		JLabel lblProductoAUsar = new JLabel("Producto a usar");
		lblProductoAUsar.setBounds(10, 66, 103, 14);
		contentPane.add(lblProductoAUsar);
		
		textField = new JTextField();
		textField.setBounds(150, 63, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLocalizacin = new JLabel("Localizaci\u00F3n");
		lblLocalizacin.setBounds(10, 106, 103, 14);
		contentPane.add(lblLocalizacin);
		
		txtLatitud = new JTextField();
		txtLatitud.setText("LATITUD");
		txtLatitud.setBounds(150, 103, 86, 20);
		contentPane.add(txtLatitud);
		txtLatitud.setColumns(10);
		
		txtLongitud = new JTextField();
		txtLongitud.setText("LONGITUD");
		txtLongitud.setBounds(150, 125, 86, 20);
		contentPane.add(txtLongitud);
		txtLongitud.setColumns(10);
		
		JLabel lblEmpleado = new JLabel("Empleado");
		lblEmpleado.setBounds(10, 159, 83, 14);
		contentPane.add(lblEmpleado);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(150, 156, 86, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de vencimiento");
		lblNewLabel_1.setBounds(10, 194, 141, 14);
		contentPane.add(lblNewLabel_1);
		
		txtDdmmaaaa = new JTextField();
		txtDdmmaaaa.setText("DD/MM/AAAA");
		txtDdmmaaaa.setBounds(150, 191, 86, 20);
		contentPane.add(txtDdmmaaaa);
		txtDdmmaaaa.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(147, 239, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(24, 239, 89, 23);
		contentPane.add(btnCancelar);
	}
}
