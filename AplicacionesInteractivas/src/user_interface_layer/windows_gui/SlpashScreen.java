package user_interface_layer.windows_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.JLabel;

public class SlpashScreen extends JFrame {
	
	private Timer t;
	private ActionListener al;
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SlpashScreen frame = new SlpashScreen();
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
	public SlpashScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(0, 386, 434, 25);
		contentPane.add(progressBar);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\f\\eclipse-workspace\\GestorTareas\\img\\imagen (2).jpg"));
		label.setBounds(0, 0, 434, 386);
		contentPane.add(label);
		

	}
}
