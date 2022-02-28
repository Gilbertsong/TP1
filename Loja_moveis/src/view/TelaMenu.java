package view;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaMenu  implements ActionListener{
	
	private static JFrame janela = new JFrame("LOJA MÓVEIS");
	private static JLabel titulo = new JLabel("MENU PRINCIPAL");
	private static JButton cliente = new JButton("CLIENTE");
	private static JButton funcionario = new JButton("FUNCIONARIO");
	
	
	
	public TelaMenu() {
		
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 150, 30);
		cliente.setBounds(140, 100, 100, 30);
		funcionario.setBounds(140, 150, 100, 30);
		
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(cliente);
		janela.add(funcionario);
		
		janela.setSize(400, 250);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		cliente.addActionListener(null);
		
	}

}
