package user_interface_layer.windows_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TareasRealizadasConAtraso extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_0;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TareasRealizadasConAtraso frame = new TareasRealizadasConAtraso();
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
	public TareasRealizadasConAtraso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTareasRealizadasCon = new JLabel("TAREAS REALIZADAS CON ATRASO");
		lblTareasRealizadasCon.setBounds(10, 11, 225, 14);
		contentPane.add(lblTareasRealizadasCon);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 36, 225, 214);
		contentPane.add(tabbedPane);
		
		table = new JTable();
		tabbedPane.addTab("ID Tarea", null, table, null);
		
		JLabel lblIdTarea = new JLabel("ID Tarea:");
		lblIdTarea.setBounds(245, 56, 86, 14);
		contentPane.add(lblIdTarea);
		
		JLabel lblFechaDeCreacin = new JLabel("Fecha de creaci\u00F3n:");
		lblFechaDeCreacin.setBounds(245, 81, 147, 14);
		contentPane.add(lblFechaDeCreacin);
		
		JLabel lblFechaDeVencimiento = new JLabel("Fecha de vencimiento:");
		lblFechaDeVencimiento.setBounds(245, 106, 147, 14);
		contentPane.add(lblFechaDeVencimiento);
		
		JLabel lblUltimaActualizacin = new JLabel("Ultima actualizaci\u00F3n:");
		lblUltimaActualizacin.setBounds(245, 131, 124, 14);
		contentPane.add(lblUltimaActualizacin);
		
		JLabel lblFechaDeFinalizacin = new JLabel("Fecha de finalizaci\u00F3n:");
		lblFechaDeFinalizacin.setBounds(245, 156, 124, 14);
		contentPane.add(lblFechaDeFinalizacin);
		
		JLabel lblLocalizacin = new JLabel("Localizaci\u00F3n:");
		lblLocalizacin.setBounds(245, 206, 103, 14);
		contentPane.add(lblLocalizacin);
		
		JLabel lblEmpleadoResponsable = new JLabel("Empleado responsable:");
		lblEmpleadoResponsable.setBounds(245, 181, 147, 14);
		contentPane.add(lblEmpleadoResponsable);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(402, 53, 112, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_0 = new JTextField();
		textField_0.setEditable(false);
		textField_0.setBounds(402, 103, 112, 20);
		contentPane.add(textField_0);
		textField_0.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(402, 78, 112, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(402, 128, 112, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(402, 153, 112, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(402, 178, 112, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(402, 203, 112, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(402, 230, 112, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(259, 261, 89, 23);
		contentPane.add(btnImprimir);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(402, 261, 89, 23);
		contentPane.add(btnAceptar);
	}

}
