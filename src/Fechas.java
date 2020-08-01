import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Fechas extends JFrame implements ActionListener
{
	JLabel l1, l2, l3;
	JComboBox combo1,combo2, combo3, combo4, combo5, combo6;
	JButton b1;

	
	Fechas ()
	{
		setLayout (null);
		
		Font f1 = new Font ("Serif",1,15);
		Font f2 = new Font ("Serif",1,15);
		
		l1 = new JLabel("Fecha 1:  (DD/MM/AAAA)");
		l1.setBounds(50,50,200,50);
		l1.setFont(f2);
		add(l1);
		
		l2 = new JLabel("Fecha 2:  (DD/MM/AAAA)");
		l2.setBounds(300,50,200,50);
		l2.setFont(f2);
		add(l2);
						
		combo1 = new JComboBox();
		combo1.setBounds(50,120,50,50);
		combo1.setFont(f1);
		for (int i=1; i <=31; i++)
		{
			combo1.addItem(String.valueOf(i));
		}
		add(combo1);
		
		combo2 = new JComboBox();
		combo2.setBounds(120,120,50,50);
		combo2.setFont(f1);
		for (int i=1; i <=12; i++)
		{
			combo2.addItem(String.valueOf(i));
		}
		add(combo2);
		
		combo3 = new JComboBox();
		combo3.setBounds(190,120,60,50);
		combo3.setFont(f1);
		for (int i=1; i <=2019; i++)
		{
			combo3.addItem(String.valueOf(i));
		}
		add(combo3);
		
		combo4 = new JComboBox();
		combo4.setBounds(300,120,50,50);
		combo4.setFont(f1);
		for (int i=1; i <=31; i++)
		{
			combo4.addItem(String.valueOf(i));
		}
		add(combo4);
		
		combo5 = new JComboBox();
		combo5.setBounds(370,120,50,50);
		combo5.setFont(f1);
		for (int i=1; i <=12; i++)
		{
			combo5.addItem(String.valueOf(i));
		}
		add(combo5);
		
		combo6 = new JComboBox();
		combo6.setBounds(440,120,60,50);
		combo6.setFont(f1);
		for (int i=1; i <=2019; i++)
		{
			combo6.addItem(String.valueOf(i));
		}
		add(combo6);
		
		b1 = new JButton ("Verificar");
		b1.setBounds(170,190,210,50);
		b1.setFont(f2);
		b1.addActionListener(this);
		add(b1);
		
		l3=new JLabel ("...",JLabel.CENTER);
		l3.setBounds(50,260,450,50);
		l3.setForeground(Color.green);
		l3.setBackground(Color.black);
		l3.setOpaque(true);
		l3.setFont(f1);
		add(l3);
					
	}
		

		public void actionPerformed (ActionEvent e)
		{
	
			if(e.getSource()==b1)
			{				
				String dia1 = combo1.getSelectedItem().toString();
				String mes1 = combo2.getSelectedItem().toString();
				String anio1 = combo3.getSelectedItem().toString();
								
				String dia2 = combo4.getSelectedItem().toString();
				String mes2 = combo5.getSelectedItem().toString();
				String anio2 = combo6.getSelectedItem().toString();
							
				int d1 = Integer.parseInt(dia1);
				int m1 = Integer.parseInt(mes1);
				int a1 = Integer.parseInt(anio1);
				
				int d2 = Integer.parseInt(dia2);
				int m2 = Integer.parseInt(mes2);
				int a2 = Integer.parseInt(anio2);
												
				if (a1>a2)
					l3.setText("La fecha 1 es mas reciente que la fecha 2.");
				
				if (a2>a1)
					l3.setText("La fecha 2 es mas reciente que la fecha 1.");
				
				if (a1==a2)
				{
					if (m1>m2)
						l3.setText("La fecha 1 es mas reciente que la fecha 2.");
					
					if (m2>m1)
						l3.setText("La fecha 2 es mas reciente que la fecha 1.");
					
					if (m1==m2)
					{
						if (d1>d2)
							l3.setText("La fecha 1 es mas reciente que la fecha 2.");
						
						if (d2>d1)
							l3.setText("La fecha 2 es mas reciente que la fecha 1.");
						
						if (d1==d2)
							l3.setText("La fecha 1 es igual que la fecha 2.");
					}
											
				}
				
			}
							
		}
		
		
	public static void main(String[] args)
		{
			Fechas f1 = new Fechas ();
			f1.setBounds (300,300,550,360);
			f1.setTitle("Comparador de fechas");
			f1.setVisible(true);
			f1.setResizable(true);
		}

}