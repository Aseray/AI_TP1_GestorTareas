package user_interface_layer.windows_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class TareasVencidasNoCompletadas extends JFrame {

	private JPanel contentPane;
	private JTable Jtable;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField;
	private JTextField txtDdmmaaaa;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnImprimir;
	private JButton btnAceptar;
	private JTextField textField_1;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TareasVencidasNoCompletadas frame = new TareasVencidasNoCompletadas();
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
	public TareasVencidasNoCompletadas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 331);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTareasVencidasNo = new JLabel("TAREAS VENCIDAS NO COMPLETADAS");
		lblTareasVencidasNo.setBounds(10, 11, 239, 14);
		contentPane.add(lblTareasVencidasNo);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 43, 183, 231);
		contentPane.add(tabbedPane);
		
		Jtable = new JTable();
		Jtable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		tabbedPane.addTab("ID Tarea", null, Jtable, "");
		
		
		lblNewLabel = new JLabel("ID Tarea:");
		lblNewLabel.setBounds(213, 66, 79, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Fecha de creaci\u00F3n:");
		lblNewLabel_1.setBounds(213, 91, 124, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Fecha de vencimiento:");
		lblNewLabel_2.setBounds(213, 116, 146, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Ultima actualizaci\u00F3n:");
		lblNewLabel_3.setBounds(213, 141, 124, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Localizaci\u00F3n:");
		lblNewLabel_4.setBounds(213, 191, 94, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Empleado responsable:");
		lblNewLabel_5.setBounds(213, 166, 146, 14);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(347, 63, 124, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtDdmmaaaa = new JTextField();
		txtDdmmaaaa.setEditable(false);
		txtDdmmaaaa.setBounds(347, 88, 124, 20);
		contentPane.add(txtDdmmaaaa);
		txtDdmmaaaa.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(347, 113, 124, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(347, 138, 124, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(347, 163, 124, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(227, 251, 89, 23);
		contentPane.add(btnImprimir);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(347, 251, 89, 23);
		contentPane.add(btnAceptar);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(347, 188, 124, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(347, 209, 124, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}
}
