package Tarea_03_Layout;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;

public class Ejemplo_05_a extends JFrame implements ActionListener{
	static JLabel La,Lb,Lc;
	static JButton Bcalcular, Bsalir;
	static JTextField Ta,Th,Tb;
	public Ejemplo_05_a()
	{
		this.setLayout(new FlowLayout(FlowLayout.CENTER,3,3));
		//Instancia un objeto FLowKayout object alineando al centro y con una separacion de 3px en horizontal y vertical.
		this.setTitle("Layout FlowLayout Center");
		this.setBounds(10,10,550,100);
		La = new JLabel("Altura--->");
		Lb = new JLabel("Base--->");
		Lc = new JLabel("EL Area--->");
		Th = new JTextField("     ");
		Tb = new JTextField("     ");
		Ta = new JTextField("     ");
		Ta.setEditable(false);
		Bcalcular = new JButton();
		Bcalcular.setText("Calcular");
		Bcalcular.addActionListener(this);
		Bsalir = new JButton();
		Bsalir.setText("Salir");
		Bsalir.addActionListener(this);
		this.add(La);
		this.add(Th);
		this.add(Lb);
		this.add(Tb);
		this.add(Bcalcular);
		this.add(Lc);
		this.add(Ta);
		this.add(Bsalir);
	}
	@Override 
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == Bcalcular) {
			double h,b,a;
			String Sh,Sb;
			Sh = Th.getText();
			Sb = Tb.getText();
			if ( !Sh.isEmpty()&&!Sb.isEmpty())
{ 
				h = Double.parseDouble(Sh);
				b = Double.parseDouble(Sb);
				a = ((h*b)/2);
				Ta.setText(String.valueOf(a));
}
			else JOptionPane.showMessageDialog(this, "Lo siento un o dos textos estan vacios");
		}
		else if ( e.getSource() == Bsalir)
		{
			System.exit(0);
		}
	}
	public static void main (String parametro [])
	{
		Ejemplo_05_a ventana = new Ejemplo_05_a();
		ventana.setVisible(true);
	}
}