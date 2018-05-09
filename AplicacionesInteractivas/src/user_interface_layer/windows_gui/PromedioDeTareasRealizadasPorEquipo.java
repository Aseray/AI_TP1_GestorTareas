package user_interface_layer.windows_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class PromedioDeTareasRealizadasPorEquipo extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PromedioDeTareasRealizadasPorEquipo frame = new PromedioDeTareasRealizadasPorEquipo();
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
	public PromedioDeTareasRealizadasPorEquipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 28, 263, 222);
		contentPane.add(tabbedPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		tabbedPane.addTab("ID Tarea", null, table, null);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		JLabel lblPromedioDeTareas = new JLabel("PROMEDIO DE TAREAS REALIZADAS POR EQUIPO");
		lblPromedioDeTareas.setBounds(10, 3, 263, 14);
		contentPane.add(lblPromedioDeTareas);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(20, 261, 89, 23);
		contentPane.add(btnImprimir);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(155, 261, 89, 23);
		contentPane.add(btnAceptar);
	}
}
