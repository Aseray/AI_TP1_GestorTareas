package user_interface_layer.windows_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JButton;

public class SeguimientoDeTarea extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeguimientoDeTarea frame = new SeguimientoDeTarea();
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
	public SeguimientoDeTarea() {
		setTitle("Seguimiento de Tarea");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 263, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdTarea = new JLabel("ID Tarea");
		lblIdTarea.setBounds(10, 11, 67, 14);
		contentPane.add(lblIdTarea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(87, 8, 68, 20);
		contentPane.add(comboBox);
		
		JLabel lblProgreso = new JLabel("Progreso");
		lblProgreso.setBounds(10, 88, 73, 14);
		contentPane.add(lblProgreso);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(87, 88, 146, 14);
		contentPane.add(progressBar);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(10, 48, 46, 14);
		contentPane.add(lblEstado);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(87, 45, 68, 20);
		contentPane.add(comboBox_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 125, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(119, 125, 89, 23);
		contentPane.add(btnGuardar);
	}
}
