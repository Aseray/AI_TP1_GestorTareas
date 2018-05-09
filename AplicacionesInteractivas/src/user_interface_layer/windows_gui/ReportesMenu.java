package user_interface_layer.windows_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReportesMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportesMenu frame = new ReportesMenu();
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
	public ReportesMenu() {
		setTitle("Reportes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 211);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Tareas vencidas NO completadas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TareasVencidasNoCompletadas obj = new TareasVencidasNoCompletadas();
				obj.setVisible(true);
			}
		});
		btnNewButton.setBounds(39, 24, 360, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tareas realizadas con atraso");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TareasRealizadasConAtraso obj = new TareasRealizadasConAtraso();
				obj.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(39, 58, 360, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Promedio de tareas realizadas por equipo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PromedioDeTareasRealizadasPorEquipo obj = new PromedioDeTareasRealizadasPorEquipo();
				obj.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(39, 92, 360, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Tareas incompletas NO monitoreadas en ultima semana");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton_3.setBounds(39, 126, 360, 23);
		contentPane.add(btnNewButton_3);
	}

}
