package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaSala extends JFrame {

	private JPanel contentPane;
	private String nombreUser;
	private int cantParicipanes=0;

	
	public VentanaSala(String titulo, String nombreUser) {
		setTitle(titulo);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 492, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.nombreUser= nombreUser;
		
		JTextArea textAreaChat = new JTextArea();
		textAreaChat.setEditable(false);
		textAreaChat.setBounds(10, 11, 307, 320);
		
		
		JTextArea textAreaMiMnsj = new JTextArea();
		textAreaMiMnsj.setBounds(10, 368, 220, 37);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mensaje = textAreaMiMnsj.getText();
				if(!mensaje.isBlank()) {
					
					textAreaChat.append("-" + nombreUser + ":\n" + mensaje + "\n\n");
					
					textAreaMiMnsj.setText("");
					
				}
				
			}
		});
		btnEnviar.setBounds(240, 368, 77, 37);
		contentPane.add(btnEnviar);
		
		JScrollPane scrollChat = new JScrollPane(textAreaChat);
		scrollChat.setBounds(10, 11, 323, 335);
		scrollChat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollChat);
		
		JScrollPane scrollMiMnsj = new JScrollPane(textAreaMiMnsj);
		scrollMiMnsj.setBounds(10, 361, 226, 49);
		contentPane.add(scrollMiMnsj);
	}
}
