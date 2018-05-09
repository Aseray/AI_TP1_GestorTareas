package user_interface_layer.windows_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 216, 270);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnGestionarTareas = new JButton("Gestionar Tareas");
		btnGestionarTareas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			WindowMenu obj=new WindowMenu();
			obj.setVisible(true);
			}
		});
		contentPane.add(btnGestionarTareas);
		
		
		JButton btnReportes = new JButton("Reportes");
		btnReportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ReportesMenu obj = new ReportesMenu();
				obj.setVisible(true);
			}
		});
		contentPane.add(btnReportes);
		
		JButton btnSync = new JButton("Sync");
		contentPane.add(btnSync);
		
	}
}
