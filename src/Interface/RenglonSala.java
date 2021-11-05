package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class RenglonSala extends JPanel {

	private VentanaSala sala;
	private String nombreUser;
	private int cantIntegrantes=0;
	private String nombreSala;
	//private int cantMax =3;
	
	private JLabel lblCantParticipantes;
	private JButton btnUnirse;
	private JButton btnSalir;
	
	public RenglonSala(String nombreSala, String nombreUser) {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		
		setVisible(true);
		
		this.nombreUser=nombreUser;
		this.nombreSala=nombreSala;
		setLayout(new GridLayout(0, 4, 0, 0));
		
		
		JLabel lblNombreSala = new JLabel(this.nombreSala);
		lblNombreSala.setBounds(10, 10, 133, 14);
		add(lblNombreSala);
		
		lblCantParticipantes = new JLabel("0");
		lblCantParticipantes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCantParticipantes.setBounds(155, 10, 31, 14);
		add(lblCantParticipantes);
		
		btnUnirse = new JButton("Unirse");
		btnUnirse.setEnabled(true);
		btnUnirse.setBounds(263, 6, 78, 23);
		add(btnUnirse);
		
		btnSalir = new JButton("Salir");
		btnSalir.setEnabled(false);
		btnSalir.setBounds(351, 6, 89, 23);
		add(btnSalir);
	}
	
	
	public void actionListener() {
		
		btnUnirse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				sala = new VentanaSala(nombreSala, nombreUser);
				sala.setVisible(true);
				btnUnirse.setEnabled(false);
				btnSalir.setEnabled(true);
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sala.setVisible(false);
				sala.dispose();
				
				btnUnirse.setEnabled(true);
				btnSalir.setEnabled(false);
			}
		});
	}
}
