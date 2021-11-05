package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textFieldMiNombre;
	private String NombreUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//dasdasd
	/**
	 * Create the frame.
	 */
	
	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inserte nombre:");
		lblNewLabel.setBounds(10, 11, 88, 14);
		contentPane.add(lblNewLabel);
		
		textFieldMiNombre = new JTextField();
		textFieldMiNombre.setBounds(108, 8, 86, 20);
		contentPane.add(textFieldMiNombre);
		textFieldMiNombre.setColumns(10);
		
		PanelSalas PnlSalas = new PanelSalas();
		PnlSalas.setVisible(false);
		contentPane.add(PnlSalas);
		
		JButton btnIniciar = new JButton("Iniciar");
		
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NombreUser=textFieldMiNombre.getText();
				
				if(!NombreUser.isBlank()) {
					PnlSalas.setVisible(true);
					PnlSalas.setNombreUser(NombreUser);
				}
			}
		});
		
		btnIniciar.setBounds(246, 7, 89, 23);
		contentPane.add(btnIniciar);
		
	}
}
