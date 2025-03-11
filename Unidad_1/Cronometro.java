package Tarea_005_Relogyrelogdual;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cronometro extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel PanelPrincipal;
	private JTextField Tiniciar , Tdetener , Ttranscurrido;
	private JButton Bdetener,Bsalir,Biniciar;
	private long tiempoinicio, tiempodetener;
	private double tiempotranscurrido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cronometro frame = new Cronometro();
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
	public Cronometro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 169);
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelPrincipal);
		GridBagLayout gbl_panelPrincipal = new GridBagLayout();
		gbl_panelPrincipal.columnWidths = new int[] {118, 118, 118, 0};
		gbl_panelPrincipal.rowHeights = new int[] {37, 37, 37, 0};
		gbl_panelPrincipal.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelPrincipal.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		PanelPrincipal.setLayout(gbl_panelPrincipal);
		
		Biniciar = new JButton("Iniciar");
		GridBagConstraints gbc_BIniciar = new GridBagConstraints();
		gbc_BIniciar.insets = new Insets(0, 0, 5, 5);
		gbc_BIniciar.gridx = 0;
		gbc_BIniciar.gridy = 0;
		PanelPrincipal.add(Biniciar, gbc_BIniciar);
		Biniciar.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("Iniciar");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		PanelPrincipal.add(lblNewLabel, gbc_lblNewLabel);
		
		Tiniciar = new JTextField();
		GridBagConstraints gbc_tiniciar = new GridBagConstraints();
		gbc_tiniciar.insets = new Insets(0, 0, 5, 0);
		gbc_tiniciar.fill = GridBagConstraints.HORIZONTAL;
		gbc_tiniciar.gridx = 2;
		gbc_tiniciar.gridy = 0;
		PanelPrincipal.add(Tiniciar, gbc_tiniciar);
		Tiniciar.setColumns(10);
		
		Bdetener = new JButton("Detener");
		GridBagConstraints gbc_BDetener = new GridBagConstraints();
		gbc_BDetener.insets = new Insets(0, 0, 5, 5);
		gbc_BDetener.gridx = 0;
		gbc_BDetener.gridy = 1;
		PanelPrincipal.add(Bdetener, gbc_BDetener);
		this.Bdetener.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("Detenerse");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		PanelPrincipal.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		Tdetener = new JTextField();
		GridBagConstraints gbc_tdetener = new GridBagConstraints();
		gbc_tdetener.insets = new Insets(0, 0, 5, 0);
		gbc_tdetener.fill = GridBagConstraints.HORIZONTAL;
		gbc_tdetener.gridx = 2;
		gbc_tdetener.gridy = 1;
		PanelPrincipal.add(Tdetener, gbc_tdetener);
		Tdetener.setColumns(10);
		
		Bsalir = new JButton("Salida");
		GridBagConstraints gbc_Bsalir = new GridBagConstraints();
		gbc_Bsalir.insets = new Insets(0, 0, 0, 5);
		gbc_Bsalir.gridx = 0;
		gbc_Bsalir.gridy = 2;
		PanelPrincipal.add(Bsalir, gbc_Bsalir);
		
		JLabel lblNewLabel_2 = new JLabel("Tiempo Transcurrido en Seg");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 2;
		PanelPrincipal.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		Ttranscurrido = new JTextField();
		GridBagConstraints gbc_ttranscurrido = new GridBagConstraints();
		gbc_ttranscurrido.fill = GridBagConstraints.HORIZONTAL;
		gbc_ttranscurrido.gridx = 2;
		gbc_ttranscurrido.gridy = 2;
		PanelPrincipal.add(Ttranscurrido, gbc_ttranscurrido);
		Ttranscurrido.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == Biniciar) 
		{
			this.tiempoinicio = System.currentTimeMillis();
			this.Tiniciar.setText(String.valueOf(this.tiempoinicio));
			this.Tdetener.setText("");
			this.Ttranscurrido.setText("");
		} 
		else 
			if (e.getSource() == Bdetener) 
			{
				this.tiempodetener = System.currentTimeMillis();
				this.Tdetener.setText(String.valueOf(tiempodetener));
				this.tiempotranscurrido = ( this.tiempodetener - this.tiempoinicio ) / 1000;
				this.Ttranscurrido.setText(String.valueOf( ( this.tiempodetener - this.tiempoinicio ) / 1000 ) );
			}
			else 
				if ( e.getSource() == Bsalir) {
					this.dispose();
				}
		
	}

}
