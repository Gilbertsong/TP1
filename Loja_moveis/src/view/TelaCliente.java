package view;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaCliente implements ActionListener {
	
	private static JFrame janela = new JFrame("CLIENTE");
	private static JPanel panel = new JPanel();
	private static JPanel panel1 = new JPanel();
	private static JPanel panel2 = new JPanel();
	private static JLabel titulo = new JLabel("Cliente");
	private static JLabel label1 = new JLabel("Dados de Cliente");
	private static JLabel label2 = new JLabel("Consulta de Cliente");
	private static JButton pesquisar = new JButton("Pesquisar");
	private static JButton excluir = new JButton("Excluir");
	private static JButton salvar = new JButton("Salvar");
	private static JButton editar = new JButton("Editar");
	private static JButton adicionar = new JButton("Adicionar");
	private static JTabbedPane tabbed = new JTabbedPane(JTabbedPane.TOP); 
	private static JTextField  texto1 = new JTextField(10); 
	
	
	
	public TelaCliente() {
		
		titulo.setFont(new Font("Arial", Font.BOLD, 30));
		titulo.setBounds(40, 10, 150, 60);
		pesquisar.setBounds(140, 300, 100, 30);
		texto1.setBounds(50, 500, 100, 30);
		excluir.setBounds(140, 150, 100, 30);
		salvar.setBounds(40, 400, 100, 30);
		editar.setBounds(40, 170, 100, 30);
		adicionar.setBounds(40, 220, 100, 30);
		panel.setBackground(Color.green);
		panel.setBounds(0, 0, 890, 90);
		tabbed.setBounds(10, 130, 850, 400);
		
		
		panel1.add(label1);
		panel1.add(texto1);
		panel2.add(label2);
		
		tabbed.add("Dados de Cliente", panel1);
		tabbed.add("Consulta de Cliente", panel2);
		
		janela.setLayout(null);
		janela.setResizable(false);
		
		janela.add(titulo);
		janela.add(pesquisar);
		janela.add(excluir);
		janela.add(salvar);
		janela.add(editar);
		janela.add(adicionar);
		janela.add(panel);
		janela.add(tabbed);
		
		
		janela.setSize(900, 600);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		pesquisar.addActionListener(null);
		
	}

}
