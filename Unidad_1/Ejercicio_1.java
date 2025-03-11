package Ejercicios_Clase;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ejercicio_1 extends JFrame {

	private static final long serieVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textBuscar;
	private JButton btnAgregar;
	private JTable table;
	private JButton btnBuscar;
	private JButton btnEliminar;
	private JButton Modificar;
	private JButton Salir;
	
	public Ejercicio_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0,150,0,0,0,0,0,0,};
		gbl_contentPane.rowHeights = new int[] {0,0,0,0,0};
		gbl_contentPane.columnWeights = new double[] {0.0,1.0,0.0,0.0,0.0,0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[] {0.0,1.0,0.0,0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textBuscar = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0,0,5,5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textBuscar, gbc_textField);
		textBuscar.setColumns(10);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 5;
		gbc_table.insets = new Insets(0,0,5,5);
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 1;
		gbc_table.gridy = 1;
		contentPane.add(table, gbc_table);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0,0,5,5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		contentPane.add(btnAgregar, gbc_btnNewButton);
		
		btnBuscar = new JButton("Buscar");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0,0,5,5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 2;
		contentPane.add(btnBuscar, gbc_btnNewButton_1);
		
		btnEliminar = new JButton("Buscar");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0,0,5,5);
		gbc_btnNewButton_2.gridx = 3;
		gbc_btnNewButton_2.gridy = 2;
		contentPane.add(btnEliminar, gbc_btnNewButton_2);
		
		Modificar = new JButton("Modificar");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 4;
		gbc_btnNewButton_3.gridy = 2;
		contentPane.add(Modificar, gbc_btnNewButton_3);
		
		Salir = new JButton("Salir");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 5;
		gbc_btnNewButton_4.gridy = 3;
		contentPane.add(Salir, gbc_btnNewButton_4);
		
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getModificar() {
		return Modificar;
	}

	public JTextField getTextBuscar() {
		return textBuscar;
	}
	
}
