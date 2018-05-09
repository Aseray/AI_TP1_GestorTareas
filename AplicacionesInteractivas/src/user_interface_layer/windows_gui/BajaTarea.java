package user_interface_layer.windows_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BajaTarea extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BajaTarea frame = new BajaTarea();
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
	public BajaTarea() {
		setTitle("ELIMINAR TAREA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 255, 156);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdTarea = new JLabel("ID Tarea");
		lblIdTarea.setBounds(38, 36, 64, 14);
		contentPane.add(lblIdTarea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(98, 33, 101, 20);
		contentPane.add(comboBox);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(136, 80, 89, 23);
		contentPane.add(btnEliminar);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 80, 89, 23);
		contentPane.add(btnNewButton);
	}

}
