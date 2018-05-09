package user_interface_layer.windows_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowMenu frame = new WindowMenu();
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
	public WindowMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNuevaTarea = new JButton("Nueva Tarea");
		btnNuevaTarea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaTarea obj = new AltaTarea();
				obj.setVisible(true);
			}
		});
		
		JButton btnSeguimientoDeTareas = new JButton("Seguimiento de Tareas");
		btnSeguimientoDeTareas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SeguimientoDeTarea obj = new SeguimientoDeTarea();
				obj.setVisible(true);
			}
		});
		contentPane.add(btnSeguimientoDeTareas);
		contentPane.add(btnNuevaTarea);
		
		JButton btnModificarTarea = new JButton("Modificar Tarea");
		btnModificarTarea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarTarea obj = new ModificarTarea();
				
				obj.setVisible(true);
				
			}
		});
		contentPane.add(btnModificarTarea);
		
		JButton btnEliminarTarea = new JButton("Eliminar Tarea");
		btnEliminarTarea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BajaTarea obj = new BajaTarea();
				obj.setVisible(true);
				
			}
		});
		contentPane.add(btnEliminarTarea);
	}

}
