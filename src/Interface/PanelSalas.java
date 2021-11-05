package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelSalas extends JPanel {
	private JTextField textFieldNombreSala;
	
	private int cantSalas =0;
	private String nombreUser;
	private int cantMaxSalas=3;
	
	
	
	/**
	 * Create the panel.
	 */
	public PanelSalas() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		
		setBounds(0, 45, 602, 352);
		setLayout(null);
		
		textFieldNombreSala = new JTextField();
		textFieldNombreSala.setBounds(10, 321, 132, 20);
		add(textFieldNombreSala);
		textFieldNombreSala.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Crear Sala");
		lblNewLabel.setBounds(10, 299, 86, 14);
		add(lblNewLabel);
		
		JButton btnCrearSala = new JButton("Crear");
		btnCrearSala.setBounds(152, 320, 89, 23);
		add(btnCrearSala);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 602, 293);
		add(scrollPane);
		
		JPanel panel = new JPanel();
		
		panel.setBounds(0, 0, 602, 294);
		scrollPane.setViewportView(panel);
		//add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		btnCrearSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String nombreSala = textFieldNombreSala.getText();
				if (! nombreSala.isBlank()) {
					
					RenglonSala sala = new RenglonSala(nombreSala, nombreUser);
					panel.add(sala);
					sala.setBounds(0, cantSalas*34, 602, 34);
					panel.updateUI();
					
					cantSalas++;
					sala.actionListener();
				}
				
			}
		});
	}

	public void setNombreUser(String nombreUser) {
		this.nombreUser = nombreUser;
	}
}
