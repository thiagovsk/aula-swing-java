import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ExemploInterface {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	
	public ExemploInterface () {
		preparaGUI();
	}
	
	private void preparaGUI() {
		mainFrame = new JFrame("Exemplo de Iterface em JAVA");
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3,1));
		
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350,100);
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		
		mainFrame.setVisible(true);		
	}
	
	private void meiao() {
		headerLabel.setText("Clique em um do botões!");
		
		JButton okButton = new JButton("OK");
		JButton submeterButton = new JButton("Submeter");
		JButton cancelarButton = new JButton("Cancelar");
		
		okButton.setActionCommand("Ok");
		submeterButton.setActionCommand("Submeter");
		cancelarButton.setActionCommand("Cancelar");
		
		okButton.addActionListener(new ButtonClickListener());
		submeterButton.addActionListener(new ButtonClickListener());
		cancelarButton.addActionListener(new ButtonClickListener());
		
		controlPanel.add(okButton);
		controlPanel.add(submeterButton);
		controlPanel.add(cancelarButton);
	}
	
	private class ButtonClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String comando = e.getActionCommand();
			if(comando.equals("Ok")) {
				statusLabel.setText("Botão OK apertado!!!");
			}
			else if (comando.equals("Submeter")) {
				statusLabel.setText("Submetido!!!");
			}
			else {
				statusLabel.setText("Botão Cancelar apertado!");
			}
		}
	}
	public static void main(String[] args) {
		ExemploInterface exemplo = new ExemploInterface();
		exemplo.meiao();
	}
}
